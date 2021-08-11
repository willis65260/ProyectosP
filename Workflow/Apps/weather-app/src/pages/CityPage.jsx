import React from 'react';
import Grid from '@material-ui/core/Grid'
import CityInfo from '../Components/CityInfo/CityInfo'
import Weather from '../Components/Weather/Weather'
import WeatherDetails from '../Components/WeatherDetails/WeatherDetails'
import ForecastChart from '../Components/ForecastChart/ForecastChart'
import Forecast from '../Components/Forecast/Forecast'
import AppFrame from '../Components/AppFrame/AppFrame'
import Paper from '@material-ui/core/Paper'

const CityPage = () => {

    const city="Chupapimuñeño"
    const country="Mexico"
    const state="sunny"
    const temperature=32
    const humidity=20
    const wind=10
    const data = [
        {
            "dayHour": "Jue 18",
            "min": 14,
            "max": 22
        }, {
            "dayHour": "Vie 06",
            "min": 18,
            "max": 27
        }, {
            "dayHour": "Vie 12",
            "min": 18,
            "max": 28
        }, {
            "dayHour": "Vie 18",
            "min": 18,
            "max": 25
        }, {
            "dayHour": "Sab 06",
            "min": 15,
            "max": 22
        }, {
            "dayHour": "Sab 12",
            "min": 12,
            "max": 19
        },
    ]
    const forecastItemList = [
        { weekDay: "Lunes", hour: 18, state: "sunny", temperature: 17 },
        { weekDay: "Martes", hour: 18, state: "cloud", temperature: 17 },
        { weekDay: "Miercoles", hour: 18, state: "cloudy", temperature: 17 },
        { weekDay: "Jueves", hour: 18, state: "rainy", temperature: 17 },
        { weekDay: "Viernes", hour: 18, state: "sunny", temperature: 17 },
        { weekDay: "Sabado", hour: 18, state: "cloud", temperature: 17 },
        { weekDay: "Domingo", hour: 18, state: "rainy", temperature: 17 }
    ]

    return (
    <AppFrame>
        <Paper elevation={3}>
       <Grid container justify='space-around' direction='column'spacing={16}>
           <Grid container item xs={12} justify="center" alignItems="flex-end"><CityInfo city={city} country={country}/>
           <Grid container item xs={12} justify="center">
            <Weather state={state} temperature={temperature}/>
             <WeatherDetails humidity={humidity} wind={wind}/>
          </Grid>
       </Grid>
       <Grid item >
        <ForecastChart data={data}></ForecastChart>
       </Grid>
       <Grid item >
       <Forecast forecastItemlist={forecastItemList}></Forecast>
       </Grid>
    </Grid>
    </Paper>
 </AppFrame>
    );
};


export default CityPage;