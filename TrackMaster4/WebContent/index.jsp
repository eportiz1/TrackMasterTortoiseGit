<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TrackMaster dónde to se puede comprar</title>
</head>
<body>
	 <header>
 <p>
    <div class="contenedor" >
      <h1>Bienvenido a TrackMaster.com</h1>
    </div>
  </p> 
  </header>
  <!-- INICIO DE DEFINICION DE ESTILOS DE LA PÁGINA -->
   <style type="text/css">
  		header {
  	 			width: 100%;  
  				height: 70px;
  				position: fixed;
  				top:0;
  				left:0;
  				background: #333;
  				color:#fff;
 			    }
   </style>
  <!--  <form action="LoginWeb.jr" method="POST" onsubmit="validaLogin();"> -->
  
	<form id="Formlogin" method = 'POST' action="LoginServlet" >
	<br>
	</br>
	<br>
	</br>
	<h2>Inicio de sesión... </h2>
		<main>
			<div class="contenedor" >
			<fieldset>
			<table>
				<td>Ingresa tu usuario y contraseña:</td>
				<tr> 
    				<td>Usuario:</td>
					<td><input type="text" name="usuario" id="usuario" placeholder="Ingrese usuario" required="required"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" id="password" placeholder="Ingrese password" required="required"></td>
				</tr>
	
				<tr>
					<TD><input type="button" value="Cancelar" >
					<input type="submit" value="Aceptar" id=LoginUsuario></TD>
				</tr>
				<tr>
				</tr>
				<tr>
					<td>o registrarse...</td>
				</tr>
				<tr>
					<TD><a href="http://localhost:8080/TrackMaster4/FormularioAlta.jsp">Ingresar Fomulario de Alta de Usuario</a></TD>
				</tr>
			</table>
			</fieldset>	
		</div>
		</p>
		</main>
		<style type="text/css">
		main	{
					top: 500;
					background: #FAFAFA;
				}
		</style>
	</form>
</body>
</html>