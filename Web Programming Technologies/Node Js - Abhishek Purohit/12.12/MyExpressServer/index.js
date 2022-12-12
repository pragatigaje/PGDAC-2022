import express from 'express';
const app=express();

app.get("/",(req,res)=>{
    res.send("Welcome to express app")
});

app.get("/sum",(req,res)=>{
    var x =4;
    var y=6;
    var z=x+y;
    res.send(`The sum is ${z}`);
})

app.get("/sum/:a/:b",(req,res)=>{
    var x = parseInt(req.params.a);
    var y = parseInt(req.params.b);
    var z=x+y;
    res.send(`The sum is ${z}`);
})

app.get('/factorial/:n',(req,res)=>{
    let f=1;
    for(var i=1; i<parseInt(req.params.n) ; i++){
        f=f*1;
    }
    res.send("The factorial "+req.params.n+" is "+f);
})

app.listen(9700,()=>{
    console.log("server 9700 is listening");
});