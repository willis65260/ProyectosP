// TODO https://www.aber.ac.uk/en/
import React from 'react';

import '../../CSS/Bootstrap/css/bootstrapD.css'



import Logo from '../Banner/Logo';
import Contacto from '../Cuerpo/Contacto';


import Buscar from '../header/buscar';


import DerechosDeAutor from '../Footer/DerechosDeAutor';

import LinksVarios from '../Cuerpo/LinksVarios';



import Menu from '../Cuerpo/Menu';
import Informacion from '../header/informacion';

import Ubicacion from '../Cuerpo/Ubicacion';
import Noticias from '../header/Noticias';
import Banner from '../Cuerpo/Banner';
import Eventos from '../header/eventos';
import AcercaDe from '../Cuerpo/AcercaDe';
import Politicas from '../Cuerpo/Politicas';


function Pagina16() {
    return (
        <div class=''>
            <h4 class="text-center">www.aber.ac.uk/en/</h4>
            <div className="d-flex">
                <div class="mx-auto"><Logo /></div>
                <div class="mx-auto"><Informacion /></div>
                <div class="mx-auto"><Buscar /></div>
                <div class="mx-auto"><Menu /></div>
            </div>
            <Banner />
            <Informacion />
            <Eventos />
            <Informacion />
            <Noticias />
            <Informacion />

            <div className="d-flex">
                <div className="mx-auto"><AcercaDe /></div>
                <div className="mx-auto"><Ubicacion /></div>
                <div className="mx-auto"><Contacto /></div>
            </div>

            <div className="d-flex">
                <div className="mx-auto"><Logo /></div>
                <div className="mx-auto"><Logo /></div>
                <div className="mx-auto"><Logo /></div>
                <div className="mx-auto"><Logo /></div>
                <div className="mx-auto"><Logo /></div>


            </div>

            <LinksVarios />
            <Politicas />


            <DerechosDeAutor />



            {/* <div class='mx-auto'><BreadCum></BreadCum></div>
            <div class='mx-auto'><HoraFecha></HoraFecha></div>
            <div class='mx-auto'><Logo></Logo></div>
            <div class='mx-auto'><PaletaColores></PaletaColores></div> */}

        </div>

    )
}

export default Pagina16