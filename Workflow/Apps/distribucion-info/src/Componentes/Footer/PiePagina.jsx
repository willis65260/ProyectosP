import React from 'react';
import ReactDOM from 'react-dom';

import DerechosDeAutor from './DerechosDeAutor';
import GeneralesDeLaEmpresa from './GeneralesDeLaEmpresa';
import Inicio from './inicio';
import RedesSociales from './RedesSociales';


//generamos nuestra funcion para realizar el despliegue

function PieDePagina() {
    return (
        <>
            <div class='d-flex'>
                <div class="mx-auto"><Inicio /></div>
                <div class="mx-auto"><RedesSociales /></div>
                <div class="mx-auto"><DerechosDeAutor /></div>
                <div class="mx-auto"><GeneralesDeLaEmpresa /></div>
            </div>
        </>
    )
}

export default PieDePagina
