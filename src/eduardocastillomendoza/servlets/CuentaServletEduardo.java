package eduardocastillomendoza.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eduardocastillomendoza.constructores.CuentaBancaria;

/**
 * Servlet implementation class CuentaServletEduardo
 */
@WebServlet("/cuentaServletEduardo")
public class CuentaServletEduardo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static List<CuentaBancaria> cuentaBancaria = new ArrayList<>();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CuentaServletEduardo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(cuentaBancaria.toString()).append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String usuario = request.getParameter("usuario");
		String numeroCuenta = request.getParameter("numCuenta");
		String claveBanco = request.getParameter("claveBanco");
		String saldoInicial = request.getParameter("saldoInicial");
		String contrasena = request.getParameter("pass");
		
		CuentaBancaria nuevaCuenta = new CuentaBancaria();
		
		nuevaCuenta.setId(cuentaBancaria.size() + 1);
		nuevaCuenta.setUsuario(usuario);
		nuevaCuenta.setNumCuenta(numeroCuenta);
		nuevaCuenta.setClaveBanco(claveBanco);
		nuevaCuenta.setSaldo(Double.parseDouble(saldoInicial));
		nuevaCuenta.setContrasena(contrasena);
		
		cuentaBancaria.add(nuevaCuenta);
	}

}
