<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div class="container">
		<h1>Login Page</h1>
		<br>
		<pre>${errorMessage}</pre>
		<form method="post">
			Enter UserName : <input type="text" name="name"> <br>
			Enter Password : <input type="password" name="password"><br>
			<input type="submit">
		</form>
	</div>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	<script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
</body>

</html>