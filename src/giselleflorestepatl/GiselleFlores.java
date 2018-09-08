package giselleflorestepatl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class GiselleFlores
 */
@WebServlet("/GiselleFlores")
public class GiselleFlores extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static List<Libros> libros = 
			new ArrayList<Libros>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GiselleFlores() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Se consultan los libros almacenados durante la ejecucion
		System.out.println("Entro a metodo GET");

		response.getWriter()
		.append("Libros Registrados: ")
		.append(libros.toString())
		.append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(":::: ENTRO A doPost ::::");
		//Se crea un objeto de tipo libro para almacenar la informacion, por medio del constructor
		Libros nuevoLibro = new Libros(request.getParameter("nombreAutor"), 
				Integer.parseInt(request.getParameter("anioPublicacion")),
				request.getParameter("titulo"),
				request.getParameter("lugar"),
				request.getParameter("editorial"));
		
		System.out.println("Libro registrado:" + nuevoLibro);		
		libros.add(nuevoLibro);
	}

}
