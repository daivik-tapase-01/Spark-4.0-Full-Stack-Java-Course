window.console.log("hello")

var h1 = document.querySelector('h1')
console.log(h1)

var id1 = document.querySelector('#id1')
console.log(id1)
id1.textContent = "new id"

var class1 = document.querySelector('.class1')
console.log(class1)
class1.innerHTML= "<i>new class</i>"

var para = document.querySelector('p');
para.style.color = 'blue';
para.style.fontFamily = 'Courier New';

para.classList.add('redCss');
para.classList.remove('redCss');

// add and removing elements
var h2 = document.createElement('h2')
h2.textContent="new heading"

document.querySelector('body').appendChild(h2)

var remo = document.querySelector('h2');
remo.remove()

var rem = document.querySelector('#rem')
document.querySelector('body').removeChild(rem);


// event handling in js
var button1 = document.querySelector('button');

button1.addEventListener('click',function(){
    button1.textContent="Starting download...";
});
console.log(button1);

button1.addEventListener('click',function(){
    console.log("button clicked")
});