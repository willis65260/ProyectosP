import React from 'react';
import PropTypes from 'prop-types';
import Typography from '@material-ui/core/Typography'
import Grid from '@material-ui/core/Grid'
import { IconContext } from 'react-icons'
import IconState, {validValues} from '../IconState/IconState'

const ForecastItem = ({weekDay, hour, state, temperature}) => {
    return (
        <Grid container direction="column" justify="center" alignItems="center">
            <Grid Item>
                <Typography>{weekDay}</Typography>
            </Grid>
            <Grid Item>
                <Typography>{hour} hrs</Typography>
            </Grid>
            <Grid Item>
            <IconContext.Provider value={{ size: '3.5em' }}>
            <IconState state={state}/>
            </IconContext.Provider>
                
            </Grid>
            <Grid Item>
                <Typography>{temperature}</Typography>
            </Grid>
        </Grid>
    );
};


ForecastItem.propTypes = {
    weekDay: PropTypes.string.isRequired,
    hour: PropTypes.number.isRequired,
    state: PropTypes.oneOf(validValues).isRequired,
    temperature: PropTypes.number.isRequired,
};


export default ForecastItem;
