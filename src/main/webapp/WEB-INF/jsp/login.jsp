<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Login</title>
</head>
<body>
	<div class="container">
		<h2>Faça seu login.</h2>
		<p>Sistema de gestão veterinária.</p>
		<c:if test="${not empty mensagem}">
			<div class="alert alert-warning">
				<strong>Erro!</strong> ${mensagem}
			</div>
		</c:if>
		<form action="/login" method="post">
			<div class="form-group">
				<label for="email">Email:</label> <input type="text"
					class="form-control" id="email" placeholder="Seu email"
					name="email" required>
			</div>
			<div class="form-group">
				<label for="senha">Senha:</label> <input type="password"
					class="form-control" id="senha" placeholder="Sua senha"
					name="senha" required>
			</div>

			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>
</body>
</html>