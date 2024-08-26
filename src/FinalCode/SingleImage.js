function singleImage() {
let array = [
{
id: 1,
name: "mouse",
picture: "..\\assets\\mousejpg.jpg",
details: "Wireless mouse with ergonomic design and long battery life"
},
];

var div = document.createElement('div');
var img = document.createElement('img');
img.style = 'padding: 30px;display: flex;justify-content: center;';
img.src = `${array[0].picture}`;
div.appendChild(img);
document.body.appendChild(div); 
}

singleImage( )
