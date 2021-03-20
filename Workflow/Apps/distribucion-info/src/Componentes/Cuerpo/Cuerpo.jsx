import React from 'react';

import Info from './Info'
import Login from './Login'
import VideoTuto from './VideoTuto'


import '../../CSS/Bootstrap/css/bootstrapD.css'
import Noticias from './Noticias';

//generamos nuestra funcion para realizar el despliegue

function Cuerpo() {
    return (
        <>
            <Noticias />

            <div class='d-flex'>

                <div class='mx-auto'>
                    <Login />
                    <VideoTuto />
                </div>
                <div class='mx-auto'><Info /></div>
            </div>
        </>
    )
}

export default Cuerpo
