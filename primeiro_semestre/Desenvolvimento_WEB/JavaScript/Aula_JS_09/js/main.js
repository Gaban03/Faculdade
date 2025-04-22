// function condicao(){
//     while(form1.nome.value==""){
//         alert("Favor Preencher o campo");
//         form1.nome.value=prompt("Digite seu nome agora","");
//     }
//     alert("Obrigado, "+form1.nome.value);
// }

// condicao();

// function para(){
//     document.write("Exemplo For <br>");

//     for(i = 1; i <=10; i++){

//         document.write("Número: "+ i +"<br>");

//     }   
// }

// para();


// function verifica() {
//     valor = document.getElementById("numero").value;
    
//     res = valor%2;
//     if(res == 1){
//         document.write("O valor digitado é impar")
//     }
//     else {
//         document.write("O valor digitado é par")
//     }
// }

// verifica();

// function caso(){
//     x = document.getElementById("nome").value;
//     switch(x){
//         case "1":
//             alert("Valor selecionado 1");
//             return form1.nome.focus();
//             break;
//         case "2":
//             alert("Valor selecionado 2");
//             return form1.nome.focus();
//             break;
//         default:
//             alert("Valor fora do padrão");
//             return form1.nome.focus();
//     }
// }

function exibeImpares(){
    valor = document.getElementById("valorEntrada").value;

    for(i = 0; i <= valor; i++){
        resultadosImpares = i%2;
        if(resultadosImpares == 1) {
            document.write(i +", ");
        }
    }
}

function movermouse(){
    bt = document.getElementById("b");
    if(bt.style.backgroudColor == "gray")
        bt.style.backgroudColor = "red";
    else
        bt.style.backgroudColor = "gray";
}

function vstring(){
    valor = document.getElementById("valorEntrada").value;
    if(isNaN( valor )){
        document.write("O valor digitado não é número");
    }
    else {
        document.write("O valor digitado é um número");
    }
}

function tab(){
    for(let i = 0; i <= 10; i++){
        let tabela = document.getElementById("tb1");
        let qtdLinhas = tabela.rows.length;
        let linha = tabela.insertRow(qtdLinhas);

        let ident = linha.insertCell(0);
        let valor = linha.insertCell(1);

        ident.append("linha")
        valor.append(i);
    }
}

function data(){
    dt = new Date();
    h = new Date().getHours();
    m = new Date().getMinutes();
    d = new Date().getDate();
    document.getElementById("dt").innerHTML = dt;
    document.getElementById("h").innerHTML = h;
    document.getElementById("m").innerHTML = m;
    document.getElementById("d").innerHTML = d;
}


function mensagemDoHorario(){
    let msg = document.getElementById("mensagem")
    let h = new Date().getHours();


    if(h < 12 && h > 5){
        msg = "BOM DIA";
        document.innerHTML(msg);
    } else if (h > 12 && h < 18) {
        msg = "BOM TARDE";
        document.innerHTML(msg);
    } else if (h > 0 && h < 5) {
        msg = "BOA NOITE";
        document.innerHTML(msg);
    }

}


function nomes(){
    let lista = ["João", 16,"Maria", 15,"Carolina", 18];
    let tamanho = lista.length;
    for(let i = 0; i < tamanho; i = i + 2){
        let tabela = document.getElementById("tb2");
        let qtdLinhas = tabela.rows.length;
        let linha = tabela.insertRow(qtdLinhas);
        let nome = linha.insertCell(0);
        let idade = linha.insertCell(1);
        nome.append(lista[i]);
        idade.append(lista[i+1]);
    }
}

