function imageSlide() {
let Data = [
{
id: 1,
name: "mouse",
picture: "assets\\mousejpg.jpg",
details: "Wireless mouse with ergonomic design and long battery life"
},
{
id: 2,
name: "laptop.jpg",
picture: "assets\\laptop.jpg",
details: "15.6 inch laptop with Intel i7 processor, 16GB RAM, and 512GB SSD"
},
{
id: 3,
name: "tv",
picture: "assets\\TV.jpg",
details: "55 inch 4K Ultra HD Smart TV with HDR and Alexa Compatibility"
},
];

function createState(initialValue) {
    let _val = initialValue;
    return {
        getValue: function() {
            return _val;
        },
        setValue: function(newValue) {
            _val = newValue;
        }
    };
}
let indexInstance = createState(0);
const index = indexInstance.getValue();
const setIndex = indexInstance.setValue();

let depsArray = [];
function useEffect(effectFunc, deps) {
    const hasNoDeps = !deps;
    const hasDepsChanged = deps ? !depsArray.every((el, i) => el === deps[i]) : true;
    if (hasNoDeps || hasDepsChanged) {
        effectFunc();
        depsArray = deps;
    }
}
useEffect(function() {

setInterval(() => {
setIndex(( index  +  1 )  %  Data.length);
}, 2000);

}, []);

var div = document.createElement('div');
div.style = 'display: flex;justify-content: space-between;padding: 10px;';
var div = document.createElement('div');
var img = document.createElement('img');
img.style = 'width: 200px;height: 200px;border-radius: 9999px;';
img.src = `${Data[index].picture}`;
div.appendChild(img);

document.body.appendChild(div);
var div = document.createElement('div');
var p = document.createElement('p');
p.style = 'font-size: 18px;font-weight: bold;color: gray;';
p.innerHTML += Data[index].name;
div.appendChild(p);
var div = document.createElement('div');
div.innerHTML += Data[index].details;
document.body.appendChild(div);

document.body.appendChild(div);

document.body.appendChild(div);

}

imageSlide( )
