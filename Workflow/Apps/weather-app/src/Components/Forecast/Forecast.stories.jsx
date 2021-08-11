import React from 'react'
import Forecast from './Forecast'

export default {
    title:"Forecast",
    component:Forecast

}
const forecastListitem=[
    {weekDay:"Lunes",hour:18,state:"sunny",temperature:17},
    {weekDay:"Martes",hour:1,state:"cloudy",temperature:17},
    {weekDay:"Miercoles",hour:20,state:"sunny",temperature:17},
    {weekDay:"Jueves",hour:8,state:"rain",temperature:17},
    {weekDay:"viernes",hour:10,state:"sunny",temperature:17},
    {weekDay:"Sabado",hour:11,state:"sunny",temperature:17},
    {weekDay:"Domingo",hour:16,state:"sunny",temperature:17}
    
   
]


export const ForecastExample = () =><Forecast forecastListitem={forecastListitem}/>