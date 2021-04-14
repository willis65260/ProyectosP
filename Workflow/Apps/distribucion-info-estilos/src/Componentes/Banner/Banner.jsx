import React from 'react';
import BreadCum from './BreadCum'
import HoraFecha from './HoraFecha'
import Logo from './Logo'
import PaletaColores from './PaletaDeColores'

import '../../CSS/Bootstrap/css/bootstrapD.css'

//generamos nuestra funcion para realizar el despliegue

function Hola() {
    return (
        <div class='d-flex'>

            <div class='mx-auto'><BreadCum></BreadCum></div>
            <div class='mx-auto'><HoraFecha></HoraFecha></div>
            <div class='mx-auto'><Logo></Logo></div>
            <div class='mx-auto'><PaletaColores></PaletaColores></div>

        </div>

    )
}

export default Hola
