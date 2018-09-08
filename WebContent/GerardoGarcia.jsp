<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Registro de Pacientes  </h1>
	<form action="GerardoGarcia" method="Post">
		<table>
			<tr>
				<td>Nombre :</td>
				<td><input type="text" name="nombre"></td>
			</tr> 
			<tr>
				<td>Curp:</td>
				<td><input type="text" name="curp"></td>
				</tr> 
			<tr>
				<td>Sexo :</td>
				<td><input type="text" name="sexo"></td>
				</tr> 
			<tr>	
				<td>Estado civil:</td>
				<td><input type="text" name="civil"></td>
				</tr> 
			<tr>
				<td>Tipo de sangre:</td>
				<td><input type="text" name=sangre></td>
			</tr>
			<tr>
				<td>Edad:</td>
				<td><input type="text" name="edad"></td>
			</tr>
		</table>
		<button type="submit">Registrar Pacientes</button>

	</form>
	<a href="GerardoGarcia"> Consultar Pacientes</a>
</body>
</html>