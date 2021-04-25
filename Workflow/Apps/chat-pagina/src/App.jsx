import React,{useState} from 'react'
import DatosUsuario from './Componets/DatosUsuario';
import NombreUsuarios from './Componets/NombreUsuarios';
import SalaConv from './Componets/SalaConv';

import './Recursos/CSS/Bootstrap/css/bootstrapD.css'
import './Recursos/CSS/estilos.css'
import "https://code.jquery.com/jquery-3.2.1.slim.min.js"




function App() {

  const [Elem, setElem] = useState(<DatosUsuario imagen={"no hay usuario"} fotografia={"no hay usuario"} documento={"no hay usuario"} />);

  function clickHandlerFuntion (text,imagen,fotografias,descripcion) {
    console.log("Se ha actualizado el usuario");
    setElem(<DatosUsuario usuario={text} imagen={imagen} fotografia={fotografias} documento={descripcion} />)
    

  }

  return (
    // este va a ser el Grupo
    <div className="contenedor">
      <div className="row">
        <div className="col">
          <NombreUsuarios elemento={Elem} clickHandler={clickHandlerFuntion}/>
        </div>
        <div className="col-6">
          <SalaConv />
        </div>
        <div className="col">
          {Elem}
        </div>
      </div>
    </div>
  );
}

export default App;
