
import express from 'express';
const app=express();                //created express application(server)

//Returns middleware 
app.use(express.urlencoded({
    extended:true
}));

app.set('view engine','pug')

app.get("/",(req,res)=>{
    res.render("index",{name:'Pragati',age:22})
});

app.get("/sum-form",(req,res)=>{
    res.render('form');
});

app.post("/sum",(req,res)=>{
    console.log(req.body);
    var x=parseInt(req.body.n1);
    var y=parseInt(req.body.n2);
    var z=x+y;
    res.render('form',{sum:z});
});

app.listen(9700,()=>{
    console.log("server 9700 is listening");
});