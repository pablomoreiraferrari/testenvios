import { useState } from 'react';
import { FiSearch } from 'react-icons/fi'
import './styles.css';
import api from './services/api';

function App() {

  const [input, setInput] = useState('')
  const [codigo_produto, setCodigo_produto] = useState({});

  async function handleSearch(){
    if(input === ''){
      alert("Preencha com código do produto!")
      return;
    }

    try{
    const response = await api.get(`${input}/envios`);
    setCodigo_produto(response.data)
    setInput("")

    }catch{
      alert("Ops! Erro ao buscar");
      setInput("")
    }

  }
  return (
    <div className="container">
      <h1 className="title">Buscador de pedidos</h1>

      <div className="containerInput">
        <input type = "text"
        placeholder="Digite o código do produto..."
        value={input}
        onChange={(e) => setInput(e.target.value)}
        />

        <button className="buttonSearch" onClick={handleSearch}>
          <FiSearch size={25} color="#FFFF"/>  
        </button>  
      </div>
        
        <main className="main">
          <h2>Status do envio: </h2>

          <span> 1 </span>
          <span>Berry Allen</span>
          <span>1234567</span>
          <span>Produto em rota de entrega</span>
          <span>2022/03/01</span>
        </main>

    </div>
  );
}
export default App;
