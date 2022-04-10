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
			<label for="descricao">Descrição:</label> <input type="text"
				class="form-control" id="descricao" placeholder="descricao"
				name="descricao">
		</div>

		<button type="submit" class="btn btn-default">Submit</button>
	</form>

	<div class="container mt-3">
		<h2>Lista de animais</h2>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Cor</th>
					<th>Idade</th>
					<th>Nascimento</th>
					<th>Peso</th>
					<th>Raça</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>John</td>
					<td>Doe</td>
					<td>john@example.com</td>
					<td>john@example.com</td>
					<td>john@example.com</td>
					<td>john@example.com</td>
				</tr>
				<tr>
					<td>Mary</td>
					<td>Moe</td>
					<td>mary@example.com</td>
					<td>john@example.com</td>
					<td>john@example.com</td>
					<td>john@example.com</td>
				</tr>
				<tr>
					<td>July</td>
					<td>Dooley</td>
					<td>july@example.com</td>
					<td>john@example.com</td>
					<td>john@example.com</td>
					<td>john@example.com</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>