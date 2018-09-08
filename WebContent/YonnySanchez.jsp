<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Regitro de Inquilinos</h1>
	<form action="YonnySanchez" method="post">
		<table>
			<tr>
				<td>Nombre(s):</td>
				<td><input type="text" name="nombre"></td>
			</tr>
			<tr>
				<td>Apellido Paterno:</td>
				<td><input type="text" name="apPaterno"></td>
			</tr>
			<tr>
				<td>Apellido Materno:</td>
				<td><input type="text" name="apMaterno"></td>
			</tr>
			<tr>
				<td>Edad:</td>
				<td><input type="text" name="edad"></td>
			</tr>
			<tr>
				<td>Sexo:</td>
				<td><input type="text" name="sexo"></td>
			</tr>
			<tr>
				<td>Inmueble:</td>
				<td><input type="text" name="inmueble"></td>
			</tr>
			<tr>
				<td>Direccion:</td>
				<td><input type="text" name="direccion"></td>
			</tr>
		</table>
		<button type="submit">Registrar Inquilino</button>
	</form>
	<a href="YonnySanchez">Consultar Inquilinos</a>

</body>
</html>