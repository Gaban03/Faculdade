
setInterval(() =>{
    relogio(),
    data(),
    contador(),
    temperatura()
}, /*5000*/)


// Função contador

function contador(){
    let texto = document.getElementById("nome");

    texto = texto.value;

    let valorTexto = texto.length;

   document.getElementById("resultadoTamanhoTexto").innerHTML = 'Tamanho do texto: ' + valorTexto;
}


// Data e Relogio função
let dia = document.getElementById("dias");
let mes = document.getElementById("meses");
let ano = document.getElementById("anos");
let horas = document.getElementById("horas");
let minutos = document.getElementById("minutos");
let segundos = document.getElementById("segundos");

function relogio(){

    let h = new Date().getHours()
    let m = new Date().getMinutes()
    let s = new Date().getSeconds()

    h = (h < 10) ? '0'+ h : h
    m = (m < 10) ? '0'+ m : m
    s = (s < 10) ? '0'+ s : s


    horas.innerHTML = h + ':';
    minutos.innerHTML = m + ':'; 
    segundos.innerHTML = s; 
}

function data(){

    let date = new Date().getDate()
    let me = new Date().getMonth()
    let a = new Date().getFullYear()

    dia.innerHTML = date + '/';
    mes.innerHTML = me + 1 + '/';
    ano.innerHTML = a;
}


// Função conversor

function temperatura(){
    let valorCelcius = document.getElementById("grausCelcius").value;

    let resultado = valorCelcius * 1.8 + 32;

    document.getElementById("resultadoConversao").innerHTML = 'Conversão em Fahrenheit: ' + resultado + ' °F';
}