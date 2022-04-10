<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %> 

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<p>Autenticação</p>
	<c:if test="${not empty mensagem}">
		<div class="alert alert-warning">
			<strong>Erro!</strong> ${mensagem}
		</div>
	</c:if>
	<form action="/login" method="post">
		<div class="form-group">
			<label for="email">Email:</label> <input type="text"
				class="form-control" id="email" placeholder="Seu email" name="email" required>
		</div>
		<div class="form-group">
			<label for="senha">Senha:</label> <input type="password"
				class="form-control" id="senha" placeholder="Sua senha" name="senha" required>
		</div>

		<button type="submit" class="btn btn-default">Submit</button>
	</form>
</body>
</html>