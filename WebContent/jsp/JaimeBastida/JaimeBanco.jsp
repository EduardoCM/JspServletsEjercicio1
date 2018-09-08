<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Registro de Cuenta Bancaria</h1>
	
	<form action="controllerBancoJaimeBastida" method="post">

		<table>
			<tr>
				<td>Usuario</td>
				<td><input type="text" name="usuario"></td>
			</tr>
			<tr>
				<td>Número de Cuenta</td>
				<td><input type="text" name="numCuenta"></td>
			</tr>
			<tr>
				<td>Clave Banco</td>
				<td>
				<select name = "claveBanco">
					<option value = "banamex">BANAMEX<option/>
					<option value = "bancomer">BANCOMER<option/>
					<option value = "santander">SANTANDER<option/>
					<option value = "shsbc">HSBC<option/>
				</select>
				</td>
			</tr>
			<tr>
				<td>Contraseña</td>
				<td><input type="text" name="contrasena"></td>
			</tr>
			
			<tr>
				<td>Saldo</td>
				<td><input type="text" name="saldo"></td>
			</tr>
			
			<tr>
				<td></td>
				<td><button type="submit">Guardar Nueva Cuenta</button></td>
			</tr>
		</table>
	</form>
	
	<a href="controllerBancoJaimeBastida">Consultar Cuentas Bancarias</a>
	
	<></>
	<div>
		<table border="1">
			<tr>
			 <th>Id<th/>
			 <th>Usuario<th/>
			 <th>Numero de Cuenta<th/>
			 <th>Banco<th/>
			 <th>Saldo<th/>
			</tr>
		</table>
	</div>
</body>
</html>