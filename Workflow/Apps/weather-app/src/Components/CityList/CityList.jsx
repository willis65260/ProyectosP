import React, { useEffect, useState } from 'react'
import PropTypes from 'prop-types'
import CityInfo from '../CityInfo/CityInfo'
import Weather from '../Weather/Weather'
import Grid from '@material-ui/core/Grid'
import List from '@material-ui/core/List'
import ListItem from '@material-ui/core/ListItem'
import axios from 'axios'
import { ToggleButtonGroup, ToggleButton } from '@material-ui/lab'
import convertUnits from 'convert-units'
import { Alert } from '@material-ui/lab'

const renderCityAndCountry = eventOnClickCity => (cityAndCountry, weather) => {
    const { city, country } = cityAndCountry

    const [Centigrados, setCentigrados] = useState("c")

    const [t1, sett1] = useState(true);
    const [t2, sett2] = useState(false);

    const handleChange = (event, newAlignment) => {
        setCentigrados(newAlignment);
    };
    // const [Farenheit, setFarenheit] = useState(0)

    // const [temperatura, setTemperatura] = useState(<Weather temperature={weather.temperature} state={"none"} />)
    // const {temperature, state} = weather

    return (

        <>
            {/* {const [temperatura, setTemperatura] = useState(<Weather temperature={weather.temperature} state={"none"} />)} */}
            <ListItem >
                <Grid container justify="center" alignItems="center" button key={city} onClick={eventOnClickCity} style={{ cursor: "pointer" }}>
                    <Grid item md={8} xs={12}>
                        <CityInfo city={city} country={country} />
                    </Grid>
                    <Grid item md={3} xs={12}>
                        {
                            // weather ? (
                            <Weather
                                temperature={weather && weather.temperature}
                                state={weather && weather.state}
                                tipo={Centigrados}
                            />
                            // ) : ("no hay datos compi")
                        }
                    </Grid>
                </Grid>
                <ToggleButtonGroup value={Centigrados} exclusive onChange={handleChange}>
                    <ToggleButton value="c">
                        °C
                    </ToggleButton>
                    <ToggleButton value="f">
                        °F
                    </ToggleButton>
                </ToggleButtonGroup>
            </ListItem>
        </>
    )
}

const CityList = ({ cities, onClickCity }) => {
    const [allWeather, setAllWeather] = useState({})
    const [error, setError] = useState({})

    useEffect(() => {

        const setWeather = (city, country, countryCode) => {

            const appid = "55f56816bd860f4ed087d5a7582a960e"
            const url = `https://api.openweathermap.org/data/2.5/weather?q=${city},${countryCode}&appid=${appid}`;
            axios
                .get(url)
                .then(response => {
                    const { data } = response
                    const temperature = Number(
                        convertUnits(data.main.temp)
                            .from('K')
                            .to('C')
                            .toFixed(2)
                    )



                    const state = data.weather[0].main
                    const propName = `${city}-${country}`
                    const propValue = { temperature, state }

                    setAllWeather(allWeather => {
                        const result = { ...allWeather, [propName]: propValue }
                        console.log("allWeather[result]:", result)
                        return result
                    })
                })
                .catch(err => {
                    if (err.response) {//$errores de respuesta servidor
                        const { data, status } = err.response
                        console.log("data: " + data + "\nstatus:" + status);
                        setError("error 400")

                    } else if (err.request) {//$errores de comunicacion
                        console.log("servidor inaccesible o no hay conexion a internet");
                        setError("verifique conexion a internet")

                    } else {//$errores desconocidos
                        console.log("Error desconocido");
                        setError("error al cargar los datos")
                    }
                });
        }
        cities.forEach(({ city, country, countryCode }) => {
            setWeather(city, country, countryCode)
        });
    }, [cities]);

    const weather = {
        temperature: 30,
        state: "sunny"
    }
    return (
        <>
            <div>
                
                {/* <Alert severity="error" onClose={() => { setError(null) }} > {error} </Alert> */}

                <List>
                    {
                        cities.map(
                            cityAndCountry => renderCityAndCountry(onClickCity)(cityAndCountry,
                                allWeather[`${cityAndCountry.city}-${cityAndCountry.country}`])
                        )
                    }
                </List>
            </div>
        </>
    )
}


CityList.propTypes = {
    cities: PropTypes.arrayOf(
        PropTypes.shape({
            cities: PropTypes.string.isRequired,
            country: PropTypes.string.isRequired,
            countryCode: PropTypes.string.isRequired,
        }),
    ).isRequired,
    onClickCity: PropTypes.func.isRequired,
}

export default CityList