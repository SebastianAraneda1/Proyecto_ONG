function validar() {
    var nombreOK = false;
    var telefonoOK = false;
    var emailOK = false;
    var passOK = false;

    var nombre = document.getElementById("nombre").value;
    var largoNombre = nombre.length
    if (largoNombre > 3 && largoNombre < 20) {
        nombreOK = true
    } else {
        alert("Nombre Incorrecto")
    }

    var telefono = document.getElementById("telefono").value;
    var largoTelefono = telefono.length
    if (largoTelefono === 9) {
        telefonoOK = true
    } else {
        alert("Telefono Incorrecto")
    }


    var emailField = document.getElementById("email");
    var validEmail = /^\w+([.-_+]?\w+)*@\w+([.-]?\w+)*(\.\w{2,10})+$/;

    if (validEmail.test(emailField.value)) {
        emailOK = true
    } else {
        alert('Email es invalido');
    }

    var pass = document.getElementById("password").value;
    var largoPass = pass.length
    if (largoPass > 5 && largoPass < 20) {
        passOK = true
    } else {
        alert("Password Incorrecto")
    }

    if (nombreOK && telefonoOK && emailOK && passOK) {
        alert("Datos Registrados")
        window.location.href = "index.html";
    }
}
    