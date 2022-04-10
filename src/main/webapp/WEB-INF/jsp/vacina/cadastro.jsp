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
<title>Tela de VACINA</title>
</head>
<body>
	<p>Tela de VACINA</p>

	<form action="/vacina/incluir" method="post">
		<div class="form-group">
			<label for="nome">Nome da vacina:</label> <input type="text" required
				class="form-control" id="nome" placeholder="Entre com Nome da Vacina"
				name="nome">
		</div>
		<div class="form-group">
			<label for="cod_vacina">Código da vacina:</label> <input type="text" required
				class="form-control" id="cod_vacina" placeholder="Entre com Código da vacina"
				name="cod_vacina">
		</div>
		<div class="form-group">
			<label for="descricao">Descrição:</label> <input type="text" required
				class="form-control" id="descricao" placeholder="Entre com Descrição"
				name="descricao">
		</div>
		<div class="form-group">
			<label for="valor_vacina">Valor:</label> <input type="number" required
				class="form-control" id="valor_vacina" placeholder="Entre com Valor"
				name="valor_vacina">
		</div>
		
		<div class="form-group">
			<label for="dosagem">Dosagem:</label> <input type="text" required
				class="form-control" id="dosagem" placeholder="Entre com Dosagem"
				name="dosagem">
		</div>
		
		<button type="submit" class="btn btn-default">Salvar</button>
	</form>
</body>
</html>