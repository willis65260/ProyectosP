import React from 'react';


const Button = ({type,text,clickHandler}) => {
    return (
           <button className={type} onClick={()=>{
               console.log("estamos dentro del boton",text);
               clickHandler(text);
           }}>
               <span>{text}</span>
           </button>
    );
}


export default Button