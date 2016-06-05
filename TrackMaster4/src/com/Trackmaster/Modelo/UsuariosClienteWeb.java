package com.Trackmaster.Modelo;

public class UsuariosClienteWeb {
	private String usuario;
	private String password;
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//constructor para que se muestre en el LoginServlet
	public UsuariosClienteWeb(String user, String password){
		this.usuario	=user;
		this.password	=password;
	}
}
