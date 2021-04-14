// TODO https://www.stmarysblackburn.ac.uk
import React from 'react';

import '../../CSS/Bootstrap/css/bootstrapD.css'



import Logo from '../Banner/Logo';
import Contacto from '../Cuerpo/Contacto';




import DerechosDeAutor from '../Footer/DerechosDeAutor';

import LinksVarios from '../Cuerpo/LinksVarios';



import Menu from '../Cuerpo/Menu';
import Informacion from '../header/informacion';

import RedesSociales from '../Footer/RedesSociales';
import Noticias from '../header/Noticias';
import Aplicar from '../Cuerpo/Aplicar';
import Banner from '../Cuerpo/Banner';
import Cursos from '../Cuerpo/Cursos';
import AcercaDe from '../Cuerpo/AcercaDe';


function Pagina15() {
    return (
        <div class=''>
            <h4 class="text-center">www.stmarysblackburn.ac.uk</h4>
            <div className="d-flex">
                <div class="mx-auto"><Logo /></div>
                <div class="mx-auto"><Menu /></div>
            </div>
            <div class="mx-auto"><Aplicar /></div>
            <div className="d-flex">
                <div class="mx-auto"><Banner /></div>
            </div>
            <Cursos />
            <Informacion />
            <Noticias />
            <RedesSociales />
            <div className="d-flex">
                <div className="mx-auto"><AcercaDe /></div>
                <div className="mx-auto"><LinksVarios /></div>
            </div>
            <div className="d-flex">
                <div className="mx-auto"><Logo /></div>
                <div className="mx-auto"><Logo /></div>
                <div className="mx-auto"><Logo /></div>
                <div className="mx-auto"><Logo /></div>
                <div className="mx-auto"><Logo /></div>
            </div>

            <RedesSociales />
            <Contacto />
            <DerechosDeAutor />

            {/* <div class='mx-auto'><BreadCum></BreadCum></div>
            <div class='mx-auto'><HoraFecha></HoraFecha></div>
            <div class='mx-auto'><Logo></Logo></div>
            <div class='mx-auto'><PaletaColores></PaletaColores></div> */}
        </div>

    )
}

export default Pagina15