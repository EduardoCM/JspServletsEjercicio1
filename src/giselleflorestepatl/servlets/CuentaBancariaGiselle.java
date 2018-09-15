package giselleflorestepatl.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import giselleflorestepatl.constructores.CuentaBancaria;

/**
 * Servlet implementation class CuentaBancariaGiselle
 */
@WebServlet("/cuentaBancariaGiselle")
public class CuentaBancariaGiselle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static List<CuentaBancaria> cuentas = 
			new ArrayList<CuentaBancaria>();
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CuentaBancariaGiselle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operacion = request.getParameter("op");
		String idCuenta = request.getParameter("idCuenta");
		
		if(operacion.equals("eliminar")) {
			cuentas.remove(Integer.parseInt(idCuenta));
			request.getRequestDispatcher("/jsp/GiselleFlores/GiselleBanco.jsp").forward(request, response);
		}
		else {
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Se crea un objeto para almacenar la informacion, por medio del constructor
				CuentaBancaria nuevaCuenta = new CuentaBancaria();
				nuevaCuenta.setId(cuentas.size() + 1);
				nuevaCuenta.setUsuario(request.getParameter("usuario"));
				nuevaCuenta.setNumCuenta(request.getParameter("numCuenta"));
				nuevaCuenta.setClaveBanco(request.getParameter("claveBanco"));
				nuevaCuenta.setContrasena(request.getParameter("contrasena"));
				nuevaCuenta.setSaldo(Double.parseDouble(request.getParameter("saldo")));
						
				System.out.println("Cuenta registrada:" + nuevaCuenta);		
				cuentas.add(nuevaCuenta);
				
				//Para mandar informacion al jsp
				//identificador, lista
				request.setAttribute("cuentas", cuentas);
				request.getRequestDispatcher("/jsp/GiselleFlores/GiselleBanco.jsp").forward(request, response);
	}
}
