import React from 'react';

import Info from './Info'
import Login from './Login'
import VideoTuto from './VideoTuto'


import '../../CSS/Bootstrap/css/bootstrap.css'

//generamos nuestra funcion para realizar el despliegue

function Hola() {
    return(
        <div class='d-flex'>
            
        <div class='mx-auto'><Info></Info></div>
        <div class='mx-auto'><Login></Login></div> 
        <div class='mx-auto'><VideoTuto></VideoTuto></div> 

        </div>
    )
}

export default Hola
