//Find the square if no is prime
function primeCheck(n){
    return new Promise((resolve,reject)=>{
        for(var i=2; i<n; i++){
            if(n%i==0){
                reject();
            }else{
                resolve(n);
            }
        }
    })
}

function square(n){
    return n*n;
}

primeCheck(8)
.then((n)=> {
    console.log("The square of prime no is "+square(n));
}).catch(()=>{
    console.log(`The given number is not prime`);
})