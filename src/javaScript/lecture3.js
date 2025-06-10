var a = 10
if(a>9){
    console.log("greater")
}else{
    console.log("small");
}

for(var i=0; i<2;i++){
    console.log(i)
}

var arr1 = ["a","b","c"]
arr1.forEach(data =>{
    console.log(data);
    
})

// function statement (normal function)
function print(name) {
    console.log("function "+ name)
    return "return"
}

var retu = print("daivik")
console.log(retu)

// function expression -> name of function on left side
var jeep = function(){
    console.log("speed...")
}
jeep()

// funtions in ES6 (ECMAScript 6)

// fat arrow function 
var fat = ()=>{
    console.log("fat arrow function")
}
fat()

// fat arrow with one parameter 
var fatPara = (type)=>{
    console.log("fat arrow with " + type)
}
fatPara("one return type")

// fat arrow with implicit return
var fatRetu = (a,b)=>{
    return a+b
}
var sum = fatRetu(10,20)
console.log(sum)