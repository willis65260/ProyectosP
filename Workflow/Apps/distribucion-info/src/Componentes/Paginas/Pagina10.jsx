// TODO https://www.uncsa.edu
import React from 'react';

import '../../CSS/Bootstrap/css/bootstrapD.css'

import InofrmacionVaria from '../Cuerpo/Informacion-varia';


import Logo from '../Banner/Logo';


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
import Covid from '../header/covid-info';
import Noticias from '../header/Noticias';
import Donaciones from '../Cuerpo/Donaciones';
import Historias from '../Cuerpo/Historias';
import Contacto from '../Cuerpo/Contacto';


function Pagina10() {
    return (
        <div class=''>
            <h4 class="text-center">www.uncsa.edu</h4>
            <div className="d-flex">
                <div class="mx-auto"><Logo /></div>
                <div class="mx-auto"><Eventos /></div>
                <div class="mx-auto"><Buscar/></div>
                <div class="mx-auto"><Menu /></div>
            </div>
            <div className="">
                <div class="mx-auto"><VideoPresentacion /></div>
                <div class="mx-auto"><PlanearVisita /></div>
                <div class="mx-auto"><Aplicar /></div>
            </div>
            <InofrmacionVaria/>
            <Covid/>

            <InofrmacionVaria/>
            <Noticias/>



            <div className="d-flex">
                <div className="mx-auto"><Logo /></div>
                <div className="mx-auto"><LinksVarios /></div>
                <div className="mx-auto"><Ubicacion /></div>
                <div className="mx-auto"><Contacto /></div>
                <div className="mx-auto"><RedesSociales /></div>
                <div className="mx-auto"><LinksVarios /></div>

            </div>

            <DerechosDeAutor/>
            


      

            {/* <div class='mx-auto'><BreadCum></BreadCum></div>
            <div class='mx-auto'><HoraFecha></HoraFecha></div>
            <div class='mx-auto'><Logo></Logo></div>
            <div class='mx-auto'><PaletaColores></PaletaColores></div> */}

        </div>

    )
}

export default Pagina10