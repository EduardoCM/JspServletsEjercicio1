package org.ipn.escom.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ipn.escom.model.Persona;
import org.ipn.escom.model.Propietario;
import org.ipn.escom.model.Vehiculo;

/**
 * Servlet implementation class RegistroVehicularController
 */
@WebServlet("/RegistroVehicular")
public class RegistroVehicularController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private List<Propietario> propietarios = new ArrayList<Propietario>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistroVehicularController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Propietarios:\n").append(propietarios.toString()).append("Vehiculos\n").append(vehiculos.toString()).append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Propietario propietarioNuevo = new Propietario();
		propietarioNuevo.setNombre(request.getParameter("nombre"));
		propietarioNuevo.setApellidoPeterno(request.getParameter("paterno"));
		propietarioNuevo.setApellidoMaterno(request.getParameter("materno"));
		propietarioNuevo.setFechaNacimiento(request.getParameter("fechaNacimiento"));
		propietarioNuevo.setClaveElector(request.getParameter("claveElector"));
		propietarioNuevo.setSexo(request.getParameter("sexo"));
		propietarioNuevo.setIdPropietario(propietarios.size() + 1);
		propietarios.add(propietarioNuevo);
		System.out.println(":::::::::::: PROPIETARIOS ::::::::::");
		System.out.println(propietarios.toString());

		Vehiculo vehiculoNuevo = new Vehiculo();
		vehiculoNuevo.setColor(request.getParameter("color"));
		vehiculoNuevo.setIdVehiculo(vehiculos.size() + 1);
		vehiculoNuevo.setMarca(request.getParameter("marca"));
		vehiculoNuevo.setModelo(request.getParameter("modelo"));
		vehiculoNuevo.setPlaca(request.getParameter("placa"));
		vehiculoNuevo.setPropietario(propietarioNuevo);
		vehiculoNuevo.setTipoVehiculo(request.getParameter("nombre"));
		vehiculos.add(vehiculoNuevo);
		System.out.println(":::::::::::: VEHICULOS ::::::::::");
		System.out.println(vehiculos.toString());
		

		doGet(request, response);
	}

}
