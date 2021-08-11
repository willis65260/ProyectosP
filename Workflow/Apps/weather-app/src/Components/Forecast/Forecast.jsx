import React from 'react'
import PropTypes from 'prop-types'
import Grid from '@material-ui/core/Grid'
import ForecastItem from '../forecastItem/ForecastItem'

const renderForecastItem =Forecast=>{
    const {weekDay,hour,state,temperature} = Forecast
    return(
        <Grid item key={'${weekDay}${hour}'}>
            <ForecastItem
            weekDay={weekDay}
            hour={hour}
            state={state}
            temperature={temperature}/>
        </Grid>
    )
}

const Forecast =({forecastItemlist})=>{
    return(
        <Grid container justify='space-around' alingItems="center">
            {
            forecastItemlist.map(Forecast =>renderForecastItem(Forecast))
            }
        </Grid>
    )
}
Forecast.propTypes={
        forecastItemlist:PropTypes.arrayOf(
            PropTypes.shape({
                weekDay: PropTypes.string.isRequired,
                hour:PropTypes.number.isRequired,
                state: PropTypes.string.isRequired,
                temperature:PropTypes.number.isRequired,
            }),
        ).isRequired
}

export default Forecast