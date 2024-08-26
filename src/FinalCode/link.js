function link() {
var div = document.createElement('div');
div.style = 'display: flex;justify-content: space-between;';
var link = document.createElement('a');
link.href = "../imageSelec/imageSelec.html"
link.target = "_blank";
link.innerHTML += "Go to the imageSelec page";
div.appendChild(link);
var link = document.createElement('a');
link.href = "../singleImage/singleImage.html"
link.target = "_blank";
link.innerHTML += "Go to the SingleImage page";
div.appendChild(link);

document.body.appendChild(div);

}

link( )
