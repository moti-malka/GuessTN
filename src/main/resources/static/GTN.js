var _userName;
var _pass;


function signInBtn(){


    _userName =  document.getElementById("name").value;
    _pass = document.getElementById("pass").value;

   var xhttp = new XMLHttpRequest();
   xhttp.onreadystatechange = function() {
       if (this.readyState == 4 && this.status == 200) {
           console.log(this.responseText);
           Game(this.responseText)
           hideElement("loginforom");
           hideElement("loginbtn");
           showElement("namePlayer");


       }
   };
   xhttp.open("GET", "http://localhost:8080/start/login?name="+_userName+"&password="+_pass, true);
   xhttp.send();

}


function hideElement(id) {

    var elemnt = document.getElementById(id);
    elemnt.parentNode.removeChild(elemnt);


}

function showElement(id) {

    document.getElementById(id).style.visibility = "visible";
}

function Game(name) {
    var paragraphname = document.getElementById("namePlayer");
    var pName = document.createTextNode(name);
    paragraphname.appendChild(pName);
    showElement("tableGame");
    showElement("startNewGameBtn");
    showElement("guess");
    showElement("guessBtn");
    
    
    //name+=playreObject;

}


function StartNewgame(){    

}

