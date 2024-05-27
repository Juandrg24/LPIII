function cantanteValidar() {
    let validado = true;

    let msgs = document.querySelectorAll("small[id^='msg']");

    //Limpiamos los msg con este for of
    for (let m of msgs) {
        m.innerHTML = "";
    }

    //Campos
    let nombre = document.getElementById("nombre");
    let pais = document.getElementById("pais");
    let integrantes = document.getElementById("integrantes");
    let generomusical = document.getElementById("generomusical");

    //Msg
    let msgNombre = document.querySelector("#msgNombre");
    let msgPais = document.querySelector("#msgPais");
    let msgIntegrantes = document.querySelector("#msgIntegrantes");
    let msgSelectGm = document.querySelector("#msgSelectGm");

    //Rgx
    let rgxNombre = /^[a-zA-Z Á]{3,80}$/;
    let rgxPais = /^[a-zA-Z Á]{4,80}$/;
    let rgxEntero = /^(?:\+|-)?\d+$/;

    //Validaciones

    //Nombre
    if (nombre.value.trim() == "" || nombre.value.length == 0) {
        msgNombre.innerHTML += '<b>El Nombre No Puede Estar Vacio</b><br>';
        validado = false;
    } else if (!rgxNombre.test(nombre.value)) {
        msgNombre.innerHTML += '<b>No Cumple Con El Formato Solo Letras</b><br>';
        validado = false;
    }

    //Pais
    if (pais.value.trim() == "" || pais.value.length == 0) {
        msgPais.innerHTML += '<b>El País No Puede Estar Vacio</b><br>';
        validado = false;
    }else if(!rgxPais.test(pais.value)){
        msgPais.innerHTML += '<b>No Cumple Con El Formato Solo Letras</b><br>';
        validado = false;
    }

    //Integrantes 
    if (integrantes.value.trim() == "" || integrantes.value.length == 0) {
        msgIntegrantes.innerHTML += '<b>Los Integantes No Pueden Estar Vacio</b><br>';
        validado = false;
    }else if(!rgxEntero.test(integrantes.value)){
        msgIntegrantes.innerHTML += '<b>No Cumple Con El Formato Solo Números</b><br>';
        validado = false;
    }

    //Genero Musical
    if (generomusical.selectedIndex == 0) {
        msgSelectGm.innerHTML += '<b>Seleccionar una opcion valida</b><br>';
        validado = false;
    }



    return validado;

}