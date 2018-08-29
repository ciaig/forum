<%@page language="java" contentType="text/html; utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>用户中心</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <script src="../js/jquery-3.3.1.min.js"></script>
    <script src="../js/popper.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../css/common.css">
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
    <div class="card-deck" style="margin-left: 20px;margin-right: 20px;margin-top: 20px">
        <c:forEach items="${users}" var="user" varStatus="count">
            <div class="card col-md-3" style="width: 18rem;">
                <img class="card-img-top" src="/resources/headimg/${user.headImg}" width="80px" height="200px" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">${user.uName}</h5>
                    <p class="card-text">${user.uDesc}</p>
                    <a href="/otherinfo?userId=${user.uId}" class="btn btn-primary">他的空间</a>
                </div>
            </div>
            <c:if test="${count.count%4 eq 0}">
                </div>
                <div class="card-deck" style="margin-left: 20px;margin-right: 20px;margin-top: 20px">
            </c:if>
        </c:forEach>
    </div>
</div>
<div id="foot"></div>
</body>
</html>