// TODO https://www.essex.ac.uk
import React from 'react';

import '../../CSS/Bootstrap/css/bootstrapD.css'

import InofrmacionVaria from '../Cuerpo/Informacion-varia';

import RedesSociales from '../Footer/RedesSociales';
import Logo from '../Banner/Logo';
import Contacto from '../Cuerpo/Contacto';
import Informacion from '../header/informacion';

import Buscar from '../header/buscar';

import Menu from '../Cuerpo/Menu';
import Investigaciones from '../header-posterior/investigaciones';
import Covid from '../header/covid-info';
import Aplicar from '../Cuerpo/Aplicar';
import DerechosDeAutor from '../Footer/DerechosDeAutor';



function Pagina3() {
    return (
        <div class=''>
            <h4 class="text-center">www.essex.ac.uk</h4>
            <div className="d-flex">
                <div className="mx-auto"><Logo /></div>
                <div className="mx-auto"><Buscar /></div>
                <div className="mx-auto"><Menu /></div>

            </div>
            <InofrmacionVaria />
            <div class="d-flex">
                <div class="mx-auto"><Informacion /></div>
                <div class="mx-auto"><Investigaciones /></div>
            </div>
            <Covid />
            <Aplicar />
            <InofrmacionVaria />
            <InofrmacionVaria />

            <div class='d-flex'>
                <div class="mx-auto"><Logo /></div>
                <div class="mx-auto"><Buscar /></div>
            </div>

            <div className="d-flex">
                <div className="mx-auto"><Contacto /></div>
                <div className="mx-auto"><DerechosDeAutor /></div>
                <div className="mx-auto"><RedesSociales /></div>
            </div>

            {/* <div class='mx-auto'><BreadCum></BreadCum></div>
            <div class='mx-auto'><HoraFecha></HoraFecha></div>
            <div class='mx-auto'><Logo></Logo></div>
            <div class='mx-auto'><PaletaColores></PaletaColores></div> */}

        </div>

    )
}

export default Pagina3