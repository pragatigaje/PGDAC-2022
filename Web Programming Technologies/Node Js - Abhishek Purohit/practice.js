var xhr=new XMLHttpRequest();
var evenpromise = new Promise((resolve,reject)=>{
var n=6;
if(n%2==0){
    resolve();
}
else{
    reject();
}
});

console.log(evenpromise);
