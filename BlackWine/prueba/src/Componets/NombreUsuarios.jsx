import React from 'react';





const NombreUsuarios = ({ clickHandler}) => {
    return (
        <div className="jumbotron rounded">
            <h5>Nombres de usuario</h5>
            <div className="row">
                <button onClick={()=>{
               console.log("estamos dentro del boton","jose");
               clickHandler("jose","la fotografia de un muy bien parecido señor","imagnes de sus viajes","es joven que bla bla bla y que tambie bla");
           }}>Este es jose</button>
            </div>
            <div className="row">

            <button onClick={()=>{
               console.log("estamos dentro del boton","jose");
               clickHandler("juan","la fotografia de otro muy bien parecido señor","imagnes de sus viajes","este señor le pego duro al gym ufff");
           }}>Este es juan</button>
            </div>
            <div className="row">

            <button onClick={()=>{
               console.log("estamos dentro del boton","jose");
               clickHandler("ale","la fotografia de una señora muy bonita","imagnes de sus viajes","aguas con hacerla enojar porque ufff, le tengo respeto no miedo");
           }}>Esta es Ale</button>
            </div>
            <div className="row">
            <button onClick={()=>{
               console.log("estamos dentro del boton","jose");
               clickHandler("jose","la fotografia de una niña muy bonita","imagnes de sus viajes","es una niña, es callada, timida, inocente tiene la mirada");
           }}>Esta es Roxa</button>
            </div>

        </div>
    );
}

export default NombreUsuarios;
