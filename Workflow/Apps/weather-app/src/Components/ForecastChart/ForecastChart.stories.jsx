import React from 'react'
import PropTypes from 'prop-types'
import Grid from '@material-ui/core/Grid'
import ForecastItem from '../forecastItem/ForecastItem'

const renderForecastItem = forecast => {
    const {weekDay,hour,state,temperature} = forecast
    return(
        <Grid item key={'${weekDay}${hour}'}>
            <ForecastItem
            weekDay={weekDay}
            hour={hour}
            state={state}
            temperature={temperature}
            />
        </Grid>
    )
}