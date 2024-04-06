function estudiante() {
    //    1.Identificar que se va a validar
    let carnet = document.getElementById("carnet").value;
    let nombre= document.getElementById("nombre").value;
    let apellido= document.getElementById("apellido").value;
    let  fechamatricula= document.getElementById("fechamatricula").value;
    let  carrera= document.getElementById("carrera").value;
    let  semestre= document.getElementById("semestre").value;


    if (!(/^[0-9]{5,10}$/.test(carnet))) {

        alert("Carnet Incorrecto\nSolo Numeros\nMin. 5 Max. 10");
        return false;


    } else if (!(/^[a-zA-ZáéíóúÁÉÍÓñÑ ]{3,20}/.test(nombre))) {
        alert("Nombre Incorrecto\nSolo letras\nMin. 3 Max. 20");
        return false;



    } else if (!(/^[a-zA-ZáéíóúÁÉÍÓñÑ ]{3,20}/.test(apellido))) {
        alert("Apellido Incorrecto\nSolo letras\nMin. 3 Max. 20");
        return false;

    }else if (!(/^[0-9\-]{10}$/.test(fechamatricula))) {
        alert("Fecha Incorrecta\nFormato 1990-12-12");
        return false;


    } else if (!(/^[a-zA-ZáéíóúÁÉÍÓñÑ ]{6,40}/.test(carrera))) {
        alert("Carrera Incorrecto\nSolo letras\nMin. 6 Max. 40");
        return false;


    }else if (!(/^[0-9]{1,2}$/.test(semestre))) {
        alert("nro Semestre Incorrecto \nSolo numeros");
        return false;

    }else {
        return true;
    }


} 
