import React from 'react';
import ReactDOM from 'react-dom';
import Logo from '../Banner/Logo';
import Menu from './Noticias'
import Eventos from './eventos'
import Work from './work';
import Informacion from './informacion'
import Buscar from '../header/buscar';

//generamos nuestra funcion para realizar el despliegue

function menu() {
    return (
        <>
            <div class="d-flex">
                <div class="mx-auto"><Logo /></div>
                <div class="mx-auto"><Menu /></div>
                <div class="mx-auto"><Eventos /></div>
                <div class="mx-auto"><Work /></div>
                <div class="mx-auto"><Informacion /></div>
                <div class="mx-auto"><Buscar /></div>
            </div>
        </>
    )
}

export default menu

