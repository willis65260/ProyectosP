import React, { useState } from 'react';
import './App.css';
import Pagina1 from './Componentes/Paginas/Pagina1'
import Pagina2 from './Componentes/Paginas/Pagina2'
import './CSS/Bootstrap/css/bootstrapD.css'
import Pagina3 from './Componentes/Paginas/Pagina3';
import Pagina4 from './Componentes/Paginas/Pagina4';
import Pagina5 from './Componentes/Paginas/Pagina5';
// import Google from './Componentes/Paginas/Google';
import Pagina7 from './Componentes/Paginas/Pagina7';
import Pagina8 from './Componentes/Paginas/Pagina8';
import Pagina9 from './Componentes/Paginas/Pagina9';
import Pagina10 from './Componentes/Paginas/Pagina10';
import Pagina11 from './Componentes/Paginas/Pagina11';
import Pagina12 from './Componentes/Paginas/Pagina12';
import Pagina13 from './Componentes/Paginas/Pagina13';
import Pagina14 from './Componentes/Paginas/Pagina14';
import Pagina15 from './Componentes/Paginas/Pregunta15';
import Pagina16 from './Componentes/Paginas/Pagina16';
import Pagina17 from './Componentes/Paginas/Pagina17';
import Pagina18 from './Componentes/Paginas/Pagina18';

function App() {

  //TODO esto es para hacer que un valor se mantenga en los cookies 
  //TODO de la pagina aunque esta se recargue o se cierre
  //TODO de aqui

  // function useStickyState(defaultValue, key) {
  //   const [value, setValue] = React.useState(() => {
  //     const stickyValue = window.localStorage.getItem(key);
  //     return stickyValue !== null
  //       ? JSON.parse(stickyValue)
  //       : defaultValue;
  //   });
  //   React.useEffect(() => {
  //     window.localStorage.setItem(key, JSON.stringify(value));
  //   }, [key, value]);
  //   return [value, setValue];
  // }
  //TODO hata aqui

  const [Elem, setElem] = useState(<Pagina1 />);
  // const [cont, setCont] = useStickyState(0, "cont");
  // const [cont, setCont] = useState(0);

  //! hay que tener cuidado con esto porque guarda en memoria
  //const [cont, setCont] = useStickyState(0, "cont");
  // var elem = 
  function CualBotonSePresionoBtnClick(btnEle) {
    console.log(btnEle)
    if (btnEle === 1) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Pagina1 />)
    }
    else if (btnEle === 2) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Pagina2 />)
    }
    else if (btnEle === 3) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Pagina3 />)
    } else if (btnEle === 4) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Pagina4 />)
    } else if (btnEle === 5) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Pagina5 />)
    }else if (btnEle === 6) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      // setElem(<Google />)
    }else if (btnEle === 7) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Pagina7 />)
    }else if (btnEle === 8) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Pagina8 />)
    }else if (btnEle === 9) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Pagina9 />)
    }else if (btnEle === 10) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Pagina10 />)
    }else if (btnEle === 11) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Pagina11 />)
    }else if (btnEle === 12) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Pagina12 />)
    }else if (btnEle === 13) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Pagina13 />)
    }else if (btnEle === 14) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Pagina14 />)
    }else if (btnEle === 15) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Pagina15 />)
    }else if (btnEle === 16) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Pagina16 />)
    }else if (btnEle === 17) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Pagina17 />)
    }else if (btnEle === 18) {
      // TODO Actualiza el Dom al modificar el estado del elemento
      setElem(<Pagina18 />)
    }
  }


  return (
    <>

      <div className="App">
        <div class="d-flex" >
          <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Boton 1" onClick={() => CualBotonSePresionoBtnClick(1)} /></div>
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
        <div class="d-flex" >
          <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina17" onClick={() => CualBotonSePresionoBtnClick(17)} /></div>
          <div class="mx-auto"><input type="button" class="btn btn-info my-1" value="Pagina18" onClick={() => CualBotonSePresionoBtnClick(18)} /></div>
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