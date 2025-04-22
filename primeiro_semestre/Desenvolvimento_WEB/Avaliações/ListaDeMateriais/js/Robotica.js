let listaDeRobotica = [];

const form = document.getElementById("form-itens");
const itensInput = document.getElementById("receber-item");
const codigoIdent = document.getElementById("receber-codigo");
const ulItens = document.getElementById("lista-de-robotica");
const ulItensComprados = document.getElementById("itens-comprados");
const listaRecuperada = localStorage.getItem('listaDeRobotica');

function atualizaLocalStorage() {
    localStorage.setItem('listaDeRobotica', JSON.stringify(listaDeRobotica));
}

if (listaRecuperada) {
    listaDeRobotica = JSON.parse(listaRecuperada);
    mostrarItem();
} else {
    listaDeRobotica = [];
}

form.addEventListener("submit", function (evento) {
    evento.preventDefault();
    salvarItem();
    mostrarItem();
    itensInput.focus();
});

function salvarItem() {
    const comprasItem = itensInput.value;
    const codigoItem = codigoIdent.value;

    if (comprasItem && codigoItem) {
        listaDeRobotica.push({
            valor: comprasItem,
            codigo: codigoItem,
            checar: false
        });
    }
    itensInput.value = '';
    codigoIdent.value = '';
}

function mostrarItem() {
    ulItens.innerHTML = '';
    ulItensComprados.innerHTML = '';

    listaDeRobotica.forEach((elemento, index) => {
        if (elemento.checar) {
            ulItensComprados.innerHTML += `
                <li class="item-compra is-flex is-justify-content-space-between" data-value="${index}">
                    <div>
                        <input type="checkbox" checked class="is-clickable">
                        <span class="itens-comprados is-size-5">${elemento.codigo} - ${elemento.valor}</span>
                        <i class="fa-solid fa-trash is-clickable deletar"></i>
                    </div>
                </li>
            `;
        } else {
            ulItens.innerHTML += `
                <li class="item-compra is-flex is-justify-content-space-between" data-value="${index}">
                    <div>
                        <input type="checkbox" class="is-clickable">
                        <span class="is-size-5">${elemento.codigo} - ${elemento.valor}</span>
                        <i class="fa-solid fa-trash is-clickable deletar"></i>
                    </div>
                </li>
            `;
        }
    });

    const inputCheck = document.querySelectorAll('input[type="checkbox"]');
    inputCheck.forEach(i => {
        i.addEventListener('click', (evento) => {
            const valorDoElemento = evento.target.parentElement.parentElement.getAttribute('data-value');
            listaDeRobotica[valorDoElemento].checar = evento.target.checked;

            if (evento.target.checked) {
                ulItensComprados.appendChild(evento.target.parentElement.parentElement);
            } else {
                ulItens.appendChild(evento.target.parentElement.parentElement);
            }
            console.log(listaDeRobotica[valorDoElemento].checar);
            atualizaLocalStorage();
        });
    });

    const deletarObjetos = document.querySelectorAll(".deletar");

    deletarObjetos.forEach(i => {
        i.addEventListener('click', (evento) => {
            valorDoElemento = evento.target.parentElement.getAttribute('data-value');
            listaDeRobotica.splice(valorDoElemento, 1);
            mostrarItem();
        });
    });

    atualizaLocalStorage();
}
