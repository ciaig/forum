<%@page language="java" contentType="text/html; utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>用户中心</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script src="/js/jquery-3.3.1.min.js"></script>
    <script src="/js/popper.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/css/common.css">
    <style type="text/css">
        #user{
            position: relative;
            top: 5px;
            left: 5px;
            display: inline-block;
        }
        #content{
            display: inline-block;
            position: absolute;
            margin-top: 5px;
            margin-left: 20px;
            width: 75%;
        }
        span{
            float: right;
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
    <div id="user">
        <div class="card" style="width: 18rem;">
            <img class="card-img-top" src="/resources/headimg/${user.headImg}" width="80px" height="200px" alt="Card image cap">
            <div class="card-body">
                <h5 class="card-title">${user.uName}</h5>
                <p class="card-text">${user.uDesc}</p>
                <a href="/follow?userId=${postuser.uId}&loginId=${isLogin.uId}" class="btn btn-primary">关注他</a>
            </div>
        </div>
    </div>
    <div id="content">
        <div>
            <ul class="list-group" id="favorite">
                <a href="#" class="list-group-item">收藏夹 <span class="badge badge-secondary">12</span></a>
                <a href="/followlist?userId=${user.uId}" class="list-group-item">关注的人<span class="badge badge-secondary">13</span></a>
                <a href="#" class="list-group-item">评论的帖子<span class="badge badge-secondary">1</span></a>
            </ul>
        </div>
        <div id="detial" style="margin-top: 5px">
            <ul class="list-group">
                <li class="list-group-item disabled">他的帖子</li>
                <c:forEach items="${platelist}" var="plate">
                    <a href="/detial?detialId=${plate.pId}" class="list-group-item">${plate.pTitle}</a>
                </c:forEach>
            </ul>
        </div>
    </div>
</div>
<div id="foot"></div>
</body>
</html>