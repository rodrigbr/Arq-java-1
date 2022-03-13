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
<title>Tela de ATENDIMENTO</title>
</head>
<body>
	<p>Cadastro de ATENDIMENTO</p>

	<form action="/atendimento/incluir" method="post">
		<div class="form-group">
			<label for="descricao">Descrição:</label> <input type="text"
				class="form-control" id="descricao" placeholder="descricao"
				name="descricao">
		</div>
		
		<button type="submit" class="btn btn-default">Submit</button>
	</form>
</body>
</html>