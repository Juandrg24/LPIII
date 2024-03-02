
function validacion() {
    let cedula = document.getElementById("cedula").value;
    let nombre = document.getElementById("nombre").value;
    let direccion = document.getElementById("direccion").value;

    if (!(/^[0-9]{7,10}$/.test(cedula))) {
        alert("ERROR en la Cedula \nIngrese Solo Numeros ");
    } else if (!(/^[a-zA-ZáéíóúÁÉÍÓñÑ ]{7,40}$/.test(nombre))) {
        alert("Nombre Incorrecto \nIngrese solo Letras");
    } else if (!(/^[a-zA-Z0-9#\- ]{10,40}$/.test(direccion))) {
        alert("Direccion Incorrecta\nValido Numeros y Letras")
    }else {

        alert("Validacion Correcta");
    }
}

