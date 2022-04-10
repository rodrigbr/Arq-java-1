<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Veterinária XPTO</title>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Veterinária XPTO</a>
			</div>
			<ul class="nav navbar-nav">

				<c:if test="${not empty usuarioLogado}">
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Animais <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="/animais">Lista de Animais</a></li>
							<li><a href="/animal">Cadastro de Animal</a></li>
						</ul></li>

					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Exames <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="/exames">Lista de Exames</a></li>
							<li><a href="/exame">Cadastro de Exame</a></li>
						</ul></li>

					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Vacinas <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="/vacinas">Lista de Vacinas</a></li>
							<li><a href="/vacina">Cadastro de Vacina</a></li>
						</ul></li>

					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Higienes <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="/higienes">Lista de Higienes</a></li>
							<li><a href="/higiene">Cadastro de Higiene</a></li>
						</ul></li>


					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Usuarios <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="/usuarios">Lista de Usuarios</a></li>
							<li><a href="/usuarioByAdmin">Cadastro de Usuario</a></li>
						</ul></li>
				</c:if>
			</ul>

			<ul class="nav navbar-nav navbar-right">
				<c:if test="${empty usuarioLogado}">
					<li><a href="/usuario"><span
							class="glyphicon glyphicon-user"></span> Sign Up</a></li>
					<li><a href="/login"><span
							class="glyphicon glyphicon-log-in"></span> Login</a></li>
				</c:if>
				<c:if test="${not empty usuarioLogado}">
					<li><a href="/logout"><span
							class="glyphicon glyphicon-log-out"></span> Logout,
							${usuarioLogado.nome }</a></li>
				</c:if>
			</ul>
		</div>
	</nav>

	<div class="container">
		<img alt="" src="https://image.cachorrogato.com.br/vitrines/vitrine_98_168.JPG">
	</div>

</body>
</html>