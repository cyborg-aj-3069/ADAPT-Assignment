function getNextArmstrong(n:any) {
  let result=0;
    for(let i=n;i<=1000;++i)
    {
        let w=i;
        while(i!=0)
        {
        const remainder = i % 10;
        result += remainder * remainder * remainder;
        i /= 10;
        }
     if (result === w)
     {
        console.log(w);
        break;
     }
      result=0;
}
}
getNextArmstrong(153);
