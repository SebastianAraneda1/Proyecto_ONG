function validar() {

    var formularioCorrecto = true

    var nombre = $("#nombre").val()
    var largoNombre = nombre.length
    if (largoNombre < 4 || largoNombre > 20) {
        formularioCorrecto = false
        $("#nombreError").show()
    } else {
        $("#nombreError").hide()
    }

    var paterno = $("#aPaterno").val()
    var largoPaterno = paterno.length
    if (largoPaterno < 4 || largoPaterno > 20) {
        formularioCorrecto = false
        $("#apError").show()
    } else {
        $("#apError").hide()
    }

    var materno = $("#aMaterno").val()
    var largoMaterno = materno.length
    if (largoMaterno < 4 || largoMaterno > 20) {
        formularioCorrecto = false
        $("#amError").show()
    } else {
        $("#amError").hide()
    }

    var rut = $("#rut").val()
    var largoRut = rut.length
    if (largoRut < 9 || largoRut > 10) {
        formularioCorrecto = false
        $("#rutError").show()
    } else {
        $("#rutError").hide()
    }

    var correo = document.getElementById("correo");
    var validacionCorreo = /^\w+([.-_+]?\w+)*@\w+([.-]?\w+)*(\.\w{2,10})+$/;

    if (validacionCorreo.test(correo.value)) {
        $("#emailError").hide()
        return true;
    } else {
        $("#emailError").show()
        return false
    }
    /*if (formularioCorrecto == true) {
        adoptar();
    }*/

}

function adoptar() {
    const id = sessionStorage.getItem("gato");
    const element = document.getElementById(id);
    element.style.display = "none";
    //alert("Adoptaste a un minino");
    // console.log(5 == '5');
    // console.log(5 === '5');
}

function almacenar(id) {
    console.log(id);
    sessionStorage.setItem("gato", id)
}