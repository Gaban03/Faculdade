const input_tel_fixo = document.getElementById("tel_fixo");
const input_cpf = document.getElementById("user_cpf")
const input_tel_celular = document.getElementById("tel_celular")

input_tel_fixo.addEventListener("keypress",()=>{
    let inputLength = input_tel_fixo.value.length

    if(inputLength == 0){
        input_tel_fixo.value += '(' 
    }else if (inputLength == 3) {
        input_tel_fixo.value += ')'
    }
});

input_cpf.addEventListener('keypress' ,()=>{
    let inputLength = input_cpf.value.length

    if(inputLength == 3 || inputLength == 7){
        input_cpf.value += '.'
    }else if(inputLength == 11){
        input_cpf.value += '-'
    }
});

input_tel_celular.addEventListener("keypress",()=>{
    let inputLength = input_tel_celular.value.length

    if(inputLength == 0){
        input_tel_celular.value += '+55('
    } else if (inputLength == 6) {
        input_tel_celular.value += ')'
    }
})