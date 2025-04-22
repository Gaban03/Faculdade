// Status Maquina --- INICIO ---

let ON = document.getElementById("circuloON");
let OFF = document.getElementById("circuloOFF");
let RUN = document.getElementById("circuloRUN");


mqnON = false;
mqnOFF = true;
mqnRUN = false;


if (mqnOFF) {
    OFF.style.opacity = "1";
} else {
    OFF.style.opacity = "0.3";
}

if (mqnON) {
    ON.style.opacity = "1";
} else {
    ON.style.opacity = "0.3";
}

if (mqnRUN){
    RUN.style.opacity = "1";
} else {
    RUN.style.opacity = "0.3";
}

// Status maquina ---FIM---



// Taxa de avanço ---INICIO---

let taxaDeAvanco = 0;
document.getElementById("valorAvanco").innerHTML = "F: " + taxaDeAvanco;

// Taxa de avanço ---FIM---


// RPM ---INICIO---


let taxaRPM = document.getElementById("valorRPM");
let rpm = 110;

taxaRPM.style.strokeDasharray = rpm;

// RPM ---FIM---