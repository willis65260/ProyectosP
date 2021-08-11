import React from 'react';
import Weather from './Weather'


export default {
    title: "Weather",
    component: Weather,
}

export const WeatherCloud = ()=>(
    <Weather temperature={25} state={"cloud"}/>
)

export const WeatherCloudy = ()=>(
    <Weather temperature={25} state={"cloudy"}/>
)

export const WeatherFog = ()=>(
    <Weather temperature={25} state={"fog"}/>
)

export const WeatherSynny = ()=>(
    <Weather temperature={25} state={"sunny"}/>
)


export const WeatherRain = ()=>(
    <Weather temperature={25} state={"rainy"}/>
)

