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
<title>Tela de ANIMAL</title>
</head>
<body>
	<p>Tela de ANIMALS</p>

	<form action="/animal/incluir" method="post">
		<div class="form-group">
			<label for="nome">Nome do animal:</label> <input type="text" required
				class="form-control" id="nome" placeholder="Entre com Nome do animal"
				name="nome">
		</div>
		<div class="form-group">
			<label for="raca">Raça:</label> <input type="text" required
				class="form-control" id="raca" placeholder="Entre com Raça"
				name="raca">
		</div>
		<div class="form-group">
			<label for="peso">Peso:</label> <input type="number" required
				class="form-control" id="peso" placeholder="Entre com Peso"
				name="peso">
		</div>
		<div class="form-group">
			<label for="idade">Idade:</label> <input type="number" required
				class="form-control" id="idade" placeholder="Entre com Idade"
				name="idade">
		</div>
		<div class="form-group">
			<label for="nascimento">Nascimento:</label> <input type="date" required
				class="form-control" id="nascimento" placeholder="Entre com DD/MM/AAAA"
				name="nascimento">
		</div>
		<div class="form-group">
			<label for="cor">Cor:</label> <input type="text" required
				class="form-control" id="cor" placeholder="Entre com Cor"
				name="cor">
		</div>
		
		<button type="submit" class="btn btn-default">Salvar</button>
	</form>
</body>
</html>