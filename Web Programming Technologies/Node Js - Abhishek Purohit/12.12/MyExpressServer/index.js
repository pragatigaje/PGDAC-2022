import express from 'express';
const app=express();                //created express application(server)

//Returns middleware that only parses json and only looks at requests where the Content-Type header matches the type option.
app.use(express.json());

app.get("/",(req,res)=>{
    res.send("Welcome to express app")
});

app.get("/sum",(req,res)=>{
    var x =4;
    var y=6;
    var z=x+y;
    res.send(`The sum is ${z}`);    //Send a response.
})

// app.get("/sum/:a/:b",(req,res)=>{
//      //we have to parse req.params.a into int as it is returning string 
//     var x = parseInt(req.params.a);
//     var y = parseInt(req.params.b);
//     var z=x+y;
//     res.send(`The sum is ${z}`);
// })

app.post("/sum/:a/:b",(req,res)=>{
    //By default express doesnt unserstand req may have req body of type json
    //req body return data with data type i.e. integer
    var x=req.body.a;
    var y=req.body.b;
    var z=x+y;
    res.send(`The sum is ${z}`);
})

app.get('/factorial/:n',(req,res)=>{
    let f=1;
    for(var i=1; i<parseInt(req.params.n) ; i++){
        f=f*i;
    }
    res.send("The factorial "+req.params.n+" is "+f);
})

app.listen(9700,()=>{
    console.log("server 9700 is listening");
});