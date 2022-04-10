<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Tela de USUARIO</title>
</head>
<body>
	<p>Tela de USUARIOS</p>

	<form action="/usuario/incluirByAdmin" method="post">
		<div class="form-group">
			<label for="nome">Nome:</label> <input type="text" required
				class="form-control" id="nome"
				placeholder="Entre com Nome do usuário" name="nome">
		</div>
		<div class="form-group">
			<label for="email">Email:</label> <input type="text" required
				class="form-control" id="email" placeholder="Entre com E-mail"
				name="email">
		</div>
		<div class="form-group">
			<label for="senha">Senha:</label> <input type="password" required
				class="form-control" id="senha" placeholder="Entre com Senha"
				name="senha">
		</div>
		<div class="form-group">
			<label for="admin">Admin:</label>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="isAdmin"
					id="admin1"> <label class="form-check-label"
					for="admin1"> Sim </label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="isAdmin"
					id="admin2" checked> <label
					class="form-check-label" for="admin2">Não </label>
			</div>

		</div>

		<button type="submit" class="btn btn-default">Salvar</button>
	</form>
</body>
</html>