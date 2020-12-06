<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1"/>
<title>New Event</title>
<link rel="stylesheet" href="css/ciudad.css">
</head>
<body>
	<div id ="wrapper">
   <div class="tab2">
   	<img class="logo-img" src="proyecto3/Logotipo.png" alt="logo"/>
		<ul>
            <li><a href="home.jsp">Home</a></li>/
            <li><a href="mission.jsp">Course Information</a></li>
		</ul>
		<div class="container2">
  <img class="logo" src="proyecto3/homepage-one-banner.jpg" alt="Snow">
  <div class="centered"><h1>Create <span><i>Event</i></span></h1>
  </div>
</div>
   </div>
<div class="body">
     <div class="sidenav">
  <a href="courseController?action=admincurrlist">Current Courses</a>
  <a href="courseController?action=redirectCreatePage">Create Courses</a>
  <a href="courseController?action=adminpastlist">Past Courses</a>
  <a href="courseController?action=adminupcominglist">Upcoming Courses</a>
</div>
    <div class="mission601">
      <h1>Class <span><i>Details</i></span></h1>
      	<form name="newevent" class="mission88888" action="/Cloud/courseController?editClass&id=${cour.idcreate}" method="post">
      		<table class="center">
      			<tr>
      				<td><h3>Class <span>Name:</span></h3></td>
      				<td>
      					<p>${cour.classname}</p>
      				</td>
      			</tr>
      			<tr>
      				<td><h3>Start <span>Date:</span></h3></td>
      				<td>
      					<input type="Date" name="newdate" value='${cour.sdate}' required>
      				</td>
      			</tr>
      			
      			<tr>
      				<td><h3>Class <span>Instructor:</span></h3></td>
      				<td>
      					<select class="lecting" name="teachidnew">
      				    <option value="${cour.sdate}">No Change</option>
      					<c:forEach items="${TeacherList}" var="item" varStatus="status">
      					<option value="${item.id_user}">${item.first_name} ${item.last_name}</option>
      					</c:forEach>
      					</select>
      				</td>
      			</tr>
      		</table>
      		 <br>
    
      		<input name="action" value="editClass" type="hidden">
           <input type="submit" value="editClass" name="eventnew">
      	</form>
      </div>
  </div>
 <br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<div class="footer">
<div class="container26">
  <img class="logo2565" src="proyecto3/homepage-one-banner.jpg" alt="Snow">
  <div class="centered2565">
    <h2>Escr�benos, te invitamos a brindar lo mejor de ti para el bien com�n,<span> queremos conocer acerca de tus ideas para mejorar.</span></h2>
  </div>
</div>
<div class="container2">
<div class="footer2">
	<div class="centered">
		<a href="mailto:someone@example.com"><img class="icon2" src="proyecto3/mini_email.png"></a>
		&#160;
		<a href="https://twitter.com/utarlington?s=20"><img class="icon2" src="proyecto3/mini_twiter.png"></a>
		&#160;
		<a href="https://www.instagram.com/anuraag9981/?hl=en"><img class="icon2" src="proyecto3/mini_inst.png"></a>
	</div>
  </div>
</div>
 <div class="footerim">
    <div class="footerim2">
    <p>MadakaApps &copy; 20202 All Right Reserved</p>
    <button>&and;</button>
    </div>
  </div>

</div>
</div>
<script src="myScript.js"></script>
</body>
</html>
