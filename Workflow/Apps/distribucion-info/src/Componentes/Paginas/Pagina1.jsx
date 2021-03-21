// TODO https://www.princeton.edu
import React from 'react';
import Header from '../header/header'
import HeaderPost from '../header-posterior/header-posterior'
import '../../CSS/Bootstrap/css/bootstrapD.css'
import Covid from '../header/covid-info';
import InofrmacionVaria from '../Cuerpo/Informacion-varia';
import Calendario from '../Cuerpo/Calendario';

import DerechosDeAutor from '../Footer/DerechosDeAutor';
import MapaPagina from '../Cuerpo/MapaPagina';
import Logo from '../Banner/Logo';
import Contacto from '../Cuerpo/Contacto';




function Pagina1() {
    return (
        <div class=''>
            <h4 class="text-center">www.princeton.edu</h4>
            <Header />
            <HeaderPost/>
            <Covid/>
            <InofrmacionVaria/>
            <Calendario/>
            <MapaPagina/>
            <div class='d-flex'>
                <div class="mx-auto"><Logo /></div>
                <div class="mx-auto"><Contacto /></div>
                <div class="mx-auto"><DerechosDeAutor /></div>
            </div>
            {/* <div class='mx-auto'><BreadCum></BreadCum></div>
            <div class='mx-auto'><HoraFecha></HoraFecha></div>
            <div class='mx-auto'><Logo></Logo></div>
            <div class='mx-auto'><PaletaColores></PaletaColores></div> */}

        </div>

    )
}

export default Pagina1