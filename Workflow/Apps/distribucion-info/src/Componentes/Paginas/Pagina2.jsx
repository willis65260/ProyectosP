// TODO https://lesley.edu
import React from 'react';

import '../../CSS/Bootstrap/css/bootstrapD.css'

import InofrmacionVaria from '../Cuerpo/Informacion-varia';

import RedesSociales from '../Footer/RedesSociales';
import Logo from '../Banner/Logo';
import Contacto from '../Cuerpo/Contacto';
import Informacion from '../header/informacion';
import Eventos from '../header/eventos';
import Padres from '../Cuerpo/Padres';
import Aplicar from '../Cuerpo/Aplicar'
import Donaciones from '../Cuerpo/Donaciones';
import Conoce from '../header-posterior/conoce';
import Academia from '../header-posterior/academia';
import Admisiones from '../header-posterior/admisiones';
import Historias from '../Cuerpo/Historias';
import AcercaDe from '../Cuerpo/AcercaDe';
import Buscar from '../header/buscar';
import Work from '../header/work';
import Staff from '../Cuerpo/Staff';



function Pagina2() {
    return (
        <div class=''>
            <h4 class="text-center">lesley.edu</h4>
            <div className="d-flex">
                <div className="mx-auto"><Informacion /></div>
                <div className="mx-auto"><InofrmacionVaria /></div>
                <div className="mx-auto"><Padres /></div>
                <div className="mx-auto"><Eventos /></div>
                <div className="mx-auto"><Aplicar /></div>
                <div className="mx-auto"><Donaciones /></div>
            </div>
            <Logo></Logo>
            <div class="d-flex">
                <div class="mx-auto"><Academia /></div>
                <div class="mx-auto"><Admisiones /></div>
                <div class="mx-auto"><Historias /></div>
                <div class="mx-auto"><Conoce /></div>
                
                <div class="mx-auto"><AcercaDe /></div>
                <div class="mx-auto"><Buscar /></div>

            </div>
            <InofrmacionVaria />
            <RedesSociales/>
            <Donaciones />
            <InofrmacionVaria />
            
            <div class='d-flex'>
                <div class="mx-auto"><Logo /></div>
                <div class="mx-auto"><Buscar /></div>
            </div>

            <div className="d-flex">
                <div className="mx-auto"><Work /></div>
                <div className="mx-auto"><InofrmacionVaria /></div>
                <div className="mx-auto"><Eventos /></div>
                <div className="mx-auto"><Contacto /></div>
                <div className="mx-auto"><Informacion /></div>
                <div className="mx-auto"><Staff /></div>
                <div className="mx-auto"><Padres /></div>
                <div className="mx-auto"><Eventos /></div>
            </div>

            <div className="d-flex">
                <div className="mx-auto"><RedesSociales /></div>
                <div className="mx-auto"><Contacto /></div>
                <div className="mx-auto"><InofrmacionVaria /></div>
            </div>

            {/* <div class='mx-auto'><BreadCum></BreadCum></div>
            <div class='mx-auto'><HoraFecha></HoraFecha></div>
            <div class='mx-auto'><Logo></Logo></div>
            <div class='mx-auto'><PaletaColores></PaletaColores></div> */}

        </div>

    )
}

export default Pagina2