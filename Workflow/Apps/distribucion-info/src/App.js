import React, { useState } from 'react';
import logo from './logo.svg';
import './App.css';
import Banner from './Componentes/Banner/Banner'
import Cuerpo from './Componentes/Cuerpo/Cuerpo'
import PieDePagina from './Componentes/Footer/PiePagina';
import ReactDOM from 'react-dom';
import './CSS/Bootstrap/css/bootstrapD.css'

function App() {

  function useStickyState(defaultValue, key) {
    const [value, setValue] = React.useState(() => {
      const stickyValue = window.localStorage.getItem(key);
      return stickyValue !== null
        ? JSON.parse(stickyValue)
        : defaultValue;
    });
    React.useEffect(() => {
      window.localStorage.setItem(key, JSON.stringify(value));
    }, [key, value]);
    return [value, setValue];
  }

  const [Elem, setElem] = useState(<Banner />);
  // const [cont, setCont] = useStickyState(0, "cont");
  const [cont, setCont] = useState(0);

  //! hay que tener cuidado con esto porque guarda en memoria
  //const [cont, setCont] = useStickyState(0, "cont");
  // var elem = 
  function CualBotonSePresionoBtnClick(btnEle) {
    console.log(btnEle)
    if (btnEle == 1) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Banner />)
    }
    if (btnEle == 2) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Cuerpo />)
    }
  }


  return (
    <>
      <div class="">
        
        
      </div>

      <div className="App">
      <div class="d-flex" >
        <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina1" onClick={() => CualBotonSePresionoBtnClick(1)} /></div>
        <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina2" onClick={() => CualBotonSePresionoBtnClick(2)} /></div>
        <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina3" onClick={() => CualBotonSePresionoBtnClick(3)} /></div>
        <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina4" onClick={() => CualBotonSePresionoBtnClick(4)} /></div>
        <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina5" onClick={() => CualBotonSePresionoBtnClick(5)} /></div>
        <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina6" onClick={() => CualBotonSePresionoBtnClick(6)} /></div>
        <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina7" onClick={() => CualBotonSePresionoBtnClick(7)} /></div>
        <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina8" onClick={() => CualBotonSePresionoBtnClick(8)} /></div>
        </div>
        <div class="d-flex" >
        <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina9" onClick={() => CualBotonSePresionoBtnClick(9)} /></div>
        <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina10" onClick={() => CualBotonSePresionoBtnClick(10)} /></div>
        <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina11" onClick={() => CualBotonSePresionoBtnClick(11)} /></div>
        <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina12" onClick={() => CualBotonSePresionoBtnClick(12)} /></div>
        <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina13" onClick={() => CualBotonSePresionoBtnClick(13)} /></div>
        <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina14" onClick={() => CualBotonSePresionoBtnClick(14)} /></div>
        <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina15" onClick={() => CualBotonSePresionoBtnClick(15)} /></div>
        <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina16" onClick={() => CualBotonSePresionoBtnClick(16)} /></div>
        </div>
        {Elem}

        {/* <p>You clicked {cont} times</p>
        <button onClick={() => setCont(cont + 1)}>
          Click me
      </button> */}

      </div>
    </>

  );
}

export default App;
