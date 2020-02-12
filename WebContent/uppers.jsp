<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Uppers</title>
</head>
<body>
	<h1>Uppers</h1>
	<form action="UpperBooksServlet" method="post">
	
		<p>
		   <label for="txtNameBook">Book Name</label>
		   <input type="text" id="txtNameBook" name="txtNameBook">
		</p>
		
		<p>
		   <label for="txtAuthor">Author</label>
		   <input type="text" id="txtAuthor" name="txtAuthor">
		</p>
		
		<p>
		   <label for="txtIsbn">ISBN</label>
		   <input type="text" id="txtIsbn" name="txtIsbn">
		</p>
		
		<p>
		   <input type="submit" value="Alta de Libro">
		</p>
		
	</form>
</body>
</html>