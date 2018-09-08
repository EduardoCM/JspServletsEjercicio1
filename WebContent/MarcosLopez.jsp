<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Ejercicio Marcos López</h1>
	<h2>Registro de productos</h2>
	
	<form action="MarcosLopezRegistroProducto" method="post">
		<table>
			<tr>
				<td>Nombre: </td>
				<td><input type="text" name="nombre"></td>
			</tr>
			
			<tr>
				<td>Descripcion: </td>
				<td><input type="text" name="descripcion"></td>
			</tr>
			
			<tr>
				<td>Precio: </td>
				<td><input type="text" name="precio"></td>
			</tr>
			
			<tr>
				<td>Stock: </td>
				<td><input type="text" name="stock"></td>
			</tr>
			
			<tr>
				<td>Fabricante: </td>
				<td><input type="text" name="fabricante"></td>
			</tr>
			<tr>
				<td></td>
				<td><button type="submit"/>Guardar Producto</td>
			</tr>
		</table>
</body>
</html>