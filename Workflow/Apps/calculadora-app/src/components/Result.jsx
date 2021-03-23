import React from 'react';
import PropTypes from 'prop-types'


//* Las propiedades (props) es un objeto que se recibe cuando le mandas argumentos al componente
//* esto se hace por paso de parametros por referencia
// const Result = (props) => {
//     console.log("El objeto recibido es :" + props);
//     console.log("El valor recibido es :" + props.value);
//     console.log("El usuario recibido es :" + props.user);
//     console.log("El usuario esta activo es :" + props.active);
//TODO esto es destructuring de un objeto
//     const { value, user, active } = props;

//     console.log("El objeto recibido es :" + props);
//     console.log("El valor recibido es :" + value);
//     console.log("El usuario recibido es :" + user);
//     console.log("El usuario esta activo es :" + active);

//TODO Aqui se hace un destructuring al momento de recibir el objeto
const Result = ({ value, user, active }) => {
    
    console.log("El valor recibido es :" + value);
    console.log("El usuario recibido es :" + user);
    console.log("El usuario esta activo es :" + active);



    return (
        <div className="result">
            <span>{value}</span>
        </div>
    );
}

//! Esto es el sustituto del codigo de abajo en vanilla JS value = value || "0"
Result.defaultProps = {
    value: "0"
}

//*Verifica que los tipos de dato mandados son los correctos
Result.propTypes = {
    value: PropTypes.string.isRequired,

}



export default Result