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
<title>Lista de HIGIENES</title>
</head>
<body>

	<div class="container mt-3">
		<h2>Cadastro de higienes</h2>
		<form action="/higiene" method="get">
			<button type="submit" class="btn btn-default">Nova Higiene</button>
		</form>

		<c:if test="${not empty listagem }">
			<p>Lista de HIGIENES (${ listagem.size() }):</p>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Id</th>
						<th>Nome</th>
						<th>Código</th>
						<th>Descrição</th>
						<th>Valor</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="a" items="${ listagem }">
						<tr>
							<td>${a.id}</td>
							<td>${a.nome}</td>
							<td>${a.codigo}</td>
							<td>${a.descricao}</td>
							<td>${a.valor}</td>
							<td><a href="/higiene/${a.id}/excluir"> excluir</a></td>
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