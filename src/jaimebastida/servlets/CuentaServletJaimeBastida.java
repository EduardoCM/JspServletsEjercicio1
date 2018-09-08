package jaimebastida.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jaimebastida.constructores.CuentaBancaria;
import java.util.List;
import java.util.ArrayList;

/**
 * Servlet implementation class ControllerBanco
 */
@WebServlet("/controllerBancoJaimeBastida")
public class CuentaServletJaimeBastida extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static List<CuentaBancaria> cuentas = new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CuentaServletJaimeBastida() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println(":::: ENTRO A doGet ::::");
		response.getWriter().append("Cuentas Registradas: ").append(cuentas.toString()).append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println(":::: ENTRO A doPost ::::");
		
		CuentaBancaria nuevaCuentaBancaria = new CuentaBancaria();
		
		nuevaCuentaBancaria.setId(cuentas.size() + 1);
		nuevaCuentaBancaria.setUsuario(request.getParameter("usuario"));
		nuevaCuentaBancaria.setNumCuenta(request.getParameter("numCuenta"));
		nuevaCuentaBancaria.setClaveBanco(request.getParameter("claveBanco"));
		nuevaCuentaBancaria.setContrasena(request.getParameter("contrasena"));
		nuevaCuentaBancaria.setSaldo(Double.parseDouble(request.getParameter("saldo")));
		
	    System.out.println("Cuenta bancaria registrada " + nuevaCuentaBancaria);
	    
	    cuentas.add(nuevaCuentaBancaria);
	}
}
