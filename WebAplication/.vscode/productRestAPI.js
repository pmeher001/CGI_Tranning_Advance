
// function loadProductData() {
//     fetch("https://dummyjson.com/products").
//     then(response=>response.json()).
//     then(result=>console.log(result.products)).catch(error=>console.log(error))
// }

function loadProductData() {
    fetch("https://dummyjson.com/products").
    then(response=>response.json()).
    then(result=>{
        const products = result.products;
        for(let i = 0; i < products.length; i++) {
            //console.log("id is " + products[i].id);
        var div = document.createElement("div");
        div.innerHTML = "Product Name "+ products[i].title;
        div.innerHTML += "<br>Product Price " + products[i].price;
        document.getElementById("productList").appendChild(div);
        }
  
    }).catch(error=>console.log(error))
}