import './App.css';

import './styles/estilos.css'
import React, { useState } from 'react'

import Menu from './Components/Menu';
import Slider from './Components/Slider';
import Botonera from './Components/Botonera';
import Cambio from './Components/Cambio';

import 'bootstrap/dist/css/bootstrap.min.css';
import './styles/Bootstrap/css/bootstrapD.css'

function App() {
  const [Componente, setComponente] = useState(<Cambio nombre="Hola" />)

  const OnClickCambio = function (comp) {
    setComponente(comp)
  }

  return (
    <div className="App container">
      <br />
      <div className="row">
        <Menu />
      </div>
      <div className="row">
        <Slider />
      </div>
      <div className="row">
        <br />
        <div className="col-6">
          <Botonera evento={OnClickCambio} />
        </div>
        <div className="col">
          {Componente}
        </div>

      </div>
    </div>
  );
}

export default App;
