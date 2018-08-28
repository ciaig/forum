<%@page language="java" contentType="text/html; utf-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container-fluid">
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
            <a class="navbar-brand" href="/index">XXX论坛</a>
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item active">
                    <a class="nav-link" href="overlook.html">最新 <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="overlook.html">排行</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="overlook.html">总览</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0" style="margin-right: 10px">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
            <c:if test="${empty isLogin}">
                <a href="/redirect_login" type="button" class="btn btn-success">登录</a>
                <a href="/redirect_registe" style="margin-left: 10px" type="button" class="btn btn-success">注册</a>
            </c:if>
            <c:if test="${not empty isLogin}">
                <div class="dropdown">
                    <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        ${isLogin.uName}
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                        <a class="dropdown-item" href="/usercenter">个人中心</a>
                        <a class="dropdown-item" href="#">我的收藏</a>
                        <a class="dropdown-item" href="/quit">退出登录</a>
                    </div>
                </div>
            </c:if>
        </div>
    </nav>
</div>