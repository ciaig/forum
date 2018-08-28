<%@page language="java" contentType="text/html; utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>修改个人信息</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script src="/js/jquery-3.3.1.min.js"></script>
    <script src="/js/popper.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/css/common.css">
    <style type="text/css">
        #login{
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
        });
        function checkRePwd(repwd) {
            var pwd = $("#Password").val();
            if (repwd != pwd) {
                $("#pwdalert").append("<div class=\"alert alert-warning alert-dismissible fade show\" role=\"alert\">\n" +
                    "        <strong>错误!</strong> 两次输入的密码不一致\n" +
                    "        <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n" +
                    "            <span aria-hidden=\"true\">&times;</span>\n" +
                    "        </button>\n" +
                    "    </div>")
            }
        }
    </script>
</head>
<body>
<div id="head"></div>
<div class="container-fluid" id="login">
    <div id="pwdalert">
    </div>
    <form action="updateinfo" enctype="multipart/form-data" method="post">
        <img src="/resources/headimg/${isLogin.headImg}" height="200px" width="280px">
        <div class="form-group">
            <label for="exampleFormControlFile1">选择新头像</label>
            <input name="img" type="file" class="form-control-file" id="exampleFormControlFile1">
        </div>
        <div class="form-group" >
            <label for="username">用户名</label>
            <input name="uName" type="text" class="form-control" id="username"  placeholder="${isLogin.uName}">
        </div>
        <div class="form-group">
            <label for="Password">密码</label>
            <input name="uPassword" type="password" class="form-control" id="Password" placeholder="Password">
        </div>
        <div class="form-group">
            <label for="checkPassowrd">确认密码</label>
            <input type="password" class="form-control" id="checkPassowrd" placeholder="Password" onblur="checkRePwd(this.value)">
        </div>
        <div class="form-group">
            <label for="desc">个性签名</label>
            <input name="uDesc" type="text" class="form-control" id="desc" placeholder="${isLogin.uDesc}">
        </div>
        <label for="sex">性别</label>
        <select name="uGender" class="form-control" id="sex">
            <option value="男">男</option>
            <option value="女">女</option>
        </select>
        <input type="hidden" name="uId" value="${isLogin.uId}">
        <input type="hidden" name="headImg" value="${isLogin.headImg}">
        <div  style="margin-left:40%;display: inline-block">
            <button type="submit" class="btn btn-primary">提交</button>
            <button type="reset" class="btn btn-primary">重置</button>
        </div>
    </form>
</div>
<div id="foot"></div>
</body>
</html>