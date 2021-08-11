import React from 'react';
import {Link as RouterLink} from 'react-router-dom'
import Link from '@material-ui/core/Link'
import WelcomeScreen from '../Components/WelcomeScreen/WelcomeScreen'
import Grid from '@material-ui/core/Grid'
import {IconContext} from 'react-icons'
import {WiDaySunny} from 'react-icons/wi'
import Typography from '@material-ui/core/Typography'
const Welcome = () => {
    return (
       <WelcomeScreen>
           <Grid container direction = 'column' justify='center' className='full'>
                <div className='highlight'>
                    <Grid item container xs={12} justify='center' alignItems='center'>
                        <Grid item>
                            <IconContext.Provider value={{size:'6em'}}>
                                <WiDaySunny />
                            </IconContext.Provider>
                        </Grid>
                        <Grid item container direction='column' justify='center' alignItems='center'>
                           <Typography variant='h2' color='inherit'>
                               ClimApp
                           </Typography>
                           <Link component={RouterLink} to='/main' color='inherit' arial-label='menu'>
                               Ingresar
                           </Link>
                        </Grid>
                    </Grid>
                </div>
           </Grid>
       </WelcomeScreen>
    );
};


export default Welcome;
