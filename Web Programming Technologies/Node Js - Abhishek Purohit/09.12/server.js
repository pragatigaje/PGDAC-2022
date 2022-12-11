const http = require('http');

var server = http.createServer((request, response)=>{
    console.log("server is processing request");
    response.write("hii node js server");
    response.end();
});

server.listen(8080,()=>{
    console.log("server is listening on port 6500");
});