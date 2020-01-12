<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="static/css/login/login.css" rel="stylesheet"/>
    <script src="static/plugins/jQuery/jQuery.js" rel="stylesheet"></script>
    <title>登录</title>
</head>
<body>
<div class="outside">
    <div class="back-ground-img-cls">
        <img src="static/pictures/NewYork.jpg" style="width: 100%;height: 100%">
    </div>
    <div class="login-cls">
        <a id="iAmA" href="/cloudDemo/index">come to join us !</a>
        </br>
        <a onclick="alertSomething()" href="#">
            if you get some questions, click me !
        </a>
        <input type="hidden" id="hiddenInput" value="You fucking fool! You think I am going to help you when You click me? fuck you man !">
    </div>
</div>
</body>
<script>
    function alertSomething() {

        alert($("#hiddenInput").val());
    }
</script>
</html>