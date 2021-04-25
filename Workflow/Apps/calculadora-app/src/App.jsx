/*eslint no-eval:0*/
import React, { useState } from 'react'
// import './App.css';
import './Estilos/calc.css'
import Result from './components/Result';
// import Button from './components/Button';
import MathOperations from './components/MathOperations'
import DeleteOperations from './components/DeleteOperations';
import Numbers from './components/Numbers';



function App() {

  // const arrayTextFunctionModificaTexto = useState("0")
  // const texto = arrayTextFunctionModificaTexto[0]
  // const funcionModificaTexto = arrayTextFunctionModificaTexto[1]

  const [stack, setStack] = useState("")
  // const [stack, useStack] = useState("0")



  return (
    <main>
      <div className="react-calculator">

        <Result value={stack} />

        <Numbers onClickNumber={
          number => {
            console.log("El numero es ", number)
            setStack(`${stack}${number}`)
          }
        } />

        <MathOperations
          onClickOperation={(operation) => {
            console.log("la operacion es ", operation)
            setStack(`${stack}${operation}`)
          }}
          onClickEqual={operation => {
            console.log("la borrada es ", operation)
            let numero= eval(stack)
            isNaN(numero) ? setStack("Math error") :  setStack(eval(stack).toString()) 
          }}
        />
        <DeleteOperations
          onContentClerear={(operation) => {
            setStack("");
          }}
          onContentDelete={(operation) => {
            if (stack.length > 0) {
              setStack(stack.substring(0, stack.length - 1))
              console.log("la borrada es ", operation)
            }
          }}
        />

      </div>
    </main>
  );
}

export default App;