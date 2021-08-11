import React from 'react'

const PresentationCarrousel = (props) => {
    const {item} = props
    // console.log(props);
    const { image, title, description, location } = item
    return (
        <>
            <div className="container" style={{height:"100%",width:"100%"}}>
                <div className="row" style={{height:"100%",width:"100%"}}> 
                    <div className="col m-auto">
                        <img src={image} className="img-fluid" alt="..." />
                    </div>
                    <div className="col m-auto">
                        <p>{title}</p>
                        <p>{description}</p>
                        <p>{location}</p>
                    </div>


                </div>
            </div>
        </>
    )
}

export default PresentationCarrousel
