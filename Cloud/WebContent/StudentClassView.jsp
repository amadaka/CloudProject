<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1"/>
<title>Student Home Page</title>
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
      <div class="centered"><h1>Welcome ${loginU.first_name} ${loginU.last_name}</h1>
       <p>You Have Logged in as an Student</p>
        </div>
</div>
   </div>
   <div class="body">
       <div class="sidenav">
   <a href="courseController?action=studentcurrlist">Your Current Courses</a>
  <a href="courseController?action=studentpastlist">Your Past Courses</a>
  <a href="courseController?action=studentupcominglist">Your Upcoming Courses</a>
  <a href="courseController?action=studentallupcominglist">Upcoming Courses</a>
</div>
<div class="mission602">
      <h1>Class <span><i>Details</i></span></h1>
          <table class="center">
            <tr>
              <td><h3>Class <span>Name:</span></h3></td>
              <td class="l">
                <p>${courSP.classname}</p>
              </td>
            </tr>
            <tr>
              <td><h3>Specialization:</h3></td>
              <td class="l">
                <p>${courSP.specialization}</p>
              </td>
            </tr>
            <tr>
              <td><h3>Pre-requisites:</h3></td>
              <td class="l">
                <p>${courSP.pre}</p>
              </td>
            </tr>
            <tr>
              <td><h3>Start <span>Date:</span></h3></td>
              <td class="l">
                <p>${courSP.sdate}</p>
              </td>
            </tr>
            <tr>
              <td><h3>End <span>Date:</span></h3></td>
              <td class="l">
                <p>${courSP.edate}</p>
              </td>
            </tr>
            <tr>
              <td><h3>Class <span>Instructor:</span></h3></td>
              <td class="l">
                <p>${teacherSP.first_name} ${teacherSP.last_name}</p>
              </td>
            </tr>
          </table>
      </div>
  </div>
  <div class="mission60004">
  <h2>Lecture</h2>
     <table class="center">
       <tr>
         <th>Lecture Name</th>
         <th>Posted Date</th>
         <th>Link</th>
       </tr>
        <c:forEach items="${lecturelistC}" var="item" varStatus="status">
       <tr>
       <td>${item.name}</td>
       <td>${item.date}</td>
       <td><a href="${item.link}">View Lecture</a></td>
       </tr>
       </c:forEach>
       </table>
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
    <h2>Escríbenos, te invitamos a brindar lo mejor de ti para el bien común,<span> queremos conocer acerca de tus ideas para mejorar.</span></h2>
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
<script src="js/myScript.js"></script>
</body>
</html>