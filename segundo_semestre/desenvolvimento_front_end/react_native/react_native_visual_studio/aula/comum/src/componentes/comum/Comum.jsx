const valor = 100;
const nome = 'senai';
const novoNome = nome.toUpperCase();
const url = 'https://via.placeholder.com/200'


function Soma(n1,n2){
    return n1 + n2
} 


function Comum(){
    return(
        <div>
            <h2>Testando Comum</h2>
            <hr />
            <h2>Exibir mensagem</h2>   
            <p>Meu elemento</p>
            <hr />
            <h2>Usando váriavel no parágrafo</h2>
            <p>O valor da variável é: {valor}</p>
            <p>O nome {nome} em caixa alta {novoNome}</p>
            <hr />
            <h2>Usando imagem para exibir</h2>
            <img src={url} alt="figura de teste" />
            <hr />
            <h2>Funções com parâmetro</h2>
            <p>O resultado é {Soma(1,2)}</p>
        </div> 
    )
}
export default Comum