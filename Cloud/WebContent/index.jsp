<!DOCTYPE html>
<html>
<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1"/>
<head>
    <title>Home Page</title>
    <link rel="stylesheet" href="css/ciudad.css">
</head>
<body>
<div id ="wrapper">
    <div class="tab2">
        <img class="logo-img" src="proyecto3/Logotipo.png" alt="logo"/>
        <ul>
            <li><a class="active" href="/home.jsp">Home</a></li>/
            <li><a href="mission.jsp">Course Information</a></li>
            <li><a href="#" onclick="loginfun()">Login</a></li>
        </ul>

        <div class="container2">
            <img class="logo4" src="proyecto3/homepage-one-banner.jpg" alt="Snow"/>
            <img class="logo5" src="proyecto3/objects.png"/>
            <div class="text-block"><h1><span>Maverick</span></h1><h1>Online Courses</h1>
                <p>A Maverick course is an online course aimed at unlimited participation and open access via the web. In addition to traditional course materials, such as filmed lectures, readings, and problem sets, many MOOCs provide interactive courses with user forums or social media discussions to support community interactions among students, professors, and teaching assistants, as well as immediate feedback to quick quizzes and assignments.</p>
            </div>
        </div>
    </div>
    <div id="id01" class="modal">

        <form name="elog" class="modal-content" action="/Cloud/userController?login" method="post">
            <div class="imgcontainer">
                <span onclick="logclose()" class="close" title="Close Modal">&times;</span>
            </div>
            <h1>Login <span>Session</span></h1>
            <br>
            <br>
            <div class="error">${logerror}</div>
           
            <hr>

            <div id ="wrapper">
                <label for="uname">User Name</label>
                <input type="text" placeholder="User Name" name="uname" required>

                <label for="psw">Password</label>
                <input type="password" placeholder="password" name="psw" required>
                <br>
                <br>
                <br>
                <hr>
                <br>
                <br>
                <br>
                <input name="action" value="login" type="hidden">   
               <button type="submit">Submit</button>
            </div>
        </form>
    </div>
    <br>
    <br>
    <br>
    <br>
    <div class="body">
        <div class="objective">
            <h1>OBJECTIVES</h1>
            <p>MOC is an online course with the option of free and open registration, a publicly-shared curriculum, and open-ended outcomes. MOOCs integrate social networking, accessible online resources, and are facilitated by leading practitioners in the field of study. Most significantly, MOC build on the engagement of learners who self-organize their participation according to learning goals, prior knowledge and skills, and common interests.</p>
        </div>
        <br><br><br><br>
        <h2>Top <span>Courses</span></h2>
        <div class="mission2">
            <table class="center">
                <tr>
                    <td>
                        <h2><u>Au</u>tomationTesting</h2>
                        <p><b>Many companies have begun to invest in automation to fill the gaps rather than the traditional testing. It is taught by renowed instructor robb</b></p>
                    </td>
                    <td>
                        <h2><u>Ar</u>tificial Intelligence</h2>
                        <p><b>Artificial intelligence (AI), is intelligence demonstrated by machines, unlike the natural intelligence displayed by humans and animals.</b></p>
                    </td>
                    <td>
                        <h2><u>Da</u>tabases</h2>

                        <p><b>
                                The database management system (DBMS) is the software that interacts with end users, applications, and the database itself to capture and analyze the data.

                            </b></p>
                    </td>
                </tr>
                <tr>
                    <td>
                        <h2><u>Ma</u>chine Learning</h2>
                        <p><b>Machine learning (ML) is the study of computer algorithms that improve automatically through experience.</b></p>
                    </td>
                    <td>
                        <h2><u>Da</u>ta Mining</h2>
                        <p><b>
                                Data mining is a process used by companies to turn raw data into useful information. It is useful in  helping data extraction and mining.

                            </b></p>
                    </td>
                    <td>
                        <h2><u>Clo</u>ud Computing</h2>
                        <p><b>
                                Cloud computing is the on-demand availability of computer system resources, especially data storage cloud storage nd computing power, without direct active management by the user.

                            </b></p>
                    </td>
                </tr>

            </table>

        </div>
        <br><br><br><br>
        <div class="second">
            <table>
                <tr>
                    <td id="third">
                        <br><br><br>
                        <table id="center">
                            <tr>
                                <td><figure>
                                        <img class="image "src="proyecto3/mic.png"><figcaption>18 FOROS</figcaption>
                                    </figure></td>
                                <td><figure>
                                        <img class="image "src="proyecto3/parti.png"><figcaption>50+ PASTICIPENTS</figcaption>
                                    </figure></td>
                            </tr>
                            <tr>
                                <td><figure>
                                        <img class="image "src="proyecto3/book.png"><figcaption>30 Course</figcaption>
                                    </figure></td>
                                <td><figure>
                                        <img class="image "src="proyecto3/event.png"><figcaption>3 Days Per Week</figcaption>
                                    </figure></td>
                            </tr>
                        </table>
                    </td>
                    <td id="nine">
                        <div class="t23ext-blo">
                            <h1>Register <span>Here</span></h1>
                            <div class="error">${errorMsgs}</div>
                            
                            <form name="rform" class="m23odal-cont" action="/Cloud/userController?registerUser" method="post">
                                <input type="text" placeholder="Email" name="Email" required>
                                <input type="text" placeholder="Username" name="uname" required>

                                <input type="password" placeholder="Password" name="psw" required>
                                <input type="password" placeholder="Confirm Password" name="rpsw" required>

                                <input type="text" placeholder="First Name" name="fname" required>
                                <input type="text" placeholder="Last Name" name="lname" required>

                                <input type="text" placeholder="Phone" name="phone" required>
                                <input type="text" placeholder="Organization" name="Organization" required>
                                <br> <br>
                                <input name="action" value="registerUser" type="hidden">
                                <input type="submit" value="Submit">                         
                            </form>
                        </div>
                    </td>
                </tr>
            </table>
        </div>


        <div class="mission9">
            <br>
            <br>
            <br>
            <h2>Our <span><i>Partners</i></span></h2>
            <table class="center2">
                <tr>
                    <td>
                        <img class="soc104" src="proyecto3/i.jpg">
                    </td>
                    <td>
                        <img class="soc103" src="proyecto3/image3.jpg">
                    </td>
                </tr>
            </table>
            <br><br><br>
        </div>
        <div class="mission10">
            <h1>Upcoming <span><i>Events</i></span></h1>
            <p>Learn programming languages and concepts to prepare for a career in hardware or software development.</p>
            <table class="center">
                <tr>
                    <td>
                        <table class="boxing">
                            <tr>
                                <td>
                                    <div class="container2">
                                        <img class="soc201" src="proyecto3/image1.jpg">
                                        <div class="bottom-left">
                                            <h1>23</h1>
                                            <p>Nov</p>
                                        </div>
                                    </div>
                                    <p>Online Seminar</p>
                                    <hr>
                                    <p><img class="soc502" src="proyecto3/admin.png"> Admin&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <img class="soc501" src="../proyecto3/heart.png"> 350&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <img class="soc501" src="../proyecto3/com.png"> 30</p>
                                </td>
                            </tr>
                        </table>
                    </td>
                    <td>
                        <table class="boxing">
                            <tr>
                                <td>
                                    <div class="container2">
                                        <img class="soc201" src="proyecto3/image2.png">
                                        <div class="bottom-left">
                                            <h1>23</h1>
                                            <p>Nov</p>
                                        </div>
                                    </div>
                                    <p>Course Information Seminar</p>
                                    <hr>
                                    <p><img class="soc502" src="proyecto3/admin.png"> Admin&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <img class="soc501" src="../proyecto3/heart.png"> 350&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <img class="soc501" src="../proyecto3/com.png"> 30</p>
                                </td>
                            </tr>

                        </table>
                    </td>
                    <td>
                        <table class="boxing">
                            <tr>
                                <td>
                                    <div class="container2">
                                        <img class="soc201" src="proyecto3/i.jpg">
                                        <div class="bottom-left">
                                            <h1>13</h1>
                                            <p>Nov</p>
                                        </div>
                                    </div>
                                    <p>Interaction session with professor</p>
                                    <hr>
                                    <p><img class="soc502" src="proyecto3/admin.png"> Admin&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <img class="soc501" src="../proyecto3/heart.png"> 350&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <img class="soc501" src="../proyecto3/com.png"> 30</p>
                                </td>
                            </tr>
                        </table>

                    </td>
                </tr>
            </table>
        </div>
        <br><br><br>
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
    <div class="footer">
        <div class="container3">
            <img class="logo2" src="proyecto3/homepage-one-banner.jpg">
            <div class="centered2">
                <h2> Contact <span><i>Us</i></span></h2>
            </div>
            <div class="bottom-right">
                <form name="eform" action="home2.php" method="post" onsubmit="return validateremail()"><input type="text" id="email" name="email" placeholder="email" required>
                    <input type="submit" name="econtact" value="Submit">
                </form>
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
                <p>MadakaApps &copy; 2020 All Right Reserved</p>
                <button onclick="topFunction()">&and;</button>
            </div>
        </div>

    </div>
</div>
<script src="js/myScript.js"></script>
</body>
</html>
