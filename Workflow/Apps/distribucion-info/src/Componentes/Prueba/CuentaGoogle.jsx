import React from 'react';
import cuenta from './Recursos/Perfil.png'

console.log(cuenta)
//generamos nuestra funcion para realizar el despliegue

function Imagenes() {
    return(
        <img src={cuenta} alt="error" className="rounded-circle"/>
    )
}

export default Imagenes

