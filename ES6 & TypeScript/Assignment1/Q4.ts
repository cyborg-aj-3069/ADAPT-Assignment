const leng = (...args) => {
 
    var arr = [];
    
    for (var i = 0; i < args.length; i++) {
      arr.push(" Name : "+args[i]);
      arr.push(" Length : "+args[i].length);
    }
    
    return arr;
  }
  
  console.log(leng("Tom", "Ivan", "Jerry"));