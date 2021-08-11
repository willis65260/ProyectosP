import logo from './logo.svg';
import './App.css';
import { makeStyles } from '@material-ui/core/styles';
import TextField from '@material-ui/core/TextField';
import * as React from 'react';
import isWeekend from 'date-fns/isWeekend';
import AdapterDateFns from '@material-ui/lab/AdapterDateFns';
import LocalizaitonProvider from '@material-ui/lab/LocalizationProvider';
import StaticDatePicker from '@material-ui/lab/StaticDatePicker';

function App() {
  const [value, setValue] = React.useState(new Date());


  return (
    <div className="App">
      
      <LocalizaitonProvider dateAdapter={AdapterDateFns}>
      <StaticDatePicker
        orientation="landscape"
        openTo="day"
        value={value}
        shouldDisableDate={isWeekend}
        onChange={(newValue) => {
          setValue(newValue);
        }}
        renderInput={(params) => <TextField {...params} variant="standard" />}
      />
    </LocalizaitonProvider>

    </div>
  );
}

export default App;
