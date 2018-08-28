<%@page language="java" contentType="text/html; utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>首页</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script src="/js/jquery-3.3.1.min.js"></script>
    <script src="/js/popper.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/css/common.css">
    <style>
        #body {
            padding-left: 20px;
            padding-right: 20px;
            margin-top: 10px;
        }

        .category {
            margin-top: 10px;
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
    <div class="row text-center" id="headline">
        <div class="col-md-4">
            <div class="list-group">
                <li class="list-group-item list-group-item-action disabled">
                    最新
                </li>
                <a href="#" class="list-group-item list-group-item-action">Dapibus ac facilisis in</a>
                <a href="#" class="list-group-item list-group-item-action">Morbi leo risus</a>
                <a href="#" class="list-group-item list-group-item-action">Porta ac consectetur ac</a>
                <a href="#" class="list-group-item list-group-item-action ">Vestibulum at eros</a>
            </div>
        </div>
        <div class="col-md-4">
            <div class="list-group">
                <li class="list-group-item list-group-item-action disabled">
                    最热
                </li>
                <a href="#" class="list-group-item list-group-item-action">Dapibus ac facilisis in</a>
                <a href="#" class="list-group-item list-group-item-action">Morbi leo risus</a>
                <a href="#" class="list-group-item list-group-item-action">Porta ac consectetur ac</a>
                <a href="#" class="list-group-item list-group-item-action ">Vestibulum at eros</a>
            </div>
        </div>
        <div class="col-md-4">
            <div class="list-group">
                <li class="list-group-item list-group-item-action disabled">
                    评论最多
                </li>
                <a href="#" class="list-group-item list-group-item-action">Dapibus ac facilisis in</a>
                <a href="#" class="list-group-item list-group-item-action">Morbi leo risus</a>
                <a href="#" class="list-group-item list-group-item-action">Porta ac consectetur ac</a>
                <a href="#" class="list-group-item list-group-item-action ">Vestibulum at eros</a>
            </div>
        </div>
    </div>
</div>
<div class="container-fluid" id="body">
    <div class="category">
        <c:forEach items="${father}" var="f_category">
            <div class="row">
                <h3>${f_category.fName}</h3>
            </div>
            <c:set value="child${f_category.fId}" var="child"/>
            <div class="row">
                <c:forEach items="${requestScope.get(child)}" var="c_category">
                    <div class="col-md-4">
                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title">${c_category.cName}</h5>
                                <p class="card-text">${c_category.cDesc}</p>
                                <a href="/platelist?cateId=${c_category.cId}" class="btn btn-primary">进入</a>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </c:forEach>
    </div>
</div>
<div id="foot"></div>
</body>
</html>