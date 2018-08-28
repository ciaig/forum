<%@page language="java" pageEncoding="UTF-8" contentType="text/html; utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>信息</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script src="/js/jquery-3.3.1.min.js"></script>
    <script src="/js/popper.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/css/common.css">
    <style type="text/css">
        #info{
            text-align: center;
        }
    </style>
    <script type="application/javascript">
        $(function () {
            $("#head").load("common/nav.jsp");
            $("#foot").load("common/foot.html");
        })
    </script>
</head>
<body>
<div id="head"></div>
<div class="container-fluid">
    <div class="jumbotron jumbotron-fluid" id="info">
        <div class="container">
            <h1 class="display-4">info</h1>
            <p class="lead">${infoMsg}</p>
            <p class="lead">
                <a class="btn btn-primary btn-lg" href="index" role="button">返回主页</a>
            </p>
        </div>
    </div>
</div>
<div id="foot"></div>
</body>
</html>