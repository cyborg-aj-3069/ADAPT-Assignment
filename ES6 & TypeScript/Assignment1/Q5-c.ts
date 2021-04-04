function toCap(...array){
    newArray = [5]
    array.map((name)=>{newName= name.toUpperCase();
     newArray.push(newName);
     console.log(newArray.join(','));
 })
}
toCap('sita','ram','laxman','jatayu','bali');