var _userName;
var _pass;


function signInBtn(){


    _userName =  document.getElementById("name").value;
    _pass = document.getElementById("pass").value;
    var xhttp = new XMLHttpRequest();
    xhttp.open("GET", "http://localhost:8080/start/login?name="+_userName+"&password="+_pass, true);
    xhttp.setRequestHeader("Content-type", "application/json");
    xhttp.send();
    var response = JSON.parse(xhttp.responseText);
    hideElement("loginforom");
    hideElement("loginbtn");
    alert(response);

}


function hideElement(id) {

    document.getElementById(id).style.visibility = "hidden";


}


