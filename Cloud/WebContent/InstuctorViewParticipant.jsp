<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1"/>
<title>Instructor Class list </title>
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
       <p>You Have Logged in as an Instructor</p>
        </div>
</div>
   </div>
   <div class="body">
       <div class="sidenav">
  <a href="InstructorCurClass.jsp">Your Current Courses</a>
  <a href="InstructorPastCourse.jsp">Your Past Courses</a>
  <a href="InstructorUpcomingCourse.jsp">Your Upcoming Courses</a>
</div>
    <div class="mission60004">
      <h2>List of Courses you are currently Teaching</h2>
     <table class="center">
       <tr>
         <th>Student ID</th>
         <th>Student First Name</th>
         <th>Student Last Name</th>
         <th>Current Grade</th>
         <th>Action</th>
       </tr>
<!--       <c:forEach items="${CUR_EVENTS}" var="event" varStatus="status">
       <tr>
           <td><a href="detail.php?id='.$row['idevent'].'">'.$row['idevent'].'</a></td>
           <td>'.$row['ename'].'</td>
           <td>'.$row['edate'].'</td>
           <td>'.$row['etime'].'</td>
           <td><a onclick="return confirm(\'Are you sure?\')" href="home2.php?idjoin='.$row['idevent'].'">Join</a></td>
           </tr></c:forEach>-->
     </table>
   </div>
   <br><br>
     <div class="holder">
    <form action="home2.php" method="post">
    <button class="w4"  name="logout" type="submit">Log-Out</button>
    </form>
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
</div>
</body>
</html>