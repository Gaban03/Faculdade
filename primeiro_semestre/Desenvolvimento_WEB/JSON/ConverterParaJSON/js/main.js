const ti={
    turma: "ADS",
    ano: 2024,
    UC: ["LIP", "BCD", "DWEB", "AUI"]
}

// Converte de JavaScript para JSON
let texto = JSON.stringify(ti)
document.getElementById("prog").innerHTML = texto

// Não exibe pois está no formato JSON
console.log(texto.turma)

// Converte de JSON para JavaScript
let obj = JSON.parse(texto)
console.log(obj.turma)

// Chama BCD que se encontra na posição um dentro do vetor UC (Unidade Curricular), isso na formatação JS
console.log(obj.UC[1])

function buscaCEP(){
    let input = document.getElementById("cep").value
    const valor = new XMLHttpRequest();
    valor.open('GET', 'https://viacep.com.br/ws/' + input + '/json')
    valor.send()
    valor.onload = function(){
        document.getElementById("texto").innerHTML = this.responseText

        //transformando em objeto
        let obj = JSON.parse(this.responseText)
        let logradouro = obj.logradouro
        let cidade = obj.localidade
        let estado = obj.uf

        document.getElementById('texto').innerHTML = "Logradouro: "+logradouro+"<br>"+"Cidade: "+cidade+"<br>"+"Estado: "+estado
    }
}