import {createServer} from 'http';
import {sum,factorial} from './src/NumberOperations.js'

const server=createServer((req,res)=>{
    var z=sum(4,2);
    var f=factorial(5);
    res.write(`Addition is ${z} and factorial is ${f}`);
    res.end();
});
server.listen(9500,()=>{
    console.log('Server listening on 9500');
});