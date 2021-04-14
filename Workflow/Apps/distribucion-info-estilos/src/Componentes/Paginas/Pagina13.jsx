// TODO https://www.uow.edu.au
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
import Informacion from '../header/informacion';

import RedesSociales from '../Footer/RedesSociales';
import Covid from '../header/covid-info';
import Noticias from '../header/Noticias';
import Banner from '../Cuerpo/Banner';


function Pagina8() {
    return (
        <div class=''>
            <h4 class="text-center">www.uow.edu.au</h4>
            <div className="d-flex">
                <div class="mx-auto"><Logo /></div>
                <div class="mx-auto"><Buscar /></div>
                <div class="mx-auto"><Informacion /></div>
                <div class="mx-auto"><Noticias /></div>
                <div class="mx-auto"><Menu /></div>

            </div>
            <Banner/>
            <Covid/>
            <Informacion/>
            <Buscar/>
            <Informacion/>
            <Noticias/>
            <Informacion/>
            <div className="d-flex">
                <div class="mx-auto"><Logo /></div>
                <div class="mx-auto"><Menu /></div>
            </div>
            <VideoPresentacion/>
            <InofrmacionVaria/>
            <Noticias/>
            <InofrmacionVaria/>
            <div className="d-flex">
                <div className="mx-auto"><LinksVarios /></div>
                <div className="mx-auto"><RedesSociales /></div>
                <div className="mx-auto"><Contacto /></div>
                <div className="mx-auto"><Logo /></div>
            </div>

            <DerechosDeAutor/>
            


            {/* <div class='mx-auto'><BreadCum></BreadCum></div>
            <div class='mx-auto'><HoraFecha></HoraFecha></div>
            <div class='mx-auto'><Logo></Logo></div>
            <div class='mx-auto'><PaletaColores></PaletaColores></div> */}

        </div>

    )
}

export default Pagina8