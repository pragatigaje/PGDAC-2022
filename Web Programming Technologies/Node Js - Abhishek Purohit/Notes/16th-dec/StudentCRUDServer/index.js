import express from 'express';
import { createConnection } from 'mysql';

const app = express();
app.use(express.json());

const conn=createConnection({
    host: "localhost",
    user: "root",
    password: "root",
    database: "cdac_db"
});
conn.connect((error)=>{
    if (error) {
        console.log(error);
    }
    else{
        console.log("Database connected !");
    }
});

app.post('/students',(request,response)=>{
    var insertQry=`INSERT INTO student VALUES(
        ${request.body.id},'${request.body.name}',
        '${request.body.phone}',${request.body.marks},'${request.body.email}')`
    conn.query(insertQry,(error,result)=>{
        if (error) {
            response.status(500).send({message:'Error in inserting student'});
        }
        else{
            response.status(200).send({message:'Student registered successfully'});
        }
    });
});

app.get('/students',(request,response)=>{
    var selectQry="SELECT * FROM student";
    conn.query(selectQry,(error,result)=>{
        if (error) {
            response.status(500).send({message:'Error in fetching students'});
        } else {
            response.status(200).send(result);
        }
    })
});
app.get('/students/:id',(request,response)=>{
    var selectQry="SELECT * FROM student WHERE id="+request.params.id;
    conn.query(selectQry,(error,result)=>{
        if (error) {
            response.status(500).send({message:'Error in fetching students'});
        } else {
            response.status(200).send(result);
        }
    })
});
app.listen(9800,()=>{
    console.log('listening on 9800');
});