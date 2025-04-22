import { useState } from "react";
import Compprop from "../compprop/Compprop";

function Entrada(){
    const [nome, setNome] = useState('');
    const [nomeExibido, setNomeExibido] = useState('');
    const [novoNome, setNovoNome] = useState('');
    return(
        <div>
            <hr />
            <h2>Exemplo com entrada de dados</h2>
            <input type="text"  
                value={nome}
                onChange={(e) => setNome(e.target.value)} 
            />
            <button onClick={() => setNomeExibido(nome)}>
              {nomeExibido}
            </button>
            <button onClick={() => setNovoNome(nome)}>
                <Compprop nome={novoNome} />
            </button>
        </div>
    )
}
export default Entrada