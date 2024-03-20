//npmjs.com/express

//getting dependencies of standard express module
const express = require('express')
const fs= require('fs');

//initializing an app - server side app
const app = express()

//start serving the whole folder using my web server
app.use(express.static("webapp"));

//registering the end point
app.get('/', function (req, res) {
  res.send('Hello World')
})


// app.get('/employees', function (req, res) {
//     var contentFile= fs.readFileSync(__dirname+"/webapp/emp.json","utf-8");
//     res.send(contentFile);
// });

console.log('server started at http://localhost:3000')
//listen to a port to start the web app
app.listen(process.env.PORT || 3000)