import {
    useState,
    useEffect
} from 'react'
import axios from 'axios'


export default function useAuth(code) {
    const [accsessToken, setAccessToken] = useState()
    const [refreshToken, setRefreshToken] = useState()
    const [expiresIn, setExpiresIn] = useState()

    window.history.pushState({}, null, "/")
    useEffect(() => {
        axios.post('http://localhost/3001/login', {
            code,
        }).then(res => {
            console.log("algo expert.io")
            
            console.log(res)
        }).catch((err) => {
            console.log("valio quesadilla");
            console.log(err);
            // window.location = '/'
        })
    }, [code])

}