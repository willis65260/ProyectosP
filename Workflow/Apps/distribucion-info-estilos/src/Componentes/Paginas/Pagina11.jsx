// TODO https://www.iqs.edu/en
import React from 'react';

import '../../CSS/Bootstrap/css/bootstrapD.css'

import InofrmacionVaria from '../Cuerpo/Informacion-varia';


import Logo from '../Banner/Logo';
import Contacto from '../Cuerpo/Contacto';


import Buscar from '../header/buscar';


import DerechosDeAutor from '../Footer/DerechosDeAutor';

import LinksVarios from '../Cuerpo/LinksVarios';


import VideoPresentacion from '../Cuerpo/VideoPresentacion';
import Informacion from '../header/informacion';

import Ubicacion from '../Cuerpo/Ubicacion';
import RedesSociales from '../Footer/RedesSociales';
import Covid from '../header/covid-info';
import Noticias from '../header/Noticias';
import Aplicar from '../Cuerpo/Aplicar';
import AcercaDe from '../Cuerpo/AcercaDe';
import Eventos from '../header/eventos';


function Pagina8() {
    return (
        <div class=''>
            <h4 class="text-center">www.iqs.edu/en</h4>
            <VideoPresentacion/>
            <div className="d-flex">
                <div class="mx-auto"><Aplicar /></div>
                <div class="mx-auto"><AcercaDe /></div>
                <div class="mx-auto"><Eventos /></div>
                <div class="mx-auto"><Contacto /></div>
                <div class="mx-auto"><Buscar /></div>
            </div>
            <div className="d-flex">
                <div class="mx-auto"><Logo /></div>
                <div class="mx-auto"><LinksVarios /></div>
            </div>
            <Informacion/>
            <Eventos/>
            <Covid/>
            <Noticias/>
            <InofrmacionVaria/>
            
            <div className="d-flex">
                <div className="mx-auto"><LinksVarios /></div>
                <div className="mx-auto"><RedesSociales /></div>
                <div className="mx-auto"><Contacto /></div>
                <div className="mx-auto"><Ubicacion /></div>
                
            </div>

            <Logo />
            <Logo />
            <Logo />

            <DerechosDeAutor/>

            {/* <div class='mx-auto'><BreadCum></BreadCum></div>
            <div class='mx-auto'><HoraFecha></HoraFecha></div>
            <div class='mx-auto'><Logo></Logo></div>
            <div class='mx-auto'><PaletaColores></PaletaColores></div> */}

        </div>

    )
}

export default Pagina8