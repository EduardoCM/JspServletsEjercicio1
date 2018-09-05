<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro Vehicular:</title>
</head>
<body>
	<form action="RegistroVehicular" method="post">
		<h1>Datos del Vehiculo:</h1>
		<table>
			<tr>
				<td><b>Marca:</b></td>
				<td><input type="text" name="marca"></td>
			</tr>
			<tr>
				<td><b>Modelo:</b></td>
				<td><input type="text" name="modelo"></td>
			</tr>
			<tr>
				<td><b>Placa:</b></td>
				<td><input type="text" name="placa"></td>
			</tr>
			<tr>
				<td><b>Color:</b></td>
				<td><input type="text" name="color"></td>
			</tr>
			<tr>
				<td><b>Tipo Vehiculo:</b></td>
				<td>
					<select>
							<option name="tipoVehiculo" value="Sedan">Sedan</option>
							<option name="tipoVehiculo" value="HatchBack">HatchBack</option>
							<option name="tipoVehiculo" value="SUV">SUV</option>
							<option name="tipoVehiculo" value="Camioneta">Camioneta</option>
					</select>
				</td>
			</tr>
		</table>
		<br />
		<h1>Datos del Propietario:</h1>
		<table>
			<tr>
				<td><b>Nombre(s):</b></td>
				<td><input type="text" name="nombre"></td>
			</tr>
			<tr>
				<td><b>Paterno:</b></td>
				<td><input type="text" name="paterno"></td>
			</tr>
			<tr>
				<td><b>Materno:</b></td>
				<td><input type="text" name="materno"></td>
			</tr>
			<tr>
				<td><b>Fecha Nacimiento:</b></td>
				<td><input type="text" name="fechaNacimiento"></td>
			</tr>
			<tr>
				<td><b>Clave de Elector:</b></td>
				<td><input type="text" name="claveElector"></td>
			</tr>
			<tr>
				<td><b>Sexo:</b></td>
				<td>
					<input type="radio" name="sexo" value="0" checked> Masculino<br>
  					<input type="radio" name="sexo" value="1"> Femenino<br>
				</td>
			</tr>
		</table>
		<button type="submit">Guardar</button>
	</form>

</body>
</html>