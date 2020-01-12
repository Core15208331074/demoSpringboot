<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="static/plugins/layui/css/layui.css" rel="stylesheet">
    <script src="static/plugins/layui/layui.all.js"></script>
    <title>首页</title>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">

    <div class="layui-header">
        <div class="layui-logo">消防员后台管理系统</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="/cloudDemo/index">控制台</a></li>
            <li class="layui-nav-item"><a href="/cloudDemo/index">商品管理</a></li>
            <li class="layui-nav-item"><a href="/cloudDemo/index">用户</a></li>
            <li class="layui-nav-item">
                <a href="/cloudDemo/index">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="/cloudDemo/index">邮件管理</a></dd>
                    <dd><a href="/cloudDemo/index">消息管理</a></dd>
                    <dd><a href="/cloudDemo/index">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    救火大佬
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="/cloudDemo/login">退出</a></li>
        </ul>
    </div>
    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">所有商品</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">列表一</a></dd>
                        <dd><a href="javascript:;">列表二</a></dd>
                        <dd><a href="javascript:;">列表三</a></dd>
                        <dd><a href="">超链接</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">解决方案</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">列表一</a></dd>
                        <dd><a href="javascript:;">列表二</a></dd>
                        <dd><a href="">超链接</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">云市场</a></li>
                <li class="layui-nav-item"><a href="">发布商品</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <iframe src="personnel/findAllPersonnelView?from=demo" frameborder="0" id="demoAdmin"
                    style="width: 100%; height: 800px"></iframe>
        </div>
    </div>
</div>


<script>
</script>

</body>
</html>