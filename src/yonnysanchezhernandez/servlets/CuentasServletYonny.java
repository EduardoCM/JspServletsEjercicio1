package yonnysanchezhernandez.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import yonnysanchezhernandez.constructores.CuentaBancaria;

/**
 * Servlet implementation class CuentasServletYonny
 */
@WebServlet("/cuentasServletYonny")
public class CuentasServletYonny extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static List<CuentaBancaria> cuentasBancarias = new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CuentasServletYonny() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.getWriter().append("Served at: ").append(cuentasBancarias.toString()).append(request.getContextPath());
		String operacion = request.getParameter("op");
		int idEliminar = Integer.parseInt(request.getParameter("idCuenta"));
		
			if(operacion.equals("eliminar")) {
				cuentasBancarias.remove(idEliminar-1);
				request.setAttribute("cuentasBancarias", cuentasBancarias);
				request.getRequestDispatcher("/jsp/YonnySanchez/YonnyBanco.jsp").forward(request, response);
			}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		System.out.println("Entro al metodo POST");
		
		String usuario = request.getParameter("usuario");
		String numCuenta = request.getParameter("numCuenta");
		String claveBanco = request.getParameter("claveBanco");
		String saldoInicial = request.getParameter("saldoInicial");
		String contrasena = request.getParameter("pass");
		
		CuentaBancaria nuevaCuenta = new CuentaBancaria();
		
		nuevaCuenta.setId(cuentasBancarias.size() +1 );
		nuevaCuenta.setUsuario(usuario);
		nuevaCuenta.setNumCuenta(numCuenta);
		nuevaCuenta.setClaveBanco(claveBanco);
		nuevaCuenta.setSaldo(Double.parseDouble(saldoInicial));
		nuevaCuenta.setContrasena(contrasena);
		
		cuentasBancarias.add(nuevaCuenta);
		
		request.setAttribute("cuentasBancarias", cuentasBancarias);
		
		request.getRequestDispatcher("/jsp/YonnySanchez/YonnyBanco.jsp")
		.forward(request, response);
		
	}

}

