<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Altas</title>
</head>
<body>
	<h1>Altas</h1>
	<form action="AltasLibrosServlet" method="post">
		<p>
		   <label for="txtNameBook">Nombre de Libro</label>
		   <input type="text" id="txtNameBook" name="txtNameBook">
		</p>
		<p>
		   <input type="submit" value="Alta de Libro">
		</p>
	</form>
</body>
</html>