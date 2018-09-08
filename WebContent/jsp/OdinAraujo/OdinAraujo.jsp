<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action="cuentaServletOdin" method="post">
	<table>
		<h1>Crear nueva Cuenta</h1>
		<tr>
			<td>Usuario:</td>
			<td><input type="text" name="usuario"/></td>
		</tr>
		<tr>
			<td>Numero de Cuenta:</td>
			<td><input type="text" name="numeroCuenta"/></td>
		</tr>
		<tr>
			<td>Clave de Banco:</td>
			<td><select>
					<option name="claveBanco" value="banamex">Banamex</option>
					<option name="claveBanco" value="hsbc">Hsbc</option>
					<option name="claveBanco" value="bancomer">Bancomer</option>
					<option name="claveBanco" value="santander">Santander</option>
			</select></td>
		</tr>
		<tr>
			<td>Contraseña:</td>
			<td><input type="text" name="contrasena"/></td>
		</tr>
		<tr>
			<td>Fecha Nacimiento:</td>
			<td><input type="text" name="fechaNacimiento"/></td>
		</tr>
		<tr>
			<td>Saldo Inicial:</td>
			<td><input type="text" name="saldoInicial"/></td>
		</tr>
	</table>
	<br>
	<button type="submit">Guardar Ciudadano</button>
	</form>
	<br>
	<a href="cuentaServletOdin">Lista de Cuentas Bancaria</a>
	</div>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Usuario</th>
			<th>Numero Cuenta</th>
			<th>Banco</th>
			<th>Saldo</th>
		</tr>
	</table>
</body>
</html>