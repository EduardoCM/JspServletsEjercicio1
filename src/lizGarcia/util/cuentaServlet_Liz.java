package lizGarcia.util;

import java.awt.List ;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cuentaServlet_Liz
 */
@WebServlet("/cuentaServlet_Liz")
public class cuentaServlet_Liz extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List <cuentaBancaria_Liz> listCuentaBancaria = new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cuentaServlet_Liz() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		String usuario = request.getParameter("lblUsuario");
		String cuenta = request.getParameter("lblNumCuenta");
		String claveBanco = request.getParameter("slBancos");
		String saldo = request.getParameter("lblSaldo");
		String pswd = request.getParameter("lblPassword");
		
		cuentaBancaria_Liz cuenta_Liz = new cuentaBancaria_Liz();
		
		cuenta_Liz.setIdCuenta();
		
		
	}

}
