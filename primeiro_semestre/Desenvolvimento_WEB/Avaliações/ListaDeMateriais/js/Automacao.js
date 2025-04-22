let listaDeAutomacao = [];

const form = document.getElementById("form-itens");
const itensInput = document.getElementById("receber-item");
const codigoInput = document.getElementById("receber-codigo");
const ulItens = document.getElementById("lista-de-automacao");
const ulItensComprados = document.getElementById("itens-comprados");
const listaRecuperada = localStorage.getItem('listaDeAutomacao');

function atualizaLocalStorage() {
    localStorage.setItem('listaDeAutomacao', JSON.stringify(listaDeAutomacao));
}

if (listaRecuperada) {
    listaDeAutomacao = JSON.parse(listaRecuperada);
    mostrarItem();
} else {
    listaDeAutomacao = [];
}

form.addEventListener("submit", function (evento) {
    evento.preventDefault();
    salvarItem();
    mostrarItem();
    itensInput.focus();
});

function salvarItem() {
    const codigo = codigoInput.value;
    const comprasItem = itensInput.value;

    if (codigo && comprasItem) {
        listaDeAutomacao.push({
            codigo: codigo,
            valor: comprasItem,
            checar: false
        });
    }
    codigoInput.value = '';
    itensInput.value = '';
}

function mostrarItem() {
    ulItens.innerHTML = '';
    ulItensComprados.innerHTML = '';
    
    listaDeAutomacao.forEach((elemento, index) => {
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
            listaDeAutomacao[valorDoElemento].checar = evento.target.checked;
            mostrarItem();
        });
    });

    const deletarObjetos = document.querySelectorAll(".deletar");
    deletarObjetos.forEach(i => {
        i.addEventListener('click', (evento) => {
            const valorDoElemento = evento.target.parentElement.parentElement.getAttribute('data-value');
            listaDeAutomacao.splice(valorDoElemento, 1);
            mostrarItem();
        });
    });

    atualizaLocalStorage();
}
