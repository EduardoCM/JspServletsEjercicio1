<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>David Rodriguez</title>
</head>
<body>
	<h1>Registrar nueva cuenta</h1>
	<form action="cuentaServletDavid" method="post">
		<table>
			<tr>
				<td>Usuario:</td>
				<td><input type="text" name="usuario"></td>
			</tr>
			<tr>
				<td>Contrasenia:</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td>Banco:</td>
				<td><select name="banco">
						<option value="BANAMEX">Banamex</option>
						<option value="BANCOMER">Bancomer</option>
						<option value="SANTANDER">Santander</option>
						<option value="HSBC">HSBC</option>
				</select></td>
			</tr>
			<tr>
				<td>No. de cuenta:</td>
				<td><input type="text" name="numCuenta"></td>
			</tr>
			<tr>
				<td>Saldo:</td>
				<td><input type="text" name="saldo"></td>
			</tr>
			<tr>
				<td><button type="submit">Registrar</button></td>
			</tr>
		</table>
	</form>
	<a href="cuentaServletDavid">Consultar</a>
	<div>
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Usuario</th>
				<th>No. de Cuenta</th>
				<th>Banco</th>
				<th>Saldo</th>
			</tr>
		</table>
	</div>
</body>
</html>