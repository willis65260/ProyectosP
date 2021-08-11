/*eslint no-eval:0*/
import React, { useState } from 'react'
import './Estilos/calc.css'
import Result from './components/Result';
import MathOperations from './components/MathOperations'
import DeleteOperations from './components/DeleteOperations';
import Numbers from './components/Numbers';
import words from 'lodash.words'
function App() {
  const [stack, setStack] = useState("")
  const items = words(stack, /[^-^+^*^/]/g)
  const value = items.length > 0 ? items[items.length-1] :  0
  return (
    <main>
      <div className="react-calculator">
        <Result value={value+""} />
        <Numbers onClickNumber={
          number => {
            setStack(`${stack}${number}`)
          }
        } />
        <MathOperations
          onClickOperation={(operation) => {
            setStack(`${stack}${operation}`)
          }}
          onClickEqual={operation => {
            let numero = eval(stack)
            isNaN(numero) ? setStack("Math error") : setStack(eval(stack).toString())
          }}
        />
        <DeleteOperations
          onContentClerear={(operation) => {
            setStack("");
          }}
          onContentDelete={(operation) => {
            if (stack.length > 0) {
              setStack(stack.substring(0, stack.length - 1))
            }
          }}
        />
      </div>
    </main>
  );
}

export default App;