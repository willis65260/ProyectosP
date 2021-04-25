import React from 'react'
import Boton from './Boton'

export default function Botonera(props) {
    const { evento } = props
    return (
        <div className="container fondo-gris">
            <div className="row">
                <Boton nombre="Mquinaria" evento={evento}/>
            </div>
            <div className="row">
                <Boton nombre="Personal"  evento={evento} />
            </div>
            <div className="row">
                <Boton nombre="Obra" evento={evento} />
            </div>
            <div className="row">
                <Boton nombre="Provedores" evento={evento} />
            </div>
            <div className="row">
                <Boton nombre="Licitaciones" evento={evento} />
            </div>
        </div>
    )
}
