import express from 'express';
import { createConnection } from 'mysql';
import cors from 'cors';

const app = express();
app.use(cors())
app.use(express.json());

const conn = createConnection({
    host: "localhost",
    user: "root",
    password: "password",
    database: "productrequest"
});
conn.connect((error) => {
    if (error) {
        console.log(error);
    }
    else {
        console.log("Database connected !");
    }
});

app.post('/products',(request,response)=>{
    var insertQry=`INSERT INTO request VALUES(
        ${request.body.id},'${request.body.name}','${request.body.brandname}',
        '${request.body.phone}',${request.body.price},'${request.body.email}')`
    conn.query(insertQry,(error,result)=>{
        if (error) {
            response.status(500).send({message:'Error in inserting student'});
        }
        else{
            response.status(200).send({message:'Student registered successfully'});
        }
    });
});

app.get('/products', (request, response) => {
    var selectQry = "SELECT * FROM request";
    conn.query(selectQry, (error, result) => {
        if (error) {
            response.status(500).send({ message: 'Error in fetching product request' });
        } else {
            response.status(200).send(result);
        }
    })
});
app.get('/products/:id', (request, response) => {
    var selectQry = "SELECT * FROM request WHERE id=" + request.params.id;
    conn.query(selectQry, (error, result) => {
        if (error) {
            response.status(500).send({ message: 'Error in fetching product request' });
        } else {
            response.status(200).send(result);
        }
    })
});

app.delete('/products/:id', (request, response) => {
    var deleteQry = "DELETE FROM request WHERE id=" + request.params.id;
    conn.query(deleteQry, (error, result) => {
        if (error) {
            response.status(500).send({ message: 'Error in deleting product request' });
        } else {
            response.status(200).send({ message: 'Successfully deleted product request' });
        }
    })
});

app.get('/students/name/:pattern', (request, response) => {
    var fetchQry = `SELECT * FROM student WHERE name like '${request.params.pattern}%'`;
    conn.query(fetchQry, (error, result) => {
        if (error) {
            response.status(500).send({ message: 'Error in fetching product request' });
        } else {
            response.status(200).send(result);
        }
    });
});
app.get('/shop', (request, response) => {
    var selectQry = "SELECT * FROM product";
    conn.query(selectQry, (error, result) => {
        if (error) {
            response.status(500).send({ message: 'Error in fetching product request' });
        } else {
            response.status(200).send(result);
        }
    })
});
app.listen(9800, () => {
    console.log('listening on 9800');
});