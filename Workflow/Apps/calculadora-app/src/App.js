import logo from './logo.svg';
import './App.css';
import Hola from './components/Hola'
import Bread from './components/Bread';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <Bread/>
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <Hola/>
      </header>
    </div>
  );
}

export default App;
