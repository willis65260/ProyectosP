import React from 'react'
// import './App.css';
import './Estilos/calc.css'
import Result from './components/Result';
import Button from './components/Button';

function App() {

  const clickHandlerFuntion = (text)=>{
    console.log("el rexto recibido es :",text);
  }

  return (
    <main>
      <div className="react-calculator">
        <Result value={undefined}/>
        <div className="numbers">
          <Button text={"1"} clickHandler={clickHandlerFuntion}/>
          <button>2</button>
          <button>3</button>
          <button>4</button>
          <button>5</button>
          <button>6</button>
          <button>7</button>
          <button>8</button>
          <button>9</button>
          <button>0</button>
        </div>
        <div className="math-operations">
          <button>-</button>
          <button>+</button>
          <button>*</button>
          <button>/</button>
          <button>=</button>
        </div>
        <div className="functions">
          <button>clear</button>
          <button>r</button>
        </div>
        
      </div>
    </main>
  );
}

export default App;
