/*
function Pessoas(props){
    return(
        <div>
            <hr />
            <h2>Testanto Pessoas com props</h2>
            <p>Nome: {props.nome}</p>
            <p>Telefone: {props.telefone}</p>
            <p>Email: {props.email}</p>
        </div>
    )
}
export default Pessoas
*/


function Pessoas({nome, telefone, email}){
    return(
        <div>
           <hr />
           <h2>Exemplo informações Pessoas</h2>
           <p>Nome: {nome}</p>
           <p>Telefone: {telefone}</p>
           <p>Email: {email}</p>
        </div>
    )
}
export default Pessoas