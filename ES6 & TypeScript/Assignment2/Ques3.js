function getNextArmstrong1(n) {
     var result=0;
   if(n<0 && n>1000)
   {
      console.log("Number should be btw 0 & 1000");
      
   }
     for(var i=1;i<=n;i++)
     {
        
         var r=i;
         while(i > 0)
         {
            var rem = i%10;
            result = result + (rem^3);
            i = i/10;
            }
      if (result === r)
      {
         console.log(r);
         break;
      }
      result=0;
 }
 }