import React from 'react'

console.log();


export default function DatosUsuario({usuario ,fotografia, imagen, documento }) {
    return (
        <div>
            <div className="usuarios jumbotron">
            
                <h5>El usuario actual es {usuario}</h5>
                <h5>{fotografia}</h5>
                <h5>{imagen}</h5>
                <h5>{documento}</h5>

            </div>
        </div>
    )
}
