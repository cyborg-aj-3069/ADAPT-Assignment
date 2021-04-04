var next = (num,nextFibonacci)=>{nextfibonacci(num);}
var nextfibonacci = (num)=>{
    let n1 = 0;
    let n2 = 1;
    var n3;
   for(let i=0;i<=num;i++){
      n3 = n1+n2;
      n1=n2;
      n2=n3;
   }
    console.log("Next No :"+" "+n1);
}
next(7,3)