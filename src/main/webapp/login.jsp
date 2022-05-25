<%--
  Created by IntelliJ IDEA.
  User: 12282
  Date: 2022/5/24
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.getAttribute("msg"); %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<span>${msg}</span>
<form action="userLogin" method="post">
    username:<input name="username">
    <br>
    password:<input name="password">
    <input type="submit" value="登陆">
</form>
</body>
</html>
