exports.sum=(a,b)=>{
    return a+b;
}

exports.factorial=(n)=>{
    var f=1;
    for(let i=1; i<=n ; i++){
        f=f*i
    }
    return f;
}