
function generoValidar() {
    let validado = true;

    let msgs = document.querySelectorAll("small[id^='msg']");

    //Limpiamos los msg con este for of
    for (let m of msgs) {
        m.innerHTML = "";
    }


    //Campos
    let genero = document.querySelector("#genero");

    //Msg
    let msgGenero = document.querySelector("#msgGenero");

    //Rgx

    //Validaciones
    //Genero

    if (genero.value.trim() == "" || genero.value.lenght == 0) {
        msgGenero.innerHTML += '<b>EL Género No Puede Estar Vacio</b><br>';
        validado = false;
    }




    return validado;
}