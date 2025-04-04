package com.example.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.example.model.Usuario;
import java.io.IOException;
@WebServlet("/LoginServlet")

@SuppressWarnings("unused")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String email = request.getParameter("email");
	        String senha = request.getParameter("senha");

	        if (email != null && !email.isEmpty() && senha != null && !senha.isEmpty()) {
	            if (Usuario.autenticar(email, senha)) {
	                // Autenticação bem-sucedida, redireciona para a página de boas-vindas
	                response.sendRedirect("boasvindas.jsp?email=" + email);
	            } else {
	                // Credenciais inválidas, redireciona para a página de erro
	                response.sendRedirect("erro.jsp");
	            }
	        } else {
	            // Dados obrigatórios não preenchidos, redireciona para a página de erro
	            response.sendRedirect("erro.jsp");
	        }
	    }

	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // Normalmente, uma requisição GET para /LoginServlet poderia exibir o formulário de login
	        response.sendRedirect("login.jsp");
	    }

}
