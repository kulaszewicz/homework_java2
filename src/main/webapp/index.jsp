<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1" %>



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
        <div class="col span-1-of-2 box">
            <h3 class="h3">Sign in</h3>
            <ul class="form-nav">
                <form action="Login" method="get" id="formLogin">
                    <label>Username:<input type="text" id="lLoing" name="llogin"/></label>
                    <label>Password:<input type="password" id="lPassword" name="lpassword"/></label>
                    <button name="LOG" value="LOG" class="btn log-btn">LOGIN</button>
                </form>
            </ul>
        </div>
        <div class="col span-1-of-2 box">
            <div class="second-box">
                <h3 class="h3">Sign Up</h3>
                <ul class="form-nav">
                    <form action="Register" method="get" id="myRegister">
                        <label>Username:<input type="text" id="rLogin" name="login"/></label>
                        <label>Password:<input type="password" id="rPassword" name="password"/></label>
                        <label>Confirm Password:<input type="password" id="rPasswordAgain" name="confPassword"/></label>
                        <label>E-mail:<input type="email" id="rMail" name="e-mail"/></label>
                        <button name="REG" value="REG" class="btn reg-btn">REGISTER</button>
                    </form>
                </ul>
            </div>
            <div class="git">
                <button name="GIT" value="GIT" class="btn git-btn" onclick="window.location.href='https://github.com/kulaszewicz/java_homework'">GIT<i class="fab fa-github"></i></button>
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