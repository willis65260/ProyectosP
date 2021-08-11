import React, { useState } from 'react';
import { useHistory } from 'react-router-dom'
import CityList from '../Components/CityList/CityList'
import AppFrame from '../Components/AppFrame/AppFrame'
import Paper from '@material-ui/core/Paper'
import data from './city1.json'

import axios from 'axios'
<script type="text/javascript" src="city1.json"></script>

const MainPage = () => {

    const [Ciudad, setciudad] = useState("distrito federal");
    const [Pais, setPais] = useState("Mexico");
    const [Codigo, setCodigo] = useState("MX");

    const cities = [
        { city: Ciudad, country: Pais, countryCode: Codigo }
    ]

    const History = useHistory()
    const onCLickHandler = () => {
        History.push('/city')
    }

    return (
        <>
            <>
                {/* Buscar */}
                <input type="text" placeholder="ciudad" onChange={event => setciudad(event.target.value)} />
                <input type="text" placeholder="pais" onChange={event => setPais(event.target.value)} />
                <input type="text" placeholder="country code" onChange={event => setCodigo(event.target.value)} />
            </>
            <AppFrame>
                <Paper elevation={3}>
                    <CityList cities={cities} onClickCity={onCLickHandler} />
                </Paper>
            </AppFrame>
        </>
    );
};
export default MainPage;