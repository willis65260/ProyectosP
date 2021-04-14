import React from 'react'
import Button from './Button'
import PropTypes from 'prop-types'

const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0];

const renderB = onClickNumber => {


}



const Numbers = (props) => {
    const { onClickNumber } = props

    return (
        <div className="numbers">
            {numbers.map(num => {
                return <Button text={num.toString()} clickHandler={onClickNumber} />
            })}
        </div>
    )
}

Numbers.propTypes = {
    onClickNumber: PropTypes.func
}

export default Numbers