let horas = document.getElementById("horas");
let minutos = document.getElementById("minutos");
let segundos = document.getElementById("segundos");
let milisegundos = document.getElementById("milisegundos");



let hora = 0;
let minuto = 0;
let segundo = 0;
let milisegundo = 0;

let cron;

document.container.iniciar.onclick = () => iniciarCronometro();
document.container.pausar.onclick = () => pausarCronometro();
document.container.reiniciar.onclick = () => reiniciarCronometro();


function iniciarCronometro() {
    pausarCronometro();
    cron = setInterval(() =>{
        timer (); }, 10);
}

function pausarCronometro() {
    clearInterval(cron);
}

function reiniciarCronometro() {
    horas
}

function timer() {
    if ((milisegundo)){

    }
}