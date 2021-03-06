<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Lista de EXAMES</title>
</head>
<body>

	<div class="container mt-3">
		<h2>Cadastro de exames</h2>
		<form action="/exame" method="get">
			<button type="submit" class="btn btn-default">Novo Exame</button>
		</form>

		<c:if test="${not empty listagem }">
			<p>Lista de EXAMES (${ listagem.size() }):</p>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Id</th>
						<th>Nome</th>
						<th>C?digo</th>
						<th>Descri??o</th>
						<th>Valor</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="a" items="${ listagem }">
						<tr>
							<td>${a.id}</td>
							<td>${a.nome}</td>
							<td>${a.cod_exame}</td>
							<td>${a.descricao}</td>
							<td>${a.valor_exame}</td>
							<td><a href="/exame/${a.id}/excluir"> excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		<c:if test="${empty listagem }">
			<p>Sem dados para exibir</p>
		</c:if>
	</div>
</body>
</html>