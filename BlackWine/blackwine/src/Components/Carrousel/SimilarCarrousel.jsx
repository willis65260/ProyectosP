import React, { useState } from 'react'

import PresentationCarrousel from './PresentationCarrousel'

const SimilarCarrousel = (props) => {
    // console.log(props);
    const {Information,title="Restaurante"}=props;

    const [Presentation, setPresentation] = useState(<PresentationCarrousel item={Information['Item1']} />)

    const ChangePresentation = (number) => {
        if (number == 1)
            setPresentation(<PresentationCarrousel item={Information['Item1']} />)
        if (number == 2)
            setPresentation(<PresentationCarrousel item={Information['Item2']} />)
        if (number == 3)
            setPresentation(<PresentationCarrousel item={Information['Item3']} />)
        // console.log("se metio");
    }

    return (
        <>
            <br />
            <br />
            <br />

            <div className="card text-white bg-dark mb-3 m-5">
                <div className="card-header"><h1>{title}</h1></div>
                <div className="card-body">

                    <div className="container">
                        <div className="row">
                            <div className="col-3">

                                <div className="container">
                                    <div className="row">
                                        <div className="col">
                                            <div className="container">
                                                <a onClick={()=>ChangePresentation(1)} ><img src={Information['Item1']['image']} className="img-fluid" alt="..." /></a>
                                                <p>La terraza</p>

                                            </div>
                                        </div>
                                    </div>
                                    <br />
                                    <div className="row">
                                        <div className="col">
                                            <div className="container">
                                                <a onClick={()=>ChangePresentation(2)} ><img src={Information['Item2']['image']} className="img-fluid" alt="..." /></a>
                                                <p>cocoa&thermos</p>

                                            </div>
                                        </div>
                                    </div>
                                    <br />
                                    <div className="row">
                                        <div className="col">
                                            <div className="container">
                                                <a onClick={()=>ChangePresentation(3)} ><img src={Information['Item3']['image']} className="img-fluid" alt="..." /></a>
                                                <p>La hamburgueseria</p>

                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>
                            <div className="col">
                                {Presentation}
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </>
    )
}

export default SimilarCarrousel
