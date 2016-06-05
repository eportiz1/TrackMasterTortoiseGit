package com.Trackmaster.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Trackmaster.Conexion.UsuarioClientesDAO;
/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/LoginWeb.jr")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servlet de login");
		//Para validar contenido
		String Usuario;
		String Password;
		
		//contenido de textos
		Usuario 	 = request.getParameter("usuario");
		Password	 = request.getParameter("password");
		try
		{
			//ENCAPSULAR TODO EN VALIDACIONES SI ES POSIBLE, Y QUE SOLO RECIBA USER Y PASS, Y DEVUELVA UN BOOLEAN en DAO Usuario
			UsuarioClientesDAO validacionUsuario = new UsuarioClientesDAO();
			
			Boolean estado=validacionUsuario.validaTextoVacioUserPass(Usuario, Password);
			if(estado.equals(true))
			{
				//USAR USUARIO CLIENTE DAO PARA VALIDAR SI EL USUARIO Y LA PASSWORD SON CORRECTAS O NO EXISTEN
				Boolean estado2=validacionUsuario.validaCredencialesUserPass(Usuario, Password);
				if(estado2.equals(true))
				{
				  System.out.println("Login exitoso...");
				  //reedigir a menu de compra carrito
				  //ACTIVAR SESION DE USUARIO REGISTRADO
				  HttpSession session= request.getSession(true);
				  session.setAttribute("usuario", Usuario);
				  response.sendRedirect("Menu.jsp");
				}
				else
				{
				  System.out.println("credenciales incorrectas...");
				  //reedigir a pantalla de error o a la misma página de login//
				}		
			}
			else
			{
				//dirigir a el jsp de error
				System.out.println("No se ingresaron datos");
			}	
		}
		catch(Exception ex)
		{
			System.out.println("ha ocurrido un error en el servidor");
		}
		
	}

}
