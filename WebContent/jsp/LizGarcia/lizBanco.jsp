<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Datos cuenta bancaria</title>
</head>
<body>
	<form action="">
		<table >
			<tr>
				<td>Usuario:</td>
				<td><input type="text" name="lblUsuario"></td>
			</tr>
			<tr>
				<td>Número de cuenta:</td>
				<td><input type="text" name="lblNumCuenta"></td>
			</tr>

			<tr>
				<td>Clave banco:</td>
				<td><select name="programa">
						<option value="banamex" selected="selected">Banamex</option>
						<option value="hsbc">HSBC</option>
						<option value="santander">Santander</option>
				</select></td>
			</tr>

			<tr>
				<td>Contraseña:</td>
				<td><input type="text" name="lblPassword"></td>
			</tr>
			<tr>
				<td>Saldo:</td>
				<td><input type="text" name="lblSaldo"></td>
			</tr>
				<td></td>
				<td><button type="submit" />Guardar</td>
		</table>

	</form>
</body>
</html>