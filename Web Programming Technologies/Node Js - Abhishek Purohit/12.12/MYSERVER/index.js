import { createServer } from 'http';
import { sum, factorial } from './Operations.js';
const server = createServer((req,res)=>{
    var z=sum(5,6);
    var f=factorial(6);
    res.write("sum is "+z );
    res.write("Factorial is "+f);
    res.end();
});

server.listen(9500,()=>{
    console.log('Server listening on 9500');
}) 