<%@page language="java" pageEncoding="UTF-8" contentType="text/html; utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>登录</title>
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
    </style>
    <script type="application/javascript">
        $(function () {
            $("#head").load("common/nav.jsp");
            $("#foot").load("common/foot.html");

        })
        function checkUser(username){
            $("#useralert").empty();
            if(username==null||username==''){
                $("#useralert").append("<div class=\"alert alert-warning alert-dismissible fade show\" role=\"alert\">\n" +
                    "        <strong>错误!</strong> 用户名不能为空\n" +
                    "        <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n" +
                    "            <span aria-hidden=\"true\">&times;</span>\n" +
                    "        </button>\n" +
                    "    </div>")
            }
        }
        function checkPassowrd(password) {
            $("#pwdalert").empty();
            if(password==null||password==''){
                $("#pwdalert").append("<div class=\"alert alert-warning alert-dismissible fade show\" role=\"alert\">\n" +
                    "        <strong>错误!</strong> 密码不能为空\n" +
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
    <div id="useralert">
    </div>
    <div id="pwdalert">
    </div>
    <form action="login">
        <div class="form-group" >
            <label for="username">用户名</label>
            <input type="text" class="form-control" name="uName" id="username"  placeholder="输入用户名" onblur="checkUser(this.value)">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input name="uPassword" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" onblur="checkPassowrd(this.value)">
        </div>
        <div class="form-check" style="margin-bottom: 10px">
            <input name="remember" value="remember" type="checkbox" class="form-check-input" id="exampleCheck1">
            <label class="form-check-label" for="exampleCheck1">记住我</label>
        </div>
        <div  style="margin-left:40%;display: inline-block">
            <button type="submit" class="btn btn-primary">提交</button>
            <a href="/redirect_registe" type="reset" class="btn btn-primary">注册</a>
        </div>
    </form>
</div>
<div id="foot"></div>
</body>
</html>