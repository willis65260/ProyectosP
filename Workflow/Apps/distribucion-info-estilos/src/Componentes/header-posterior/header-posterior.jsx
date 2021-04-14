import React from 'react';
import ReactDOM from 'react-dom';
import Academia from './academia';

import Admisiones from './admisiones';
import Comunidad from './comunidad';
import Conoce from './conoce';
import Investigaciones from './investigaciones';

//generamos nuestra funcion para realizar el despliegue

function menu() {
    return (
        <>
            <div class="d-flex">
                <div class="mx-auto"><Conoce /></div>
                <div class="mx-auto"><Academia /></div>
                <div class="mx-auto"><Investigaciones /></div>
                <div class="mx-auto"><Comunidad /></div>
                <div class="mx-auto"><Admisiones /></div>
            </div>
        </>
    )
}

export default menu

