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
			<label for="codigo">Código da vacina:</label> <input type="text" required
				class="form-control" id="codigo" placeholder="Entre com Código da vacina"
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
		
		<div class="form-group">
			<label for="dosagem">Dosagem:</label> <input type="text" required
				class="form-control" id="dosagem" placeholder="Entre com Dosagem"
				name="dosagem">
		</div>
		
		<div class="form-group">
			<label for="validade">Validade:</label> <input type="text" required
				class="form-control" id="validade" placeholder="Entre com Validade"	name="validade">
		</div>
		
		<button type="submit" class="btn btn-default">Salvar</button>
	</form>
</body>
</html>