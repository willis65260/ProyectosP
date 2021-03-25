const express = require('express');
const cors = require("cors")
const bodyParser = require('body-parser')
const spotifyWebApi = require('spotify-web-api-node');
const {
    response
} = require('express');

const app = express();
app.use(cors())
app.use(bodyParser.json())

app.post('/refres', (req, res) => {
    const refreshToken = req.body.refreshToken
    const spotifyApi = new spotifyWebApi({
        redirectUri: 'http://localhost:3000',
        clientId: '625ff56b93fc4604918f9329a8778bb1',
        clientSecret: '711b5dbec2ba434aa9ea446b3e55ad4e',
        refreshToken
    })

    // clientId, clientSecret and refreshToken has been set on the api object previous to this call.
    spotifyApi.refreshAccessToken().then(
        (data) => {
            console.log(data.body);

           
            // spotifyApi.setAccessToken(data.body['access_token']);
        }).catch(()=>{
            res.sendStatus(400)
        })
})


app.post('/login', (req, res) => {
    const code = req.body.code
    const spotifyApi = new spotifyWebApi({
        redirectUri: 'http://localhost:3000',
        clientId: '625ff56b93fc4604918f9329a8778bb1',
        clientSecret: '711b5dbec2ba434aa9ea446b3e55ad4e'
    })

    spotifyApi.authorizationCodeGrant(code).then(data => {
        res.json({
            accessToken: data.body.access_token,
            refreshToken: data.body.refresh_token,
            expiresIn: data.body.expires_in
        })
    }).catch(err => {
        console.log(err)
        res.sendStatus(400)
    })
})

app.listen(3001)