function validaNotas() {
    let validado = true;

    let msgs = document.querySelectorAll("small[id^='msg']");

    //Limpiamos los msg con este for of
    for (let m of msgs) {
        m.innerHTML = "";
    }

    //Campos 
    let cedula = document.getElementById("cedula");
    let nombre = document.getElementById("nombre");
    let n1 = document.getElementById("nota1");
    let n2 = document.getElementById("nota2");
    let n3 = document.getElementById("nota3");

    //rgx
    let rgxNombre = /^[a-zA-Z Á]{3,40}$/;
    let rgxCedula = /^((\d{8})|(\d{10})|(\d{11})|(\d{6}-\d{5}))?$/;
    let rgxFloat = /^\d{1,1}\.\d{1,2}$/

    //msg

    let msgCedula = document.querySelector("#msgCedula");
    let msgNombre = document.querySelector("#msgNombre");
    let msgNota1 = document.querySelector("#msgNota1");
    let msgNota2 = document.querySelector("#msgNota2");
    let msgNota3 = document.querySelector("#msgNota3");

    //Condiciones

    //Cedula
    if (cedula.value.trim() == "" || cedula.value.lenght == 0) {
        msgCedula.innerHTML += '<b>La Cedula No Puede Estar Vacio</b><br>';
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

    //Notas 
    //Nota1

    if (n1.value.trim() == "" || n1.value.length == 0) {
        msgNota1.innerHTML += '<b>La nota 1 No Puede Estar Vacio</b><br>';
        validado = false;
    } else if (!rgxFloat.test(n1.value)) {
        msgNota1.innerHTML += '<b>Introduzca Solo Numeros o Formato Incorrecto Ej:(1.5) </b><br>'
        validado = false;
    }

    //Nota2
    if (n2.value.trim() == "" || n2.value.length == 0) {
        msgNota2.innerHTML += '<b>La nota 2 No Puede Estar Vacio</b><br>';
        validado = false;
    } else if (!rgxFloat.test(n2.value)) {
        msgNota2.innerHTML += '<b>Introduzca Solo Numeros o Formato Incorrecto Ej:(1.5) </b><br>'
        validado = false;
    }

    //Nota3
    if (n3.value.trim() == "" || n3.value.length == 0) {
        msgNota3.innerHTML += '<b>La nota 3 No Puede Estar Vacio</b><br>';
        validado = false;
    } else if (!rgxFloat.test(n3.value)) {
        msgNota3.innerHTML += '<b>Introduzca Solo Numeros o Formato Incorrecto Ej:(1.5) </b><br>';
        validado = false;
    }

    return validado;
}