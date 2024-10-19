var newPara = document.createElement("p");
var content = document.createTextNode("This is new Paragraph");
newPara.appendChild(content); 

var divElement = document.getElementById('thediv');
divElement.appendChild(newPara);

function remv(element){
    element.parentNode.removeChild(element);
}