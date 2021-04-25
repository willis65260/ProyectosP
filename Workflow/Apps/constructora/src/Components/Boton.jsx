import React from 'react'
import Cambio from './Cambio'

export default function Boton(props) {
    const { nombre, evento } = props
    return (
        <div>
            <button type="button" className="btn btn-secondary my-auto" onClick={()=>{
                evento(<Cambio nombre={nombre}/>)
            }}>{nombre}</button>
        </div>
    )
}
