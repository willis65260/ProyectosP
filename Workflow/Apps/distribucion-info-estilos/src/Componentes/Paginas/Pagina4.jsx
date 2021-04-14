// TODO https://www.keele.ac.uk
import React from 'react';

import '../../CSS/Bootstrap/css/bootstrapD.css'

import InofrmacionVaria from '../Cuerpo/Informacion-varia';

import RedesSociales from '../Footer/RedesSociales';
import Logo from '../Banner/Logo';
import Contacto from '../Cuerpo/Contacto';
import Informacion from '../header/informacion';

import Buscar from '../header/buscar';

import Investigaciones from '../header-posterior/investigaciones';
import Covid from '../header/covid-info';
import DerechosDeAutor from '../Footer/DerechosDeAutor';
import Calendario from '../Cuerpo/Calendario';
import LinksVarios from '../Cuerpo/LinksVarios';
import Staff from '../Cuerpo/Staff';
import Eventos from '../header/eventos';
import Aplicar from '../Cuerpo/Aplicar';
import Info from '../Cuerpo/Info'
import Negocio from '../Cuerpo/Negocio';
import Politicas from '../Cuerpo/Politicas';
import Ubicacion from '../Cuerpo/Ubicacion';


function Pagina4() {
    return (
        <div class=''>
            <h4 class="text-center">www.keele.ac.uk</h4>
            
                
                <div className="d-flex">
                    <div class="mx-auto"><Informacion /></div>
                    <div class="mx-auto"><Staff /></div>
                    <div class="mx-auto"><Eventos /></div>
                </div>
                <div className="text-left"><Logo /></div>
                <div className="d-flex">
                    <div className="mx-auto"><Aplicar /></div>
                    <div className="mx-auto"><Investigaciones /></div>
                    <div className="mx-auto"><Info /></div>
                    <div className="mx-auto"><Negocio /></div>
                    <div className="mx-auto"><Contacto /></div>

                </div>
            
            <Covid />

            <InofrmacionVaria />

            <div class="d-flex">
                <div class="mx-auto"><Informacion /></div>
                <div class="mx-auto"><Buscar /></div>
            </div>

            <Covid />
            <InofrmacionVaria />
            <Covid />
            <InofrmacionVaria />
            <Calendario />
            <InofrmacionVaria />
            <RedesSociales/>
            <LinksVarios />
            <div class='d-flex'>
                <div class="mx-auto"><Logo /></div>
                <div class="mx-auto"><Buscar /></div>
            </div>

            <div className="d-flex">
                <div className="mx-auto"><Politicas /></div>
                <div className="mx-auto"><Politicas /></div>
                <div className="mx-auto"><Ubicacion /></div>
            </div>
            <DerechosDeAutor/>
            {/* <div class='mx-auto'><BreadCum></BreadCum></div>
            <div class='mx-auto'><HoraFecha></HoraFecha></div>
            <div class='mx-auto'><Logo></Logo></div>
            <div class='mx-auto'><PaletaColores></PaletaColores></div> */}

        </div>

    )
}

export default Pagina4