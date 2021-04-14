import React from 'react';
import PropTypes from 'prop-types'
import './Button.css'

const Button = ({ type, text, clickHandler }) => {
    return (
        <button className={type} onClick={() => {
            console.log("estamos dentro del boton", text);
            clickHandler(text);
        }}>
            <span>{text}</span>
        </button>
    );
}

//*Verifica que los tipos de dato mandados son los correctos
Button.propTypes = {
    // value: PropTypes.string.isRequired,
    type:PropTypes.string,
    text:PropTypes.string.isRequired, 
    clickHandler:PropTypes.func.isRequired
}

//! Esto es el sustituto del codigo de abajo en vanilla JS value = value || "0"
Button.defaultProps = {
    value: "0"
}



export default Button