function sub() {
    var opinion = document.getElementById("opinion").value;
    validar(opinion);
}

function validar(opc) {
    if (opc == "") {
        alert("No ha escrito nada aun")
        document.getElementById("opinion").focus();
    } else {
        alert("Todos los datos se guardaron con exito. Gracias por compartirnos tu experiencia.")
    }
}