import React from 'react';

import Info from './Info'
import Login from './Login'
import VideoTuto from './VideoTuto'


import '../../CSS/Bootstrap/css/bootstrapD.css'
import Noticias from './Noticias';
import Logo from '../Banner/Logo';
import Buscar from '../header/buscar';
import Acceso from '../Cuerpo/Acceso'
import Informacion from '../header/informacion';
import InformacionVaria from '../Cuerpo/Informacion-varia';
import PiePagina from '../Footer/PiePagina'

//generamos nuestra funcion para realizar el despliegue

function Cuerpo() {
    return (
        <>
            <Noticias />
            <div class='d-flex'>

                <div class='mx-auto'><Logo /> </div>
                <div class='mx-auto'><Noticias /> </div>
                <div class='mx-auto'><Buscar /> </div>
                <div class='mx-auto'><Noticias /> </div>

            </div>
            <div class='d-flex'>

                <div class='mx-auto'>
                    <Login />
                    <Acceso /><Informacion />
                    <VideoTuto />
                    <div class='d-flex'>
                        <div class='mx-auto'><Logo /> </div>
                        <div class='mx-auto'><InformacionVaria /> </div>
                        <div class='mx-auto'><VideoTuto /> </div>
                    </div>
                    
                </div>
                <div class='mx-auto'><Info />
                    <Informacion />
                </div>
            </div>
            <div>
                <PiePagina/>
            </div>
        </>
    )
}

export default Cuerpo
