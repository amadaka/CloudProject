
function loginfun(){
document.getElementById('id01').style.display='block';
}
function logclose(){
	document.getElementById('id01').style.display='none';
}
function topFunction() {
  document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
}
function validatecForm() {
  var x = document.forms["cform"]["name"].value.length;
  var y = document.forms["cform"]["message"].value.length;
  var inputText=document.forms["cform"]["email"].value;
  var a = document.forms["cform"]["email"].value.length;
  var b = document.forms["cform"]["subject"].value.length;
  if (x >= 20) {
    alert("Name should be less then 20 characters. Currently you have "+x);
    return false;
  }
  if (y >= 500) {
    alert("Message should be less then 500 characters. Currently you have "+y);
    return false;
  }
  if (a >= 100) {
    alert("email should be less then 100 characters. Currently you have "+a);
    return false;
  }
  if (b >= 20) {
    alert("subject should be less then 20 characters. Currently you have "+b);
    return false;
  }
var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
if(inputText.match(mailformat))
{
return true;
}
else
{
alert("You have entered an invalid email address!");
return false;
}
}
function validaterForm() {
  var inputText=document.forms["rform"]["mail"].value;
  var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
  if(!(inputText.match(mailformat))){
    alert("You have entered an invalid email address!");
    return false;
  }
  var x = document.forms["rform"]["name"].value.length;
  var y = inputText.length;
  var a = document.forms["rform"]["psw"].value;
  var la=a.length;
  var b = document.forms["rform"]["rpsw"].value;
  var n = document.forms["rform"]["nation"].value.length;
  var p = document.forms["rform"]["phone"].value;
  var phoneno = /^\d{10}$/;
  if(!(p.match(phoneno))){
    alert("You have entered an invalid phone address!");
    return false;
  }
  if (x >= 50) {
    alert("Name should be less then 50 characters. Currently you have "+x);
    return false;
  }
  if (y >= 50) {
    alert("Mail should be less then 50 characters. Currently you have "+y);
    return false;
  }
  if (la < 8) {
    alert("Password should be more then 8 characters. Currently you have "+la);
    return false;
  }
  if (a != b) {
    alert("Passwords do not match.");
    return false;
  }
  if (la >= 11) {
    alert("Password should be less then 11 characters. Currently you have "+la);
    return false;
  }
  if (n >= 20) {
    alert("Country should be less then 20 characters. Currently you have "+n);
    return false;
  }

}
function validateremail(){
  var inputText=document.forms["eform"]["email"].value;
  var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
  if(!(inputText.match(mailformat))){
    alert("You have entered an invalid email address!");
    return false; 
}
}
function validatenForm(){
  var y = document.forms["newevent"]["dis"].value.length;
  var x = document.forms["newevent"]["ename"].value.length;
  var l = document.forms["newevent"]["location"].value.length;
  if (y >= 500) {
    alert("Message should be less then 500 characters. Currently you have "+y);
    return false;
  }
  if (x >= 25) {
    alert("Name should be less then 25 characters. Currently you have "+x);
    return false;
  }
  if (l >= 25) {
    alert("Email should be less then 25 characters. Currently you have "+l);
    return false;
  }
}
function validateenForm(){
    var l = document.forms["editevent"]["location"].value.length;
    if (l >= 25) {
    alert("Email should be less then 25 characters. Currently you have "+l);
    return false;
  }
}
function vali(){
  var inputText=document.forms["elog"]["uname"].value;
  var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
  if(!(inputText.match(mailformat))){
    alert("You have entered an invalid email address!");
    return false; 
}
}