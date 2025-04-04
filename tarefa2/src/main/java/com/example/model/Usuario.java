package com.example.model;

public class Usuario {
	private String email;
    private String senha;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    // Método para verificar as credenciais (simulação)
    public static boolean autenticar(String email, String senha) {
        // Simulação de dados pré-definidos
        if ("vitorpatrick@email.com".equals(email) && "12345678".equals(senha)) {
            return true;
        }
        return false;
    }

}
