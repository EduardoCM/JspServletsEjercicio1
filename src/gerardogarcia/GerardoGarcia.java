package gerardogarcia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import gerardogarcia.RequisitosPacientes;

/**
 * Servlet implementation class GerardoGarcia
 */
@WebServlet("/GerardoGarcia")
public class GerardoGarcia extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private List<RequisitosPacientes> requisitos = new ArrayList<RequisitosPacientes>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GerardoGarcia() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(requisitos.toString()).append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		System.out.println("Entro al metodo doPost");
		String nombre = request.getParameter("nombre");
		String curp = request.getParameter("curp");
		String sexo = request.getParameter("sexo");
		String civil = request.getParameter("civil");
		String sangre = request.getParameter("sangre");
		int edad =Integer.parseInt(request.getParameter("edad"));
		
		System.out.println("Registro de usuario");
		RequisitosPacientes nuevore = new RequisitosPacientes(nombre, curp, sexo, civil, sangre, edad);
		
		requisitos.add(nuevore);
		System.out.println(requisitos);
			
	}

}
