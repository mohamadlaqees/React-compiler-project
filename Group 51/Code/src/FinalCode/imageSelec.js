function imageSelec() {
let Data = [
{
id: 1,
name: "mouse",
picture: "assets\\mousejpg.jpg",
details: "Wireless mouse with ergonomic design and long battery life"
},
{
id: 2,
name: "laptop",
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
let detailsInstance = createState();
const details = detailsInstance.getValue();
const setDetails = detailsInstance.setValue();

function ProductDetails(detail, setDetail) {
if (( detail )) {
ProductsContent( detail, true, setDetail )
}
else {
var div = document.createElement('div');
div.innerHTML += "No product shown";
document.body.appendChild(div);

}

}

function Products(Data, setDetail) {
var div = document.createElement('div');
div.style = 'padding: 10px;display: flex;flex-direction: column;gap: 5px;border-bottom: 1px;cursor: pointer;';
for (let product of Data) {
ProductsContent( product, undefined, setDetail )
};

document.body.appendChild(div);

}

function ProductsContent(product, enableClass, setDetail) {
function productClick (  ) {
setDetail(product);
}

var div = document.createElement('div');
div.style = `${enableClass ? "margin: auto" : ""}`;
div.onclick = function() {
productClick(product);

};
var p = document.createElement('p');
p.style = 'font-size: 18px;font-weight: bold;color: gray;';
p.innerHTML += product.name;
div.appendChild(p);
var img = document.createElement('img');
img.style = 'width: 200px;height: 200px;border-radius: 9999px;';
img.src = `${product.picture}`;
div.appendChild(img);
if (( enableClass )) {
var div = document.createElement('div');
div.innerHTML += product.details;
document.body.appendChild(div);

};

document.body.appendChild(div);

}

var div = document.createElement('div');
div.style = 'display: flex;justify-content: space-between;padding: 10px;';
div.innerHTML = `${
ProductDetails( details, setDetails )}`;
div.innerHTML = `${
Products( Data, setDetails )}`;

document.body.appendChild(div);

}

imageSelec( )
