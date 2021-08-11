import React from 'react';
import PropTypes from 'prop-types'
const Result = ({ value, user, active }) => {
    return (
        <div className="result">
            <span>{value}</span>
        </div>
    );
}
Result.defaultProps = {
    value: "0"
}
Result.propTypes = {
    value: PropTypes.string.isRequired,

}
export default Result