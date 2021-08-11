import React from 'react'
import CityList from './CityList'
import { action } from '@storybook/addon-actions'

export default {
    title: "CitiList",
    component: CityList
}

const cities=[
    {city:"CDMX", country:"Mexico"},
    {city:"Bogota", country:"Colombia"},
    {city:"Madrid", country:"Espana"},
    {city:"Tokio", country:"Japon"},
    {city:"Paris", country:"Francia"}

]

export const CityListEjemplo = () =><CityList cities={cities} onClickCity={action("click en city")}></CityList>