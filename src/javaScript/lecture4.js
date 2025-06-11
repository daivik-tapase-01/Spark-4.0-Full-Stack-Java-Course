var arr = [1,2,3]
console.log(arr[6])

var arr1 = [1,"raj",[], function(){}]
console.log(arr1[3])

var obj = {
    name: "daivik",
    age:25,
    email: "abc@gmail.com",
    contact: 2344544526
}

console.log(obj.age)

console.log(this)

var obj1 = {
    name: function(){
        console.log(this);
    },
    age:25
}
console.log(obj1.age)
obj1.name()

console.log("ES5")
var obj2 = {
    parent : function(){
        function child(){
            console.log(this)
        }
        child()
    }
}
obj2.parent()

console.log("ES6")
var obj3 = {
    name : function(){
        var child = ()=>{
            console.log(this)
        }
        child()
    }
}
obj3.name()

// constructor, new blank object
function print1(){
    console.log(this)
}
var obj4 = new print1()
console.log(obj4)

document.querySelector("button").addEventListener("click",function(){
    console.log(this)
})

var obj5 = {
    name: "daivik"
}

function print2(){
    console.log(this.name)
}
print2.call(obj5)

var obj6 = {
    name: "daivik"
}

function print3(x,y,z){
    console.log(this,x,y,z)
}
print3.apply(obj6,[1,2,3])


var obj7 = {
    name: "daivik"
}

function print4(){
    console.log(this.name)
}
var func = print4.bind(obj7)
func()

function print5(){
    var p = 10
    return function child(){
        p++
        console.log(p)
    }
}
var fun = print5()
fun()