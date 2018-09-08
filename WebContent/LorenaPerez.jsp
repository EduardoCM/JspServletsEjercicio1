<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejercicio de Lorena</title>
</head>
<body>
	<h1>Registro De Producto Importado</h1>
	<form action="LorenaPerez" method="post">
		<table>
			<tr>
				<td>No. de Parte</td>
				<td><input type="text" name="nparte"></td>
			</tr>
			<tr>
				<td>Descripción</td>
				<td><input type="text" name="descripcion"></td>
			</tr>
			<tr>
				<td>Proveedor</td>
				<td><input type="text" name="proveedor"></td>
			</tr>
			<tr>
				<td>Aduana</td>
				<td><input type="text" name="aduana"></td>
			</tr>
			<tr>
				<td>No. de Patente</td>
				<td><input type="text" name="patente"></td>
			</tr>
			<tr>
				<td>No. de Pedimento</td>
				<td><input type="text" name="pedimento"></td>
			</tr>
			<tr>
				<td>País de procedencia</td>
				<td><input type="text" name="procedencia" list="paises"/></td>
					<datalist id="paises">
						<option value="EUA"></option>
						<option value="Francia"></option>
						<option value="Finlandia"></option>
						<option value="Taiwan"></option>
					</datalist>
			</tr>

			<tr>
				<td><button type="submit">Guardar Producto</button></td>
			</tr>	

		</table>
	
	</form>
	
	<a href="LorenaPerez">Consultar Productos</a>	


</body>
</html>