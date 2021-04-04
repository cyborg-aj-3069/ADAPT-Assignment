function getNextArmstrong(n) {
        let result=0;
          for(let i=n;i<=1000;++i)
          {
              let w=i;
              while(i!=0)
              {
              const rem = i%10;
              result = result + (rem^3);
              i = i/10;
              }
           if (result === w)
           {
              console.log(w);
              break;
           }
            result=0;
      }
      }
      NextArmstrongNum(2);
