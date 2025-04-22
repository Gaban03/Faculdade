import { useState } from 'react'
import './App.css'
import Comum from './componentes/comum/Comum'
import Compprop from './componentes/compprop/Compprop'
import Pessoas from './componentes/pessoas/Pessoas'
import Entrada from './componentes/entrada/Entrada'

function App() {
  const [count, setCount] = useState(0)

  return( <div> 
      <Comum />
      <Compprop nome='passagem de valores' />
      <Pessoas nome='Gaban' telefone='(16)991000062' email='gabanvinicius724@gmail.com' />
      <Entrada />
  </div>
)}

export default App
