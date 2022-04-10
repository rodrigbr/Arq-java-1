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
<title>Tela de EXAME</title>
</head>
<body>
	<p>Tela de EXAME</p>

	<form action="/exame/incluir" method="post">
		<div class="form-group">
			<label for="nome">Nome do exame:</label> <input type="text" required
				class="form-control" id="nome" placeholder="Entre com Nome do exame"
				name="nome">
		</div>
		<div class="form-group">
			<label for="cod_exame">Código do exame:</label> <input type="text" required
				class="form-control" id="cod_exame" placeholder="Entre com Código do exame"
				name="cod_exame">
		</div>
		<div class="form-group">
			<label for="descricao">Descrição:</label> <input type="text" required
				class="form-control" id="descricao" placeholder="Entre com Descrição"
				name="descricao">
		</div>
		<div class="form-group">
			<label for="valor_exame">Valor:</label> <input type="number" required
				class="form-control" id="valor_exame" placeholder="Entre com Valor"
				name="valor_exame">
		</div>
		
		<button type="submit" class="btn btn-default">Salvar</button>
	</form>
</body>
</html>