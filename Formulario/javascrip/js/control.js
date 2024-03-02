
//Funcion Sumar
function suma() {

    // Obtenemos el valor de una caja de texto por su id 
    let valor1 = document.getElementById("valor1").value;
    let valor2 = document.getElementById("valor2").value;

    let sumar = parseFloat(valor1) + parseFloat(valor2);
    document.form1.resultado.value = sumar;
}

//Funcion Resta
function resta() {

    // Obtenemos el valor de una caja de texto por su id 
    let valor1 = document.getElementById("valor1").value;
    let valor2 = document.getElementById("valor2").value;

    let restar = parseFloat(valor1) - parseFloat(valor2);
    document.form1.resultado.value = restar;
}

//Funcion multiplicar
function multiplica() {

    // Obtenemos el valor de una caja de texto por su id 
    let valor1 = document.getElementById("valor1").value;
    let valor2 = document.getElementById("valor2").value;

    let multiplicar = parseFloat(valor1) * parseFloat(valor2);
    document.form1.resultado.value = multiplicar;
}

//Funcion dividir
function divide() {

    // Obtenemos el valor de una caja de texto por su id 
    let valor1 = document.getElementById("valor1").value;
    let valor2 = document.getElementById("valor2").value;

    let dividir = parseFloat(valor1)/ parseFloat(valor2);
    document.form1.resultado.value = dividir;
}
