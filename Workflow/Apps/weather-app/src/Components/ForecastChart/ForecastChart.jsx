import React from 'react'
import PropTypes from 'prop-types'
import {LineChart,Line,XAxis,YAxis,CartesianGrid,Legend,Tooltip, ResponsiveContainer} from 'recharts'


const ForecastChart =({data})=>{
    return(
        <ResponsiveContainer height={250} width={'90%'}>
        <LineChart height={200}
                    width={700}
                    margin={{top:20,bottom:20,right:5, left:5}}
                    data={data}>
                        <XAxis dataKey="dayHour"></XAxis>
                        <YAxis></YAxis>
                        <CartesianGrid></CartesianGrid>
                        <Legend></Legend>
                        <Tooltip></Tooltip>
                        <Line type="monotone" dataKey="max" stroke="#ff0000"></Line>
                        <Line type="monotone" dataKey="min" stroke="#0000ff"></Line>

        </LineChart>
        </ResponsiveContainer>
    )
}

ForecastChart.propTypes = {
    data: PropTypes.arrayOf(
    PropTypes.shape({
        dayHour:PropTypes.string.isRequired,
        min: PropTypes.number.isRequired,
        max:PropTypes.number.isRequired
    }),
    ).isRequired,
}

export default ForecastChart