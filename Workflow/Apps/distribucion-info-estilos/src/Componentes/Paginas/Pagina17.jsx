// TODO https://tech.cornell.edu
import React from 'react';

import '../../CSS/Bootstrap/css/bootstrapD.css'



import Logo from '../Banner/Logo';
import Contacto from '../Cuerpo/Contacto';


import Buscar from '../header/buscar';


import DerechosDeAutor from '../Footer/DerechosDeAutor';

import LinksVarios from '../Cuerpo/LinksVarios';



import Menu from '../Cuerpo/Menu';
import Informacion from '../header/informacion';

import RedesSociales from '../Footer/RedesSociales';
import Covid from '../header/covid-info';
import Noticias from '../header/Noticias';
import PlanearVisita from '../Cuerpo/PlanearVisita';
import Banner from '../Cuerpo/Banner';
import AcercaDe from '../Cuerpo/AcercaDe';


function Pagina17() {
    return (
        <div class=''>
            <h4 class="text-center">tech.cornell.edu</h4>
            <Covid/>
            <div className="d-flex">
                <div class="mx-auto"><Logo /></div>
                <div class="mx-auto"><PlanearVisita /></div>
                <div class="mx-auto"><Buscar /></div>
                <div class="mx-auto"><Menu /></div>
            </div>
            <Banner/>
            <Informacion/>
            <Noticias/>
     
            <div className="d-flex">
                <div className="mx-auto"><AcercaDe /></div>
                <div className="mx-auto"><LinksVarios /></div>
                <div className="mx-auto"><Contacto /></div>
                <div className="mx-auto"><RedesSociales /></div>
            </div>
            <div className="d-flex">
                <div className="mx-auto"><Logo /></div>
                <div className="mx-auto"><Logo /></div>
                <div className="mx-auto"><DerechosDeAutor /></div>
            </div>
            

            {/* <div class='mx-auto'><BreadCum></BreadCum></div>
            <div class='mx-auto'><HoraFecha></HoraFecha></div>
            <div class='mx-auto'><Logo></Logo></div>
            <div class='mx-auto'><PaletaColores></PaletaColores></div> */}

        </div>

    )
}

export default Pagina17