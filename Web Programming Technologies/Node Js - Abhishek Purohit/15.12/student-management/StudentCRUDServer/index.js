import express from 'express';
import { createConnection } from 'mysql';
const app= express();

//middelware to read json request body
app.use(express.json());

//create db connection 
//it returns connection object
const conn=createConnection({
    host: "localhost",
    user: "root",
    password: "password ",
    database:"cdac_db", 
});

//to check if connection is successful or not
conn.connect((error)=>{
    if(error){
        console.log(error);
    }
    else{
        console.log("connection created");
    }
});

//to store data of students in DB
app.post('/students',(req,res)=>{
});

//to get data of all the students
    app.get('students',(req,res)=>{
});

app.listen(9800, ()=>{
    console.log('Listening on port 9800');
});
