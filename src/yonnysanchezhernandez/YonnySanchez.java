package yonnysanchezhernandez;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class YonnySanchez
 */
@WebServlet("/YonnySanchez")
public class YonnySanchez extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static List<registroInquilinos> inquilinos = new ArrayList<registroInquilinos>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public YonnySanchez() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("::: Entro al metdo GET :::");
				// TODO Auto-generated method stub
				response.getWriter().
				append("Inquilinos Registrados: ").
				append(inquilinos.toString()).
				append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
				System.out.println("::: Entro al metodo POST :::");
				
				int idInquilino = inquilinos.size() + 1;
				String nombre = request.getParameter("nombre").toUpperCase();
				String apPaterno = request.getParameter("apPaterno").toUpperCase();
				String apMaterno = request.getParameter("apMaterno").toUpperCase();
				int edad = Integer.parseInt(request.getParameter("edad"));
				String sexo = request.getParameter("sexo").toUpperCase();
				String inmueble = request.getParameter("inmueble").toUpperCase();
				String direccion = request.getParameter("direccion").toUpperCase();
				LocalDate fechaIngreso = LocalDate.now();
				
		
				registroInquilinos nuevoInquilino = new registroInquilinos(idInquilino,nombre,apPaterno,apMaterno,edad,sexo,inmueble,direccion,fechaIngreso);
				
				/*nuevoInquilino.setIdInquilino(inquilinos.size() + 1);
			 	nuevoInquilino.setNombre(request.getParameter("nombre").toUpperCase());
				nuevoInquilino.setApPaterno(request.getParameter("apPaterno").toUpperCase());
				nuevoInquilino.setApMaterno(request.getParameter("apMaterno").toUpperCase());
				nuevoInquilino.setEdad(Integer.parseInt(request.getParameter("edad")));
				nuevoInquilino.setSexo(request.getParameter("sexo").toUpperCase());
				nuevoInquilino.setInmueble(request.getParameter("inmueble").toUpperCase());
				nuevoInquilino.setDireccion(request.getParameter("direccion").toUpperCase());
				nuevoInquilino.setFechaIngreso(LocalDate.now());
				*/
				System.out.println("Nuevo Inquilino: ");
				System.out.println(nuevoInquilino);
				inquilinos.add(nuevoInquilino);
	}

}
