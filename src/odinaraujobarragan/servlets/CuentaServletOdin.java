package odinaraujobarragan.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import odinaraujobarragan.constructores.CuentaBancaria;

/**
 * Servlet implementation class CuentaServletOdin
 */
@WebServlet("/cuentaServletOdin")
public class CuentaServletOdin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static List<CuentaBancaria> listaCuentasBancarias = new ArrayList<>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CuentaServletOdin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String numeroCuenta = request.getParameter("numeroCuenta");
		String claveBanco = request.getParameter("claveBanco");
		String saldoInicial = request.getParameter("saldoInicial");
		String contrasena = request.getParameter("contrasena");
		
		CuentaBancaria nuevaCuenta = new CuentaBancaria();
		
		nuevaCuenta.setIdCuentaBancaria(listaCuentasBancarias.size()+1);
		nuevaCuenta.setUsuario(usuario);
		nuevaCuenta.setNumCuenta(numeroCuenta);
		nuevaCuenta.setSaldo(Double.parseDouble(saldoInicial));
		nuevaCuenta.setContrasena(contrasena);
		
		listaCuentasBancarias.add(nuevaCuenta);
	}

}
