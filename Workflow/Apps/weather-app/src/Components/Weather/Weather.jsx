import React from 'react';
import PropTypes from 'prop-types';
import Typography from '@material-ui/core/Typography'
import IconState, { validValues } from '../IconState/IconState'
import { IconContext } from 'react-icons'
import Grid from '@material-ui/core/Grid'
import { Skeleton } from '@material-ui/lab';

const Weather = (props) => {
    const { temperature, state, tipo } = props
    var temp = temperature

    if (tipo === "c") {
        temp = (temperature - 273).toFixed(2) + "°C"
    } else if (tipo === "f") {
        temp = ((temperature - 273.15) * 9 / 5 + 32).toFixed(2) + "°F"
    }

    return (
        <Grid container item direction="row" justify="center" alignItems="center" spacing={1}>
            <IconContext.Provider value={{ size: '6em' }}>
                {
                    state ?
                        <IconState state={state} />
                        :
                        <Skeleton
                            variant="circle"
                            height={80}
                            width={80}
                        />
                }

            </IconContext.Provider>

            {
                temperature ?
                    <Typography display="inline" variant="h2">{temp}</Typography>
                    :
                    <Skeleton
                        variant="rect"
                        height={50}
                        width={150}
                    />
            }


        </Grid>
    );
};


Weather.propTypes = {
    temperature: PropTypes.number,
    state: PropTypes.oneOf(validValues)
};


export default Weather;
