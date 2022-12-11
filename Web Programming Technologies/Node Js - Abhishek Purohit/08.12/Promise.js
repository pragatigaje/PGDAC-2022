/*
var evenPromise = new Promise((resolve,reject)=>{
    var n=7;
    if(n%2==0)
    {
        resolve("Promise is resolved and no is even");
    }
    else{
        reject("Promise is rejected and no is odd");
    }
});

evenPromise.then((result)=>{
    console.log(result);
}).catch((error) =>{
    console.log(error);
});
*/
/*
function checkEven(n){
    return evenPromise = new Promise((resolve,reject)=>{
        var n=7;
        if(n%2==0)
        {
            resolve("Promise is resolved and no is even");
        }
        else{
            reject("Promise is rejected and no is odd");
        }
    });
}

checkEven(6);

*/

function sum(a,b){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve(a+b)
        },4000)
    });
}

sum(4,6)
.then((c)=>{
    console.log("Sum is",c);
}).catch();