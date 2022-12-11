const http=require('http');

var server=http.createServer((request,response)=>{
    console.log("server is processing the request...");
    response.write("hii node js server");
    response.end();
});

server.listen(7600,()=>{
    console.log("server is listening on port 7600");
});

