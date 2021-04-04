const order = {
    id:'101',
    title: 'Mobile',
    price: '10000'
}

//printOrder 
console.log(order)

//getPrice
var Price = Object.assign(order.price);
console.log("Price :"+Price)

//copy the order object using Object.assign
var Order = Object.assign({},order);
console.log(Order)