import React, {useRef, useEffect, useState} from 'react';
import PropTypes from 'prop-types';
import Clouds from 'vanta/dist/vanta.clouds.min'
import * as THREE from 'three'

const WelcomeScreen = ({children}) => {
    const myRefDiv = useRef(null)
    const [vanta,setVanta]=useState(0)
    console.log("primera renderizacion",myRefDiv.current)

    useEffect(() => {
        console.log("Segunda renderizacion",myRefDiv.current)
        if(vanta === 0){
            setVanta(
                Clouds({
                    THREE,
                    el: myRefDiv.current
                })
            )
            console.log("vanta diferente de 0")
        }

        return () => {
            if(vanta){
                vanta.destroy()
                console.log("Destruido")

            }
        }

    },[vanta])

    return (
        <div className='full' ref={myRefDiv}>
           {children}
        </div>
    );
};


WelcomeScreen.propTypes = {
 children: PropTypes.node,
};


export default WelcomeScreen;
