const express = require('express')
const cors = require('cors')
const bodyParser = require('body-parser')
const SopotifyWebApi = require('spotify-web-api-node')

const app = express()
app.use(cors())
app.use(bodyParser.json())

app.post('/login', (req, res) => {
    const code = req.body.code
    const spotifyApi = new SopotifyWebApi({
        redirectUri: 'http://localhost:3000',
        clientId: '625ff56b93fc4604918f9329a8778bb1',
        clientSecret: '711b5dbec2ba434aa9ea446b3e55ad4e'
    })
    spotifyApi.authorizationCodeGrant(code).then(data => {
        res.json({
            accsessToken: data.body.access_token,
            refreshToken: data.body.refresh_token,
            expiresIn: data.body.expires_in
        })
    }).catch(err => {
        console.log(err)
        res.sendStatus(400)
    })

})

app.listen(3001)