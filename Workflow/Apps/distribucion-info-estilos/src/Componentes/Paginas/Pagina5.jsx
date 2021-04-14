// TODO https://www.academyart.edu
import React from 'react';

import '../../CSS/Bootstrap/css/bootstrapD.css'

import InofrmacionVaria from '../Cuerpo/Informacion-varia';


import Logo from '../Banner/Logo';
import Contacto from '../Cuerpo/Contacto';


import Buscar from '../header/buscar';

import Covid from '../header/covid-info';
import DerechosDeAutor from '../Footer/DerechosDeAutor';
import Calendario from '../Cuerpo/Calendario';
import LinksVarios from '../Cuerpo/LinksVarios';

import Info from '../Cuerpo/Info'

import Academia from '../header-posterior/academia';
import Admisiones from '../header-posterior/admisiones';
import Conoce from '../header-posterior/conoce';
import Online from '../Cuerpo/Online';
import Explora from '../Cuerpo/Explora';
import Noticias from '../header/Noticias';
import MapaPagina from '../Cuerpo/MapaPagina';



function Pagina5() {
    return (
        <div class=''>
            <h4 class="text-center">www.academyart.edu</h4>
            <div class="mx-auto"> <Covid /></div>
            <div className="d-flex">
                <div class="mx-auto"><Logo /></div>
                <div class="mx-auto"><Contacto /></div>
                <div class="mx-auto"><Buscar /></div>
            </div>

            <div className="d-flex">
                <div className="mx-auto"><Academia /></div>
                <div className="mx-auto"><Admisiones /></div>
                <div className="mx-auto"><Conoce /></div>
                <div className="mx-auto"><Online /></div>
                <div className="mx-auto"><Explora /></div>

            </div>

            <InofrmacionVaria />

            <Noticias />

            <InofrmacionVaria />

            <Noticias />
            <Calendario/>
            <MapaPagina/>
            <div class="d-flex">
                <div class="mx-auto"><Contacto /></div>
                <div class="mx-auto"><Conoce /></div>
                <div class="mx-auto"><LinksVarios /></div>
                <div class="mx-auto"><Info /></div>
            </div>
            <DerechosDeAutor/>
            
            {/* <div class='mx-auto'><BreadCum></BreadCum></div>
            <div class='mx-auto'><HoraFecha></HoraFecha></div>
            <div class='mx-auto'><Logo></Logo></div>
            <div class='mx-auto'><PaletaColores></PaletaColores></div> */}

        </div>

    )
}

export default Pagina5