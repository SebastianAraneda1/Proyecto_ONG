function validar() {

    var formularioCorrecto = true;

    var chips = $("#nroChip").val()
    var largoChip = chips.length
    if (largoChip < 3 || largoChip > 4) {
        $("#chipError").show();
        formularioCorrecto = false;
    } else {
        $("#chipError").hide()
    }

    var edads = $("#edad").val()
    largoEdad = edads.length
    if (largoEdad < 1) {
        $("#edadError").show()
        formularioCorrecto = false;
    } else {
        $("#edadError").hide()
    }

    var nombres = $("#nombre").val()
    var largoNombre = nombres.length
    if (largoNombre < 4 || largoNombre > 20) {
        $("#nombreError").show()
        formularioCorrecto = false;
    } else {
        $("#nombreError").hide()
    }

    var generos = $("#genero").val()
    if (generos != 'Hembra' && generos != 'Macho') {
        $("#generoError").show()
        formularioCorrecto = false;
    } else {
        $("#generoError").hide()
    }

    var esterils = $("#esteril").val()
    if(esterils != 'Si' && esterils != 'No'){
        $("#esterilError").show()
        formularioCorrecto = false;
    }else{
        $("#esterilError").hide()
    }

    var tipos = $("#tipo").val()
    if (tipos != 'Perro' && tipos != 'Gato'){
        $("#tipoError").show()
        formularioCorrecto = false;
    }else{
        $("#tipoError").hide()
    }

    if (formularioCorrecto == true) {
        redireccionar()
        return true;
    }
    else{
        return false;
    }
}

function redireccionar(){
    var tipos = $("#tipo").val()
    if (tipos == 'Perro') {
        window.location.href = 'perros.html'
    }else{
        window.location.href = 'gatos.html'
    }
}