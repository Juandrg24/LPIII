function validaciones() {
    let validado = true;

    //Traemos todos los small y los guardamos en una variable
    let msgs = document.querySelectorAll("small[id^='msg']");

    //Limpiamos los msg con este for of
    for (let m of msgs) {
        m.innerHTML = "";
    }

    //Campos
    let nombre = document.getElementById("nombre");
    let cedula = document.querySelector("#cedula");
    // let direccion = document.getElementById("direccion");
    // let celular = document.querySelector("#celular");
    // let diagnostico = ducument.getElementById("diagnostico");

    //Rgx
    let rgxNombre = /^[a-zA-Z Á]{3,80}$/;
    let rgxCedula = /^((\d{8})|(\d{10})|(\d{11})|(\d{6}-\d{5}))?$/;

    //Msg
    let msgNombre = document.querySelector("#msgNombre");
    let msgCedula = document.querySelector("#msgCedula");
    // let msgDireccion = document.querySelector("#msgDireccion");
    // let msgCelular = document.querySelector("#msgCelular");
    // let msgDiagnostico = document.querySelector("#msgDiagnostico");

    //Condiciones

    //Nombre
    if (nombre.value.trim() == "" || nombre.value.length == 0) {
        msgNombre.innerHTML += '<b>El Nombre No Puede Estar Vacio</b><br>';
        validado = false;
    } else if (!rgxNombre.test(nombre.value)) {
        msgNombre.innerHTML += '<b>Introduzca Solo Letras </b><br>';
        validado = false;
    }
    //Cedula
    if (cedula.value.trim() == "" || cedula.value.length == 0) {
        msgCedula.innerHTML += '<b>La Cedula No Puede Estar Vacio</b><br>';
        validado = false;

    } else if (!rgxCedula.test(cedula.value)) {
        msgCedula.innerHTML += '<b>Formato Incorrecto Solo Números</b><br>';
        validado = false;

    }

    return validado;
}
