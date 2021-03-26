import React from 'react';





const NombreUsuarios = ({ clickHandler}) => {
    return (
        <div className="jumbotron rounded">
            <h5>Nombres de usuario</h5>
            <div className="row">
                <button onClick={()=>{
               console.log("estamos dentro del boton","jose");
               clickHandler("jose");
           }}>Este es jose</button>
            </div>
            <div className="row">

                <button>Este es juan</button>
            </div>
            <div className="row">

                <button>Esta es Ale</button>
            </div>
            <div className="row">
                <button>Esta es Roxa</button>
            </div>

        </div>
    );
}

export default NombreUsuarios;
