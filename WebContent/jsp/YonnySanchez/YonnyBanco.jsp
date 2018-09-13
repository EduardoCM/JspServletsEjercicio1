<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Crear Nueva Cuenta</h1>
		<form action="cuentasServletYonny" method="POST">
			<table>
				<tr>
					<td>Usuario:</td>
					<td><input type="text" name="usuario"></td>
				</tr>
				<tr>
					<td>Numero de Cuenta:</td>
					<td><input type="text" name="numCuenta"></td>
				</tr>
				<tr>
					<td>Clave Banco:</td>
					<td>
					<select name="claveBanco">
							<option value="Banamex">Banamex</option>
							<option value="Santander">Santander</option>
							<option value="hsbc">Hsbc</option>
							<option value="Bancomer">Bancomer</option>
					</select>
					</td>
				</tr>
				<tr>
					<td>Saldo Inicial:</td>
					<td><input type="text" name="saldoIncial"></td>
				</tr>
				<tr>
					<td>Contraseña:</td>
					<td><input type="text" name="pass"></td>
				</tr>
			</table>
			<table>
			<tr></tr>
			</table>
			<button type="submit">Guardar Ciudadano</button>
			<table>
			<tr></tr>
			</table>
		</form>
		<div>
			<table border="1">

				<tr>
					<th>Id</th>
					<th>Usuario</th>
					<th>Numero de Cuenta</th>
					<th>Banco</th>
					<th>Saldo</th>
				</tr>
				<c:forEach var="cuenta" items="${cuentasBancarias}">
				<tr>
					<td><c:out value="${cuenta.id}"></c:out></td>
					<td><c:out value="${cuenta.usuario}"></c:out></td>
					<td><c:out value="${cuenta.numCuenta}"></c:out></td>
					<td><c:out value="${cuenta.claveBanco}"></c:out></td>
					<td><c:out value="${cuenta.saldo}"></c:out></td>
					<td><a href="cuentasServletYonny?op=editar&idCuenta=${cuenta.id}">Editar</a></td>
					<td><a href="cuentasServletYonny?op=eliminar&idCuenta=${cuenta.id}">Eliminar</a></td>
				</tr> 
				</c:forEach>
			</table>
		</div>
	</center>
</body>
</html>