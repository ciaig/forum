<%@page language="java" contentType="text/html; utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>板块</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script src="/js/jquery-3.3.1.min.js"></script>
    <script src="/js/popper.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/css/common.css">
    <style type="text/css">
        #content{
            margin-top: 5px;
            margin-left: 5px;
            margin-right: 5px;
            margin-bottom: 10px;
        }
        #headline{
            margin-top: 0px;
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
<nav aria-label="breadcrumb">
    <ol class="breadcrumb" style="display: inline-block">
        <li class="breadcrumb-item active" aria-current="page">版块</li>
    </ol>
    <a href="/postdetial" type="button" class="btn btn-secondary" style="float: right">我要发帖</a>
</nav>
<div class="container-fluid">
    <div class="row text-center" id="headline">
        <div class="col-md-4">
            <div class="list-group">
                <li class="list-group-item list-group-item-action disabled">
                    本版最新
                </li>
                <a href="detial.jsp" class="list-group-item list-group-item-action">Dapibus ac facilisis in</a>
                <a href="detial.jsp" class="list-group-item list-group-item-action">Morbi leo risus</a>
                <a href="#" class="list-group-item list-group-item-action">Porta ac consectetur ac</a>
                <a href="#" class="list-group-item list-group-item-action ">Vestibulum at eros</a>
            </div>
        </div>
        <div class="col-md-4">
            <div class="list-group">
                <li class="list-group-item list-group-item-action disabled">
                    本版最热
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
<div class="container-fluid">
    <div class="list-group" id="content">
        <c:forEach items="${platelist}" var="plate" varStatus="loop">
            <a href="/detial?detialId=${plate.pId}" class="list-group-item list-group-item-action flex-column align-items-start ">
                <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1">${plate.pTitle}</h5>
                </div>
                <p class="mb-1">${plate.pDesc}</p>
                <small>发帖人：${userlist[loop.count-1].uName}</small>
            </a>
        </c:forEach>
    </div>
</div>
<nav aria-label="Page navigation example" id="page">
    <ul class="pagination justify-content-center">
        <li class="page-item disabled">
            <a class="page-link" href="#" tabindex="-1">Previous</a>
        </li>
        <li class="page-item"><a class="page-link" href="#">1</a></li>
        <li class="page-item"><a class="page-link" href="#">2</a></li>
        <li class="page-item"><a class="page-link" href="#">3</a></li>
        <li class="page-item">
            <a class="page-link" href="#">Next</a>
        </li>
    </ul>
</nav>
<div id="foot"></div>
</body>
</html>