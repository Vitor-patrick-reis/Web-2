function addEmailField() {
    const container = document.getElementById("email-container");
    const input = document.createElement("input");
    input.type = "email";
    input.name = "emails[]";
    input.required = true;
    container.appendChild(input);
}