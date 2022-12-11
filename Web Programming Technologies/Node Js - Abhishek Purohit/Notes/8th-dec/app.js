function sum(a, b) {
    return new Promise((resolve, reject) => {
        console.log("finding sum...");
        setTimeout(() => {
            resolve(a + b)
        }, 4000)
    });
}

function factorial(n) {
    return new Promise((resolve, reject) => {
        console.log("finding factorial...");
        setTimeout(() => {
            var f = 1;
            for (var i = 1; i <= n; i++) {
                f = f * i;
            }
            resolve(f);
        }, 2000);
    });
}

function cube(n){
    return new Promise((resolve,reject)=>{
        console.log("finding cube...");
        setTimeout(()=>{
            var c=n*n*n;
            resolve(c);
        }, 3000);
    });
}
async function handlePromise(){
    try {
        var result=await sum(2,4);// await will return the value which is passed inside the resolve
        console.log("sum is",result);
        var f=await factorial(result);
        console.log("factorial is",f);
        var c=await cube(f);
        console.log("cube is",c);
    } catch (error) {
        console.log(error);
    }
}
handlePromise();
// sum(2,4)
// .then((c) => {
//     console.log("sum is", c);
//     return factorial(c);
// })
// .then((f)=>{
//     console.log("factorial is", f);
//     return cube(f);
// })
// .then((cubeValue)=>{
//     console.log("cube is", cubeValue);
// })
// .catch((error)=>{
//     console.log(error);
// });