// TODO https://www.princeton.edu
import React from 'react';
import Header from '../header/header'
import HeaderPost from '../header-posterior/header-posterior'
import '../../CSS/Bootstrap/css/bootstrapD.css'
import Covid from '../header/covid-info';

//generamos nuestra funcion para realizar el despliegue

function Pagina1() {
    return (
        <div class=''>
            <h4 class="text-center">www.princeton.edu</h4>
            <Header />
            <HeaderPost/>
            <Covid/>
            
            {/* <div class='mx-auto'><BreadCum></BreadCum></div>
            <div class='mx-auto'><HoraFecha></HoraFecha></div>
            <div class='mx-auto'><Logo></Logo></div>
            <div class='mx-auto'><PaletaColores></PaletaColores></div> */}

        </div>

    )
}

export default Pagina1