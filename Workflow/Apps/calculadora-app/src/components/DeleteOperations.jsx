import React from 'react'
import PropTypes from 'prop-types';
import Button from './Button'

export default function DeleteOperations({onContentClerear,onContentDelete}) {
    return (
        <section className="functions">
            <Button type="button-sm-text" text="clear" clickHandler={onContentClerear} />
            <Button type="" text="&larr;" clickHandler={onContentDelete} />
        </section>
    )
}

DeleteOperations.propTypes = {
    onContentClerear: PropTypes.func.isRequired,
    onContentDelete: PropTypes.func.isRequired
}
