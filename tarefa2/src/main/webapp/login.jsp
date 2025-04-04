<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tarefa 2- Autenticação</title>
</head>
<body>
    <h1>Formulário de Login </h1>
    <form action="LoginServlet" method="post">
        <div>
            <label for="email">E-mail:</label>
            <input type="email" id="email" name="email" required>
        </div>
        <br>
        <div>
            <label for="senha">Senha:</label>
            <input type="password" id="senha" name="senha" required>
        </div>
        <br>
        <button type="submit">Entrar</button>
    </form>
</body>
</html>