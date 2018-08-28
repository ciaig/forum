<%@page language="java" contentType="text/html; utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>发帖</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script src="/js/jquery-3.3.1.min.js"></script>
    <script src="/js/popper.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/css/common.css">
    <style type="text/css">
        #postdetial{
            margin-top: 20px;
            padding: 20px;
            border-radius: 5px;
            background-color: white;
            width: 70%;
        }
        .form-control{
            margin-bottom: 10px;
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
    <div class="container-fluid" id="postdetial">
        <form method="post" action="/postplate">
            <div class="form-group">
                <label for="title">标题</label>
                <input name="pTitle" type="text" class="form-control" id="title"  placeholder="输入标题">
            </div>
            <div class="form-group">
                <label for="desc">描述</label>
                <input name="pDesc" type="text" class="form-control" id="desc" placeholder="输入描述" aria-describedby="deschelp">
                <small id="deschelp" class="form-text text-muted">输入主题的描述信息</small>
            </div>
            <label for="category">选择分类</label>
            <select name="cId" class="form-control" id="category">
                <c:forEach items="${categorylist}" var="categoey">
                    <option value="${categoey.cId}">${categoey.cName}</option>
                </c:forEach>
            </select>
            <div class="form-group">
                <label for="exampleFormControlTextarea1">帖子内容</label>
                <textarea name="content" class="form-control" id="exampleFormControlTextarea1" rows="5"></textarea>
            </div>
            <input type="hidden" value="${isLogin.uId}" name="userId">
            <button type="submit" class="btn btn-primary">提交</button>
        </form>
    </div>
<div id="foot"></div>
</body>
</html>