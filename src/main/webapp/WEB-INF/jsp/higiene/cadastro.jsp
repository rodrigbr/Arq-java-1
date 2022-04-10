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
<title>Tela de HIGIENE</title>
</head>
<body>
	<p>Tela de HIGIENE</p>

	<form action="/higiene/incluir" method="post">
		<div class="form-group">
			<label for="nome">Nome da higiene:</label> <input type="text" required
				class="form-control" id="nome" placeholder="Entre com Nome da higiene"
				name="nome">
		</div>
		<div class="form-group">
			<label for="codigo">Código da higiene:</label> <input type="text" required
				class="form-control" id="codigo" placeholder="Entre com Código da higiene"
				name="codigo">
		</div>
		<div class="form-group">
			<label for="descricao">Descrição:</label> <input type="text" required
				class="form-control" id="descricao" placeholder="Entre com Descrição"
				name="descricao">
		</div>
		<div class="form-group">
			<label for="valor">Valor:</label> <input type="number" required
				class="form-control" id="valor" placeholder="Entre com Valor"
				name="valor">
		</div>
		
		<button type="submit" class="btn btn-default">Salvar</button>
	</form>
</body>
</html>