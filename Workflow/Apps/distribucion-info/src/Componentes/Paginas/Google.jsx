// TODO https://www.google.com.mx/?hl=es-419
import React from 'react';

import '../../CSS/Bootstrap/css/bootstrapD.css'

import InofrmacionVaria from '../Cuerpo/Informacion-varia';


import Logo from '../Banner/Logo';
import Contacto from '../Cuerpo/Contacto';


import Buscar from '../header/buscar';

import Covid from '../header/covid-info';
import DerechosDeAutor from '../Footer/DerechosDeAutor';
import Calendario from '../Cuerpo/Calendario';
import LinksVarios from '../Cuerpo/LinksVarios';

import Info from '../Cuerpo/Info'

import Academia from '../header-posterior/academia';
import Admisiones from '../header-posterior/admisiones';
import Conoce from '../header-posterior/conoce';
import Online from '../Cuerpo/Online';
import Explora from '../Cuerpo/Explora';
import Noticias from '../header/Noticias';
import MapaPagina from '../Cuerpo/MapaPagina';
import Gmail from '../Google/Gmail';
import CuentaGoogle from '../Google/CuentaGoogle'
import GoogleApps from '../Google/GoogleApps'
import Busca from '../Google/Buscar'
import Botones from '../Google/Botones'
import '../../CSS/estilos.css'
import Imagenes from '../Google/Imagenes';
//generamos nuestra funcion para realizar el despliegue
import GIF from '../Google/Recursos/GIF.gif'
import Compartir from '../Google/Recursos/compartir.png'
import Ofrecido from '../Google/Ofrecido';
import Mexico from '../Google/Mexico';
import LinksAbajo from '../Google/LinksAbajo';

function Google() {
    return (
        <div class='fondo-blanco'>
            <h4 class="text-center">www.google.com.mx</h4>
            <div className="d-flex flex-row-reverse">
                <div class="mx-3"><CuentaGoogle /></div>
                <div class="mx-3"><GoogleApps /></div>
                <div class="mx-3"><Imagenes /></div>
                <div class="mx-3"><Gmail /></div>
            </div>
            <br />
            <br />
            <div className="imagenes-padre">

                <div className="d-inline imagenes-padre">
                    <img src={GIF} alt="error" className="" />
                    <img src={Compartir} alt="error" className="imagen-hija" />
                </div>
            </div>
            <br />
            <div className="container tamano-buscar" >
                <Busca />
            </div>
            <br />
            <div>
                <Botones />
            </div>
            <br />
            <br />

            <Ofrecido />

            <br />
            <br />

            <Mexico/>
            <LinksAbajo/>
            {/* <div class='mx-auto'><BreadCum></BreadCum></div>
            <div class='mx-auto'><HoraFecha></HoraFecha></div>
            <div class='mx-auto'><Logo></Logo></div>
            <div class='mx-auto'><PaletaColores></PaletaColores></div> */}

        </div>

    )
}

export default Google