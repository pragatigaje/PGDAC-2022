console.log("Pragati")

function greet(name){
    console.log(name+" is a good boy");
}

function sum(a,b,c){
    let d = a+b+c;
    return d;
}

let a =10;
let b=12;
let c=45;
let sum1=sum(a,b,c);
console.log(sum1);
console.log(sum(10,14,2));

function min(a,b){
    if (a<b){
        console.log("Min no :"+a);
    }
    else{
        console.log("Min no :"+b);
    }
}

function max(a,b){
    if (a>b){
        console.log("Max no :"+a);
    }
    else{
        console.log("Max no :"+b);
    }
}

min(10,12);
max(56,12);

