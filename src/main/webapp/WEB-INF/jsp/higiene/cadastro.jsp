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
			<label for="cod_higiene">C?digo da higiene:</label> <input type="text" required
				class="form-control" id="cod_higiene" placeholder="Entre com C?digo da higiene"
				name="cod_higiene">
		</div>
		<div class="form-group">
			<label for="descricao">Descri??o:</label> <input type="text" required
				class="form-control" id="descricao" placeholder="Entre com Descri??o"
				name="descricao">
		</div>
		<div class="form-group">
			<label for="valor_higiene">Valor:</label> <input type="number" required
				class="form-control" id="valor_higiene" placeholder="Entre com Valor"
				name="valor_higiene">
		</div>
		
		<button type="submit" class="btn btn-default">Salvar</button>
	</form>
</body>
</html>