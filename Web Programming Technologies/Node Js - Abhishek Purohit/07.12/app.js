console.log("Welcome to node js Day 1");
console.log("-------------------------");

/*
function factorial(){
    var n=5;
    var f=1;
    for(var i=1; i<=n; i++){
        f=f*i;
    }
    console.log("Factorial of "+n+" is "+f);
}

console.log("Factorial Calculation in process");
setTimeout(factorial,3000)
console.log("Factorial Calculation completed");

/*

function factorial(){
    var n=5;
    var f=1;
    for(var i=1; i<=n; i++){
        f=f*i;
    }
    console.log("Factorial of "+n+" is "+f);
}

function sum(){
    var a =7;
    var b =3;
    var sum = a+b;
    console.log("Sum is "+sum);
}

console.log("Factorial Calculation in process");
setTimeout(factorial,3000);
setTimeout(sum,2000);
console.log("Factorial Calculation completed");
*/

/*
//Here we are passing arguments in function factorial and sum
//whithin setTimeout also known as callback functions
function factorial(n){
    var f=1;
    for(var i=1; i<=n; i++){
        f=f*i;
    }
    console.log("Factorial of "+n+" is "+f);
}

function sum(){
    var a =7;
    var b =3;
    var sum = a+b;
    console.log("Sum is "+sum);
}

console.log("Factorial Calculation in process");
setTimeout(factorial,3000,5);
setTimeout(sum,2000);
console.log("Factorial Calculation completed");
*/

/*

////there is some problem
function factorial(n){
    var f=1;
    for(var i=1; i<=n; i++){
        f=f*i;
    }
}

function sum(a,b){
    var sum =a+b;
    return sum;
}
setTimeout(()=> {
    var c=sum(3,8)
    console.log("Sum is "+sum);
},4000);

setTimeout(()=> {
    var f=factorial(5)
    console.log("Factorial of is "+f);
},2000);

*/

//To make multiple peocess dependent on each other we need to
// to nest callback functions into one another
console.log(" Program starts ");
setTimeout(() =>{
    var a =7;
    var b =3;
    var sum = a+b;
    console.log("Sum is "+sum);
        setTimeout(() => {
        var n=5;
        var f=1;
        for(var i=1; i<=n; i++){
            f=f*i;
        }
        console.log("Factorial of "+n+" is "+f);
        },2000);
},4000);
