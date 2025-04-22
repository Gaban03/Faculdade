function somar(){
    let n1= parseInt(document.getElementById("n1").value);
    let n2= parseInt(document.getElementById("n2").value);
    let res = n1+n2
    document.getElementById("resp").innerHTML = res;
}

function subtrair(){
    let n1= parseInt(document.getElementById("n1").value);
    let n2= parseInt(document.getElementById("n2").value);
    let res = n1-n2
    document.getElementById("resp").innerHTML = res;
}