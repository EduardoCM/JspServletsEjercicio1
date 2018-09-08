<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registro de libros</h1>
<form action="GiselleFlores" method="post">
		<table>
			<tr>
				<td>Autor: </td>
				<td><input type="text" name="nombreAutor"></td>
			</tr>
			
			<tr>
				<td>Año de publicacion: </td>
				<td><input type="text" name="anioPublicacion"></td>
			</tr>
			
			<tr>
				<td>Titulo: </td>
				<td><input type="text" name="titulo"></td>
			</tr>
			
			<tr>
				<td>Lugar: </td>
				<td><input type="text" name="lugar"></td>
			</tr>
			
			<tr>
				<td>Editorial: </td>
				<td><input type="text" name="editorial"></td>
			</tr>
		</table>
	<button type="submit">Registrar Libro</button>
</form>

<a href="GiselleFlores">Consultar Libros</a>
</body>
</html>