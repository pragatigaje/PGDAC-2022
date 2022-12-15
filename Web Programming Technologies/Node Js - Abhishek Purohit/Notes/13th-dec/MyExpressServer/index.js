import express from 'express';

const app=express();
app.set('view engine', 'pug');

// app.use(express.json());
app.use(express.urlencoded({
    extended: true
}));

app.get("/",(req,res)=>{
    //res.send("Welcome to express app")
    res.render("index",{name:'Ajay',age:24})
});

app.get('/sum-form',(req,res)=>{
    res.render('form');
});

app.post("/sum",(req,res)=>{
    console.log(req.body);
    var x=parseInt(req.body.n1);
    var y=parseInt(req.body.n2);
    var z=x+y;
    res.render('form',{sum:z});
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