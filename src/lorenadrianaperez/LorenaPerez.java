package lorenadrianaperez;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LorenaPerez
 */
@WebServlet("/LorenaPerez")
public class LorenaPerez extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private List<Producto> productos = new ArrayList<Producto>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LorenaPerez() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(productos.toString()).append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nparte = request.getParameter("nparte");
		String descripcion = request.getParameter("descripcion");
		String proveedor = request.getParameter("proveedor");
		int aduana = Integer.parseInt(request.getParameter("aduana"));
		int patente = Integer.parseInt(request.getParameter("patente"));
		int pedimento = Integer.parseInt(request.getParameter("pedimento"));
		
		String procedencia = request.getParameter("procedencia");
		
		System.out.println(":::: Registro de un nuevo producto ::::");
		
		Producto nuevoProducto = new Producto(nparte, descripcion, proveedor, aduana, patente, pedimento, procedencia);
		
		productos.add(nuevoProducto);
		
		System.out.println(productos);
	}

}
