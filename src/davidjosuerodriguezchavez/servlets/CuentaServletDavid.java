package davidjosuerodriguezchavez.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import davidjosuerodriguezchavez.constructores.BancosEnum;
import davidjosuerodriguezchavez.constructores.CuentaBancaria;

@WebServlet("/cuentaServletDavid")
public class CuentaServletDavid extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static List<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();

	public CuentaServletDavid() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String operacion = request.getParameter("op");
		int idEliminar = Integer.parseInt(request.getParameter("idCuenta"));
		
		if(operacion.equals("eliminar")) {
			cuentas.remove(idEliminar-1);
			request.setAttribute("cuentas", cuentas);
			request.getRequestDispatcher("/jsp/DavidRodriguez/DavidRodriguez.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		String banco = request.getParameter("banco");
		String numCuenta = request.getParameter("numCuenta");
		double saldo = Double.parseDouble(request.getParameter("saldo"));

		CuentaBancaria cuenta = new CuentaBancaria(usuario, numCuenta, saldo);
		cuenta.setId(cuentas.size() + 1);
		switch (banco) {
		case "BANAMEX":
			cuenta.setClaveBanco(BancosEnum.BANAMEX);
			break;
		case "BANCOMER":
			cuenta.setClaveBanco(BancosEnum.BANCOMER);
			break;
		case "SANTANDER":
			cuenta.setClaveBanco(BancosEnum.SANTANDER);
			break;
		case "HSBC":
			cuenta.setClaveBanco(BancosEnum.HSBC);
			break;
		default:
			break;
		}
		cuenta.setPassword(password);

		cuentas.add(cuenta);
		
		request.setAttribute("cuentas", cuentas);
		request.getRequestDispatcher("/jsp/DavidRodriguez/DavidRodriguez.jsp").forward(request, response);
	}

}
