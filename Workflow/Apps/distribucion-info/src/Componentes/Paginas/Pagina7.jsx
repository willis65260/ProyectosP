// TODO https://www.park.edu
import React from 'react';

import '../../CSS/Bootstrap/css/bootstrapD.css'

import InofrmacionVaria from '../Cuerpo/Informacion-varia';


import Logo from '../Banner/Logo';
import Contacto from '../Cuerpo/Contacto';


import Buscar from '../header/buscar';


import DerechosDeAutor from '../Footer/DerechosDeAutor';

import LinksVarios from '../Cuerpo/LinksVarios';



import Menu from '../Cuerpo/Menu';
import VideoPresentacion from '../Cuerpo/VideoPresentacion';
import Aplicar from '../Cuerpo/Aplicar';
import Informacion from '../header/informacion';

import PlanearVisita from '../Cuerpo/PlanearVisita';
import Eventos from '../header/eventos';
import Ubicacion from '../Cuerpo/Ubicacion';
import RedesSociales from '../Footer/RedesSociales';


function Pagina7() {
    return (
        <div class=''>
            <h4 class="text-center">www.park.edu</h4>

            <div className="d-flex">
                <div class="mx-auto"><Logo /></div>
                <div class="mx-auto"><Buscar /></div>
                <div class="mx-auto"><Menu /></div>
            </div>
            <VideoPresentacion/>
            <div className="d-flex">
                <div className="mx-auto"><Aplicar /></div>
                <div className="mx-auto"><Informacion /></div>
                <div className="mx-auto"><PlanearVisita /></div>
                <div className="mx-auto"><Contacto /></div>
            </div>

            <InofrmacionVaria />

            <Eventos />

            <LinksVarios />

           
            <div class="d-flex">
                <div class="mx-auto"><Logo /></div>
                <div class="mx-auto"><Ubicacion /></div>
                <div class="mx-auto"><RedesSociales /></div>
                <div class="mx-auto"><DerechosDeAutor /></div>
            </div>

            <Logo/>
            <DerechosDeAutor/>         

            {/* <div class='mx-auto'><BreadCum></BreadCum></div>
            <div class='mx-auto'><HoraFecha></HoraFecha></div>
            <div class='mx-auto'><Logo></Logo></div>
            <div class='mx-auto'><PaletaColores></PaletaColores></div> */}

        </div>

    )
}

export default Pagina7