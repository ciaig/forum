<%@page language="java" contentType="text/html; utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>帖子</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script src="/js/jquery-3.3.1.min.js"></script>
    <script src="/js/popper.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/css/common.css">
    <style type="text/css">
        body{
        }
        .card{
            margin-left: 10px;
        }
        #content{
            display: inline-block;
            position: absolute;
            margin-left: 20px;
            width: 75%;
        }
        #detial{
            background-color: white;
            border-radius: 2px;
            padding: 5px;
            width: 100%;
        }
        #comment{
            margin-top: 20px;
            background-color: white;
            border-radius: 2px;
            width: 100%;
        }
        #user{
            position: relative;
            left: 2px;
            display: inline-block;
        }
        #foot{
            position: relative;
        }
        form{
            margin-top: 30px;
        }
    </style>
    <script type="application/javascript">
        $(function () {
            $("#head").load("common/nav.jsp");
        })
    </script>
</head>
<body>
<div id="head"></div>
<nav aria-label="breadcrumb">
    <ol class="breadcrumb">
        <li class="breadcrumb-item"><a href="/platelist?cateId=${plate.cId}">上一层</a></li>
        <li class="breadcrumb-item active" aria-current="page">${plate.pTitle}</li>
    </ol>
</nav>
<div class="container-fluid">
    <div id="user">
        <div class="card" style="width: 18rem;">
            <img class="card-img-top" src="/resources/headimg/${postuser.headImg}" width="80px" height="200px" alt="Card image cap">
            <div class="card-body">
                <h5 class="card-title">${postuser.uName}</h5>
                <p class="card-text">${postuser.uDesc}</p>
                <a href="otherinfo.html" class="btn btn-primary">他的空间</a>
                <a href="#" class="btn btn-primary">关注</a>
            </div>
        </div>
    </div>
    <div id="content">
        <div  id="detial" >
            <h1 style="display: inline-block">${plate.pTitle}</h1>
            <button type="button" class="btn btn-success" style="float: right">收藏</button>
            <p>
                ${detial.dContent}
            </p>
        </div>
        <div id="comment">
            <ul class="list-group">
                <li class="list-group-item"><h3>评论列表</h3></li>
                <c:forEach items="${discussinfos}" var="discussinfo">
                    <li class="list-group-item"><h5>${discussinfo.user.uName} :  </h5>${discussinfo.discuss.cContent}<small style="float: right">${discussinfo.discuss.postTime}</small></li>
                </c:forEach>
            </ul>
        </div>
        <form action="/postdiscuss">
            <div class="form-group">
                <label for="exampleFormControlTextarea1">发表评论</label>
                <textarea name="cContent" class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                <input type="hidden" name="uId" value="${isLogin.uId}">
                <input type="hidden" name="pId" value="${plate.pId}">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</div>
</body>
</html>