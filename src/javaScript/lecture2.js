var a = 10
console.log(a)
console.log("hey daivik")

var b = 90
console.log(b)

console.warn("I am warning")

console.error("I am error")

// window.alert("window alert")

// alert("direct alert")

// prompt("enter your name in prompt: ")

// var p = prompt("enter your name: ")
// console.log(p)

var v = "daivik"
v = "vaibhav"
console.log(v)

let l = 10
l = 30
console.log(l)

const c = 20 
// c = 30 // in constant assigned value does not change
console.log(c)

// both array are referencing to same object
var arr1 = [1,2,3,4,5]
var arr2 = arr1
arr1.pop()
console.log(arr1)
console.log(arr2)

// both array are referencing to different object
var arr1 = [1,2,3,4,5]
var arr2 = [...arr1]
arr1.pop()
console.log(arr1)
console.log(arr2)