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

    var generos = $("#genero").val().toLowerCase();
    if (generos != 'hembra' && generos != 'macho') {
        $("#generoError").show()
        formularioCorrecto = false;
    } else {
        $("#generoError").hide()
    }

    var esterils = $("#esteril").val().toLowerCase();
    if(esterils != 'si' && esterils != 'no'){
        $("#esterilError").show()
        formularioCorrecto = false;
    }else{
        $("#esterilError").hide()
    }

    var tipos = $("#tipo").val().toLowerCase();
    if (tipos != 'perro' && tipos != 'gato'){
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
    var tipos = $("#tipo").val().toLowerCase();
    if (tipos == 'perro') {
        window.location.href = 'perros.html'
    }else{
        window.location.href = 'gatos.html'
    }
}

function maxLength(max){
    const e = window.event;
    debugger;
    const val = document.getElementById(e.id);
    if ( val && val.toString().length > max ) {
        e.preventDefault();
    }
}