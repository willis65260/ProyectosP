// TODO https://www.redeemer.ca
import React from 'react';

import '../../CSS/Bootstrap/css/bootstrapD.css'
import Logo from '../Banner/Logo';
import Contacto from '../Cuerpo/Contacto';
import Buscar from '../header/buscar';
import DerechosDeAutor from '../Footer/DerechosDeAutor';
import LinksVarios from '../Cuerpo/LinksVarios';
import Menu from '../Cuerpo/Menu';
import VideoPresentacion from '../Cuerpo/VideoPresentacion';
import Informacion from '../header/informacion';
import RedesSociales from '../Footer/RedesSociales';
import Noticias from '../header/Noticias';
import PlanearVisita from '../Cuerpo/PlanearVisita';
import Donaciones from '../Cuerpo/Donaciones';
import Aplicar from '../Cuerpo/Aplicar';
import Historias from '../Cuerpo/Historias';
import Ubicacion from '../Cuerpo/Ubicacion';


function Pagina14() {
    return (
        <div class=''>
            <h4 class="text-center">www.redeemer.ca</h4>
            <div className="d-flex">
                <div class="mx-auto"><Logo /></div>
                <div class="mx-auto"><PlanearVisita /></div>
                <div class="mx-auto"><Donaciones /></div>
                <div class="mx-auto"><Aplicar /></div>
                <div class="mx-auto"><Menu /></div>
                <div class="mx-auto"><Buscar /></div>
            </div>

            <VideoPresentacion />
            <Informacion />
            <Noticias />
            <Historias />
            <Informacion />
            <RedesSociales />

            <div className="d-flex">
                <div class="mx-auto"><LinksVarios/></div>
                <div class="mx-auto"><Contacto /></div>
            </div>

            <div className="d-flex">
                <div className="mx-auto"><LinksVarios /></div>
                <div className="mx-auto"><RedesSociales /></div>
                <div className="mx-auto"><Ubicacion /></div>
                <div className="mx-auto"><Contacto /></div>
                <div className="mx-auto"><Logo /></div>
            </div>

            <DerechosDeAutor />

            {/* <div class='mx-auto'><BreadCum></BreadCum></div>
            <div class='mx-auto'><HoraFecha></HoraFecha></div>
            <div class='mx-auto'><Logo></Logo></div>
            <div class='mx-auto'><PaletaColores></PaletaColores></div> */}

        </div>

    )
}

export default Pagina14