<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="static/css/login/login.css" rel="stylesheet"/>
    <script src="static/plugins/jQuery/jQuery.js" rel="stylesheet"></script>
    <title>登录</title>
</head>
<body>
<div class="layui-container layui-fluid out-side">
    <div class="layui-row back-ground-img-cls">
        <img src="static/pictures/MaSang.jpg" style="width: 100.5%;height: 100%">
    </div>
    <div class="layui-row login-cls second-div">
        <div class="layui-col-lg-offset12 layui-col-md-offset12 layui-col-sm-offset12">
            <a id="iAmA" href="/cloudDemo/index">come to join us !</a>
        </div>
        <div class="layui-col-lg-offset12 layui-col-md-offset12 layui-col-sm-offset12">
            <a onclick="alertSomething()" href="#">
                if you get some questions, click me !
            </a>
        </div>
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