//Carrito de compras
function validar() {

    var formularioCorrecto = true
//Direccion
    var Direc = $("#Direc").val()
    var largoDirec = Direc.length
    if (largoDirec < 4 || largoDirec > 20) {
        formularioCorrecto = false
        $("#DirecError").show()
    } else {
        $("#DirecError").hide()
    }
//Numeracion
    var Numeracion = $("#Numeracion").val()
    var largoNumeracion = Numeracion.length
    if (largoNumeracion < 2 || largoNumeracion > 5) {
        formularioCorrecto = false
        $("#NumeracionError").show()
    } else {
        $("#NumeracionError").hide()
    }

//Recibe
    var Perso = $("#Perso").val()
    var largoPerso = Perso.length
    if (largoPerso < 3 || largoPerso > 10) {
        formularioCorrecto = false
        $("#PersoError").show()
    } else {
        $("#PersoError").hide()
    }

//Correo
    var correo = document.getElementById("correo");
    var validacionCorreo = /^\w+([.-_+]?\w+)*@\w+([.-]?\w+)*(\.\w{2,10})+$/;

    if (validacionCorreo.test(correo.value)) {
        $("#emailError").hide()
        return true;
    } else {
        $("#emailError").show()
    }
    if (formularioCorrecto == true) {
        añadir();
    }

}

function añadir() {
    alert("Añadido al Carro de compras")

}

function mostrar() {
    $("#objetos").hide()
    $("#Venta").show()
}


function almacenar(id) {
    console.log(id);
    sessionStorage.setItem("margen", id)
}