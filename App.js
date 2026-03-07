import React, { useEffect, useState } from 'react';
import axios from 'axios';

function App(){
  const [parts,setParts] = useState([]);
  const [name,setName] = useState('');
  const [quantity,setQuantity] = useState(0);

  const token = localStorage.getItem('token');

  useEffect(()=>{
    if(token){
      axios.get('http://localhost:5000/api/parts',{
        headers:{Authorization:'Bearer '+token}
      }).then(res=>setParts(res.data))
        .catch(err=>console.log(err));
    }
  },[token]);

  const addPart=()=>{
    axios.post('http://localhost:5000/api/parts',
      {code:Date.now(),name,quantity},
      {headers:{Authorization:'Bearer '+token}}
    ).then(()=>window.location.reload())
     .catch(err=>console.log(err));
  }

  return(
    <div style={{padding:40}}>
      <h1>Inventario de Piezas</h1>
      <input placeholder="Nombre" onChange={e=>setName(e.target.value)}/>
      <input type="number" placeholder="Cantidad" onChange={e=>setQuantity(e.target.value)}/>
      <button onClick={addPart}>Agregar</button>
      <ul>
        {parts.map(p=>(
          <li key={p.id}>{p.name} - {p.quantity}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;