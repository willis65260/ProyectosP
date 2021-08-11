import React from 'react';
import PropTypes from 'prop-types';
import { WiSnow, WiDayCloudy, WiRaindrop, WiDaySunny, WiRain, WiThunderstorm } from "react-icons/wi";
import { IconContext } from 'react-icons'

const stateByName = {
    Clouds: <WiDayCloudy/>,
    Clear: <WiDaySunny/>,
    Rain: <WiRain/>,
    Snow: <WiSnow/>,
    Drizzle: <WiRaindrop/>,
    Thunderstorm: <WiThunderstorm/>
}

export const renderState = state => {
    // if (state == cloud) {
    //     return stateByName.cloud
    // }
    // switch (state) {
    //     case 'cloud': {
    //         const Icon = stateByName[state]
    //         return <Icon />
    //     }
    //     case 'cloudy': {
    //         const Icon = stateByName[state]
    //         return <Icon />
    //     }
    //     case 'fog': {
    //         const Icon = stateByName[state]
    //         return <Icon />
    //     }
    //     case 'sunny': {
    //         const Icon = stateByName[state]
    //         return <Icon />
    //     }
    //     case 'rainy': {
    //         const Icon = stateByName[state]
    //         return <Icon />
    //     }
    //     default:
    //         {
    //             const Icon = stateByName['sunny']
    //             return <Icon />
    //         }
    // }
    // let Icon = stateByName[state] 
    // if (Icon == undefined)
    //     Icon = stateByName["sunny"]

    // let Icon = stateByName[state] !== undefined ? stateByName[state] : stateByName["sunny"]
    // return <Icon />
    return stateByName[state]
}


const IconState = ({state}) => {
    return (
        <>
           {renderState(state)}
        </>
    );
};

 export const validValues = [
    "clouds",
    "clear",
    "rain",
    "snow",
    "drizzle",
    "thunderstorm"
]



IconState.propTypes = {
    state: PropTypes.oneOf(validValues).isRequired

};


export default IconState;

