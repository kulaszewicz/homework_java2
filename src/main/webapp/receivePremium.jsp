<%@ page import="com.classes.User" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //SEND VARS
    User curUser = (User) session.getAttribute("curUser");
    if (curUser == null) response.sendRedirect("index.jsp");
    List<User> premUsers = (List<User>) session.getAttribute("premUsers");

%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="en">
<head>
    <!--- CSS LINKS -->

    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/animate.css">
    <!--- FONTS -->
    <link href='http://fonts.googleapis.com/css?family=Modern+Antiqua&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Membership</title>
</head>
<body>
<header>
    <h1>Java Homework #2</h1>
    <h2>Registration, login and premium users</h2>
</header>
<section class="section-exe">

    <div class="row">
        <h4> WELCOME <%=curUser.login%></h4>
        <div class="col span-1-of-2 box">
            <ul class="form-nav info">
                <h5>ALL PREMIUM USERS:</h5>
                <%  for(User u : premUsers) {
                %><label>username: <%=u.login%></label>
                <%
                }
                %>

            </ul>
        </div>
        <div class="col span-1-of-2 box">
            <div class="second-box">
                <div class="userImg">
                    <img src="resources/user.png" class="userImg Img" alt="userIamge">
                </div>
                <form action="Logout">
                    <input type="submit" value="LOGOUT" class="btn btn-out">
                </form>
            </div>
            <div class="git">
                <button name="GIT" value="GIT" class="btn git-btn" onclick="window.location.href='https://github.com/kulaszewicz/homework_java2'">GIT<i class="fab fa-github"></i></button>
            </div>
        </div>

    </div>

</section>
<footer>
    <div class="row">
        <p>
            Copyright &copy; 2018 by Jakub Kulaszewicz. All rights reserved.
        </p>
    </div>
</footer>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="http://crimson-mind.tk/homework/src/main/webapp/js/script.js"></script>
</html>
