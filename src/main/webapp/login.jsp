<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
<title>Login</title>
</head>
<body>
	<div class="container">
		<h1 class="title" class="backG">Login</h1>
		<form class="form" action="login" method="post">
			<label for="username">Usuário:</label> <input type="text"
				id="username" name="username" required><br> <br> <label
				for="password">Senha:</label> <input type="password" id="password"
				name="password" required><br> <br>
			<button type="submit">Entrar</button>
		</form>
	</div>
</body>
</html>