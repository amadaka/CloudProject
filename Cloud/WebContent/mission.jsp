<!DOCTYPE html>
<html lang="sp">
<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1"/>
<head>
    <title>Mission Page</title>
    <link rel="stylesheet" href="css/ciudad.css">
</head>
<body>
<div id ="wrapper">
    <div class="tab2">
        <img class="logo-img" src="proyecto3/Logotipo.png" alt="logo"/>
        <ul>
            <li><a href="home.jsp">Home</a></li>/
            <li><a class="active"href="mission.jsp">Course Information</a></li>/
            <li><a  href="contactus.jsp">Contact us</a></li>/
            <li><a href="#" onclick="document.getElementById('id01').style.display='block'">Login</a></li>
        </ul>

        <div class="container2">
            <img class="logo" src="proyecto3/homepage-one-banner.jpg" alt="Snow">
            <div class="centered"><h1>General Information</h1>

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

                <label for="psw">password</label>
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
    <div class="body">
        <div class="mission">
            <table class="center">
                <tr>
                    <td>
                        <table class="center">
                            <tr>
                                <td>
                                    <h2>
                                        <u>Co</u>mputer Science
                                    </h2>
                                    <p>
                                        Computer science is the study of algorithmic processes and computational machines.As a discipline, computer science spans a range of topics from theoretical studies of algorithms, computation and information to the practical issues of implementing computing systems in hardware and software. Computer science addresses any computational problems, especially information processes, such as control, communication, perception, learning, and intelligence.


                                    </p>
                                </td>
                            </tr>
                        </table>
                    </td>
                    <td>
                        <table class="center">
                            <tr>
                                <td>
                                    <h2>
                                        <u>El</u>ectronic Engineering
                                    </h2>
                                    <p>

                                        Electronic engineering (also called electronics and communications engineering) is an electrical engineering discipline which utilizes nonlinear and active electrical components (such as semiconductor devices, especially transistors and diodes) to design electronic circuits, devices, integrated circuits and their systems. The discipline typically also designs passive electrical components, usually based on printed circuit boards.


                                    </p>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
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
        <div class="mission2">
            <table class="center">
                <tr>
                    <td>
                        <table class="boxing">
                            <tr>
                                <td>
                                    <p>
                                        Maverick Online is an invaluable resource that helped me pass technical screens with Amazon, Affirm, and Compass. I recommend using it to train your technical intuition and understanding.
                                        Maverick Online  is an invaluable resource that helped me pass technical screens with Amazon, Affirm, and Compass. I recommend using it to train your technical intuition and understanding.

                                    </p>
                                </td>
                            </tr>
                        </table>
                        <p>Mukesh</p>
                    </td>
                    <td>
                        <table class="boxing">
                            <tr>
                                <td>
                                    <p>
                                        Thank you all for your efforts! I got an offer from Google and your videos were the best resource in my preparation. Especially love how you first state your initial thoughts even though it might lead to an inefficient solution and then improve from there!
                                    </p>
                                </td>
                            </tr>

                        </table>
                        <p>Rohith</p>
                    </td>
                    <td>
                        <table class="boxing">
                            <tr>
                                <td>
                                    <p>
                                        I want to thank you all for your effort in making your platform and delivering great content! I used your platform while studying for interviews and it was my go to resource for learning new algorithms. I ended up accepting an offer in the Bay Area which has been a dream of mine since high school! I can’t thank you enough for your work and maybe once covid is over and if your still in the bay, we can get drinks on me or coffee if you don’t drink! Thanks again!</p>
                                </td>
                            </tr>
                        </table>
                        <p>Abhishek</p>
                    </td>
                </tr>

            </table>
        </div>

        <br>
        <br>
        <h2>Top<span> Courses</span></h2>
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
    <div class="footer">
        <div class="container3">
            <img class="logo2" src="proyecto3/homepage-one-banner.jpg">
            <div class="centered2">
                <h2> Contact Us</h2>
            </div>
            <div class="bottom-right">
                <form name="eform" action="home2.php" method="post" onsubmit="return validateremail()"><input type="text" id="email" name="email" placeholder="email" required>
                    <input type="submit" name="econtact" value="submit">
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
