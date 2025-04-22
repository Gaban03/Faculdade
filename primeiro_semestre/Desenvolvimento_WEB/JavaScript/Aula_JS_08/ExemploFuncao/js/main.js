const lista_itens = {
    item1: 'Arroz',
    item2: 'Feijão',
    quantidade1: 2,
    quantidade2: 3,
    mostrar_itens: function(){
        alert('comprei '+lista_itens.quantidade1+' pacotes de '+ lista_itens.item1)
    }
}
lista_itens.mostrar_itens(); // Chamada da função de saída do objeto para teste na página