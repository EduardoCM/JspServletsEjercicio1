<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<center>

<h1>Crear nueva Cuenta</h1>


<form action="cuentaServletEduardo" method="POST">
		<table>
			<tr>
				<td>Usuario:</td>
				<td><input type="text" name="usuario"></td>
			</tr>
			<tr>
				<td>Numumero de cuenta:</td>
				<td><input type="text" name="numCuenta"></td>
			</tr>
			
			<tr>
			   <td>Clave de banco</td>
			   <td>
			   <select name="claveBanco">
			     <option value="banamex">Banamex</option>
			     <option value="santander">Santander</option>
			     <option value="hsbc">Hsbc</option>
			     <option value="bancomer">Bancomer</option>
			   </select>
			   </td>
			</tr>
			
			<tr>
			   <td>Saldo inicial</td>
			   <td><input type="text" name="saldoInicial"> </td>
			</tr>
			
			<tr>
				<td>Contraseña</td>
				<td><input type="password" name="pass"></td>
			</tr>
			
		</table>
		
		<button type="submit">Guardar Ciudano</button>
	</form>
	
	<a href="cuentaServletEduardo">Consultar Cuentas</a>
	
	<div>
	<table border="1">
	      <tr>
	        <th>Id</th>
	        <th>Usuario</th>
	        <th>Numero Cuenta</th>
	        <th>Banco</th>
	        <th>Saldo</th>
	      </tr>
	      
	      <c:forEach var="cuenta"  items="${cuentaBancariaList}">
	      <tr>
	         <td><c:out value="${cuenta.id}"></c:out></td>
	         <td><c:out value="${cuenta.usuario}"></c:out></td>
	         <td><c:out value="${cuenta.numCuenta}"></c:out></td>
	         <td><c:out value="${cuenta.claveBanco}"></c:out></td>
	         <td><c:out value="${cuenta.saldo}"></c:out></td>
	      </tr>
	      </c:forEach>
	      
	</table>
	
	
	</div>
	
	

</center>

</body>
</html>