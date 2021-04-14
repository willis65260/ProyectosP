// TODO https://university.orangeandbronze.com
import React from 'react';

import '../../CSS/Bootstrap/css/bootstrapD.css'

import InofrmacionVaria from '../Cuerpo/Informacion-varia';


import Logo from '../Banner/Logo';
import Contacto from '../Cuerpo/Contacto';




import DerechosDeAutor from '../Footer/DerechosDeAutor';

import LinksVarios from '../Cuerpo/LinksVarios';



import Menu from '../Cuerpo/Menu';
import Informacion from '../header/informacion';

import RedesSociales from '../Footer/RedesSociales';
import Banner from '../Cuerpo/Banner';
import AcercaDe from '../Cuerpo/AcercaDe';
import Politicas from '../Cuerpo/Politicas';
import Cursos from '../Cuerpo/Cursos';


function Pagina12() {
    return (
        <div class=''>
            <h4 class="text-center">university.orangeandbronze.com</h4>
            <div className="d-flex">
                <div class="mx-auto"><Logo /></div>
                <div class="mx-auto"><Contacto /></div>
                <div class="mx-auto"><Menu /></div>
            </div>
            <Banner/>
            <div className="d-flex">
                <div class="mx-auto"><InofrmacionVaria /></div>
                <div class="mx-auto"><Informacion /></div>
            </div>

            <Informacion/>
            
            <div className="d-flex">
                <div className="mx-auto"><Logo /></div>
                <div className="mx-auto"><Logo /></div>
                <div className="mx-auto"><Logo /></div>
                <div className="mx-auto"><Logo /></div>
            </div>


            <LinksVarios />
            <Cursos/>
            <Cursos/>
            <Cursos/>
            <Informacion/>
            
            <div className="d-flex">
                <div className="mx-auto"><AcercaDe /></div>
                <div className="mx-auto"><Contacto /></div>
                <div className="mx-auto"><RedesSociales /></div>
                <div className="mx-auto"><DerechosDeAutor /></div>
                <div className="mx-auto"><Politicas /></div>
            </div>
            

      

            {/* <div class='mx-auto'><BreadCum></BreadCum></div>
            <div class='mx-auto'><HoraFecha></HoraFecha></div>
            <div class='mx-auto'><Logo></Logo></div>
            <div class='mx-auto'><PaletaColores></PaletaColores></div> */}

        </div>

    )
}

export default Pagina12