import express from 'express';

const app=express();

app.use(express.json());

app.get("/",(req,res)=>{
    res.send("Welcome to express app")
});

// app.get("/sum/:a/:b",(req,res)=>{
//     var x=parseInt(req.params.a);
//     var y=parseInt(req.params.b);
//     var z=x+y;
//     res.send("Sum is "+z);
// });

app.post("/sum",(req,res)=>{
    var x=req.body.a;
    var y=req.body.b;
    var z=x+y;
    res.send({sum:z});
});


app.get("/factorial/:n",(req,res)=>{
    try {
        var num=parseInt(req.params.n);
        if (num>0) {
            var f=1;
            for(var i=1;i<=num;i++){
                f=f*i;
            }
            res.status(200).send({factorial:f});
        } else {
            res.status(400).send({message:'Only +ve numbers are allowed'});
        }  
    } catch (error) {
        res.status(500).send({message:'Something went wrong'});
    }
    
    
});

app.listen(9700,()=>{
    console.log('listening on port 9700');
});