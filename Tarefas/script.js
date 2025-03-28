function validateLogin() {
    const predefinedEmail = "usuario@email.com";
    const predefinedPassword = "123456";
    
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;
    const errorMessage = document.getElementById("error-message");
    
    if (email === predefinedEmail && password === predefinedPassword) {
        alert("Login bem-sucedido!");
    } else {
        errorMessage.textContent = "E-mail ou senha incorretos!";
    }
}