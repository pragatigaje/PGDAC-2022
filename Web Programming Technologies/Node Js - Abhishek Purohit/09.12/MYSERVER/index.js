const http = require('http');
const num = require('./Operations.js');
const server = http.createServer((req,res)=>{
    var z=num.sum(5,6);
    var f=num.factorial(6);
    res.write("sum is "+z );
    res.write("Factorial is "+f);
    res.end();
});

server.listen(9500,()=>{
    console.log('Server listening on 9500');
}) 