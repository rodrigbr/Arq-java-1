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
<title>Lista de USUARIOS</title>
</head>
<body>

	<div class="container mt-3">
		<h2>Cadastro de usuarios</h2>
		<form action="/usuarioByAdmin" method="get">
			<button type="submit" class="btn btn-default">Novo Usu�rio</button>
		</form>

		<c:if test="${not empty listagem }">
			<p>Lista de USUARIOS (${ listagem.size() }):</p>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Id</th>
						<th>Nome</th>
						<th>Email</th>
						<th>Admin</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="a" items="${ listagem }">
						<tr>
							<td>${a.id}</td>
							<td>${a.nome}</td>
							<td>${a.email}</td>
							<td>${a.admin}</td>
							<td><a href="/usuario/${a.id}/excluir"> excluir</a></td>
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