package MarcosLopez.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MarcosLopez.model.Producto;

/**
 * Servlet implementation class MarcosLopez
 */
@WebServlet("/MarcosLopezRegistroProducto")
public class ProductoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductoController() {
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
		
		System.out.println(":::Entro al metodo Post:::");
		Producto producto = new Producto();
		
		producto.setNombre(request.getParameter("nombre"));
		producto.setDescripcion(request.getParameter("descripcion"));
		producto.setPrecio(Integer.parseInt(request.getParameter("precio")));
		producto.setStock(Integer.parseInt(request.getParameter("stock")));
		producto.setFabricante(request.getParameter("fabricante"));
		
		System.out.println("Producto registrado: " + producto.toString());
	}

}
