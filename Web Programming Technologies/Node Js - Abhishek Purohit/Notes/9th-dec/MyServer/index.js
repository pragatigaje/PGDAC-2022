const http=require('http');
const num=require('./src/NumberOperations.js');
const server=http.createServer((req,res)=>{
    var z=num.sum(4,2);
    var f=num.factorial(5);
    res.write(`Sum is ${z} and factorial is ${f}`);
    res.end();
});
server.listen(9500,()=>{
    console.log('Server listening on 9500');
});