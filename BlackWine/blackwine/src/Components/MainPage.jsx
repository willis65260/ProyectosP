import React from 'react'
import Header from './Header'
import logo1 from '../Resources/Images/logo1.jpg'
import logo2 from '../Resources/Images/logo2.jpg'
import logo3 from '../Resources/Images/logo3.jpg'

import platillo1 from '../Resources/Images/platillo1.jpg'
import platillo2 from '../Resources/Images/platillo2.jpg'
import platillo3 from '../Resources/Images/platillo3.jpg'

import SimilarCarrousel from './Carrousel/SimilarCarrousel'

const carrouselData = {
    'Item1': {
       'image': logo1 ,
        'title': "La terraza",
        'description': "Hacemos sushi muy rico",
        'location': "link a el mapa"
    },
    'Item2': {
        'image': logo2 ,
        'title': "cocoa y cafe",
        'description': "Hacemos cafes muy ricos",
        'location': "link a el mapa"
    },
    'Item3': {
        'image':  logo3 ,
        'title': "La Hamburgueseria",
        'description': "Hacemos hamburguesas muy ricas",
        'location': "link a el mapa"
    }
}


const carrouselData2 = {
    'Item1': {
       'image': platillo1 ,
        'title': "La terraza",
        'description': "Hacemos sushi muy rico",
        'location': "link a el mapa"
    },
    'Item2': {
        'image': platillo2 ,
        'title': "cocoa y cafe",
        'description': "Hacemos cafes muy ricos",
        'location': "link a el mapa"
    },
    'Item3': {
        'image':  platillo3 ,
        'title': "La Hamburgueseria",
        'description': "Hacemos hamburguesas muy ricas",
        'location': "link a el mapa"
    }
}


const MainPage = () => {
    return (
        <>
            <Header />
            <SimilarCarrousel Information={carrouselData} title="Restaurante"/>
            <SimilarCarrousel Information={carrouselData2} title="Platillos"/>
        </>
    )
}

export default MainPage
