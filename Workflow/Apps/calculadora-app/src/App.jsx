import React from 'react'
// import './App.css';
import './Estilos/calc.css'
import Result from './components/Result';
// import Button from './components/Button';
import MathOperations from './components/MathOperations'
import DeleteOperations from './components/DeleteOperations';
import Numbers from './components/Numbers';


function App() {


  return (
    <main>
      <div className="react-calculator">

        <Result value={undefined} />

        <Numbers onClickNumber={
          number=>{
            console.log("El numero es ",number)
          }
        } />

        <MathOperations
          onClickOperation={(operation) => console.log("la operacion es ", operation)}
          onClickEqual={operation => console.log("la operacion es ", operation)}
        />
        <DeleteOperations
          onContentDelete={(operation) => console.log("la borradas es ", operation)}
          onContentClerear={(operation) => console.log("la borrada es ", operation)}
        />

      </div>
    </main>
  );
}

export default App;