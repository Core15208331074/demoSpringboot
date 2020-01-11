<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <script src="../static/js/personnel.js"></script>
    <script src="../static/plugins/echarts/echarts.min.js"></script>
    <title>人员</title>
</head>
<body>
<div>
    <#list list as perssonnel>
        ${perssonnel.name}+${perssonnel.id}&nbsp;&nbsp;&nbsp;&nbsp;
    </#list>
</div>
<div id="index01" style="width: 40%;height: 550px;text-align: center;margin-left: 30%;margin-top: 2%;"></div>
</body>
</html>