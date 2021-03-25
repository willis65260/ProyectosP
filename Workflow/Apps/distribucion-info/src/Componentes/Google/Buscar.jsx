import React from 'react';
import '../../CSS/estilos.css'
import lupa from '../Google/Recursos/Lupa.png'

//generamos nuestra funcion para realizar el despliegue

function Buscar() {
    return (
        <>
            {/* <input type="text" value="" style={{ width: "500px" }} className="rounded border tatamano-buscar" /> */}
            <div className="aux">
                <img className="my-2 mx-2" src={lupa} width={20} height={20} alt=""/>
                <input className="ta" style={{border: "none",width: "90%" }} />
            </div>
        </>
    )
}

export default Buscar

