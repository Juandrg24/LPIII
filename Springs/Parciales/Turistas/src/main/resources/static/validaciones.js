function validarTurista() {
    let validado = true;

    let msgs = document.querySelectorAll("small[id^='msg']");

    //Limpiamos los msg con este for of
    for (let m of msgs) {
        m.innerHTML = "";
    }


    //Campos
    let cedula = document.getElementById("cedula");
    let nombre = document.getElementById("nombre");
    let fechaingreso = document.getElementById("fechaingreso");
    let fechasalida = document.getElementById("fechasalida");
    let diashospedaje = document.getElementById("diashospedaje");
    let valordia = document.getElementById("valordia");


    //rgx
    let rgxNombre = /^[a-zA-Z Á]{3,80}$/;
    let rgxCedula = /^((\d{8})|(\d{10})|(\d{11})|(\d{6}-\d{5}))?$/;
    let rgxFecha = /^(?:\d{4})-(?:0[1-9]|1[0-2])-(?:0[1-9]|[12]\d|3[01])$/;
    let rgxEntero = /^(?:\+|-)?\d+$/;


    //msg
    let msgCedula = document.querySelector("#msgCedula");
    let msgNombre = document.querySelector("#msgNombre");
    let msgFechaingreso = document.querySelector("#msgFechaingreso");
    let msgFechasalida = document.querySelector("#msgFechasalida");
    let msgDiashospedaje = document.querySelector("#msgDiashospedaje");
    let msgValordia = document.querySelector("#msgValordia");


    //Condiciones

    //Cedula
    if (cedula.value.trim() == "" || cedula.value.lenght == 0) {
        msgCedula.innerHTML += '<b>La Cedula No Puede Estar Vacia</b><br>';
        validado = false;

    } else if (!rgxCedula.test(cedula.value)) {
        msgCedula.innerHTML += '<b>Formato Incorrecto Solo Números</b><br>';
        validado = false;

    }

    //Nombre
    if (nombre.value.trim() == "" || nombre.value.length == 0) {
        msgNombre.innerHTML += '<b>El Nombre No Puede Estar Vacio</b><br>';
        validado = false;
    } else if (!rgxNombre.test(nombre.value)) {
        msgNombre.innerHTML += '<b>Introduzca Solo Letras </b><br>';
        validado = false;
    }

    //Fechas
    //Fechaingreso

    if (fechaingreso.value.trim() == "" || fechaingreso.value.lenght == 0) {
        msgFechaingreso.innerHTML += '<b>La Fecha de Ingreso No Puede Estar Vacia</b><br>';
        validado = false;
    } else if (!rgxFecha.test(fechaingreso.value)) {
        msgFechaingreso.innerHTML += '<b>La Fecha No cumple con el Formato deseado ( YYYY-MM-DD )</b><br>';
        validado = false;
    }

    //Fechasalida

    if (fechasalida.value.trim() == "" || fechasalida.value.lenght == 0) {
        msgFechasalida.innerHTML += '<b>La Fecha de Ingreso No Puede Estar Vacia</b><br>';
        validado = false;
    } else if (!rgxFecha.test(fechasalida.value)) {
        msgFechasalida.innerHTML += '<b>La Fecha No cumple con el Formato deseado ( YYYY-MM-DD )</b><br>';
        validado = false;
    }


    //Diashospedaje
    if (diashospedaje.value.trim() == "" || diashospedaje.value.lenght == 0) {
        msgDiashospedaje.innerHTML += '<b>Este campo No Puede Estar Vacio</b><br>';
        validado = false;
    } else if (!rgxEntero.test(diashospedaje.value)) {
        msgDiashospedaje.innerHTML += '<b>Ingrese Solo Números</b><br>';
        validado = false;
    }
    //Valordia
    if (valordia.value.trim() == "" || valordia.value.lenght == 0) {
        msgValordia.innerHTML += '<b>Este campo No Puede Estar Vacio</b><br>';
        validado = false;
    } else if (!rgxEntero.test(valordia.value)) {
        msgValordia.innerHTML += '<b>Ingrese Solo Números</b><br>';
        validado = false;
    }





    return validado;
}