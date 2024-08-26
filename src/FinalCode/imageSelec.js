function imageSelec() {
let Data = [
{
id: 1,
name: "mouse",
picture: "..\\assets\\mousejpg.jpg",
details: "Wireless mouse with ergonomic design and long battery life"
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
let testNowInstance = createState(100);
const testNow = testNowInstance.getValue();
const setTestNow = testNowInstance.setValue;

function ProductDetails(detail, setDetail) {
var div = document.createElement('div');
if (detail) {
var div = document.createElement('div');
div.style = 'margin: auto;';
div.appendChild( ProductsContent( detail, true, setDetail ));

return div;

}
else {
var div = document.createElement('div');
div.innerHTML += "No product shown";
return div;

}

return div;
}

function Products(Data, setDetail) {
var div = document.createElement('div');
div.style = 'padding: 10px;display: flex;flex-direction: column;gap: 5px;border-bottom: 1px;cursor: pointer;';
for (let product of Data) {
div.appendChild (
ProductsContent( product, undefined, setDetail )
)
};

return div;

}

function ProductsContent(product, enableClass, setDetail) {
function productClick (  ) {
setDetail( product ) 
renderUI();

}

var div = document.createElement('div');
div.style = `${enableClass ? "margin: auto" : ""}`;
div.onclick = productClick
var p = document.createElement('p');
p.style = 'font-size: 18px;font-weight: bold;color: gray;';
p.innerHTML += product.name;
div.appendChild(p);
var img = document.createElement('img');
img.style = 'width: 200px;height: 200px;border-radius: 9999px;';
img.src = `${product.picture}`;
div.appendChild(img);
if (enableClass) {
var childDiv = document.createElement('div');
childDiv.innerHTML += product.details;
div.appendChild(childDiv);

};

return div;

}

function renderUI() {
document.body.innerHTML = ''; 
var div = document.createElement('div');
div.style = 'display: flex;justify-content: space-between;padding: 10px;';
div.appendChild( ProductDetails( testNowInstance.getValue() , setTestNow ));
div.appendChild( Products( Data, setTestNow ));

document.body.appendChild(div);

}
renderUI(); 
}

imageSelec( )
