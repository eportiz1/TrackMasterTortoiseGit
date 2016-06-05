package com.Trackmaster.Conexion;

public class UsuarioClientesDAO {


	public Boolean validaTextoVacioUserPass(String Usuario, String Password){
		boolean bandera = true;
		if(Password.equals("") && Usuario.equals("") )
		{
			bandera=false;
			//System.out.println("No se ha ingresado ningun dato...");
		}
		else 
		{
			if(Usuario.equals(""))
			{
				bandera=false;
				//System.out.println("Ingresa usuario...");
			}
			else
			{
				if(Password.equals(""))
				{
					bandera=false;
					//System.out.println("Ingresa password...");
				}
			}
		}	
	 return bandera;
	}

	public Boolean validaCredencialesUserPass(String Usuario, String Password){
		boolean bandera = false;
		//validar para que lo vaya a buscar a la BD
		if(Usuario.equals("quest") && Password.equals("quest"))
		{
		 bandera=true;
		}
		return bandera;
	}
	
	public Boolean validaDatosAlta(){
		boolean bandera = false;
		
		return bandera;
	}
}