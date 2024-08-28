<%--
  Created by IntelliJ IDEA.
  User: manda
  Date: 2024-08-14
  Time: 8:37 a.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Second Page</title>
</head>
<body>
<h3>Welcome to second page,you can insert your first Do.</h3>

<form action="/DoServlet" method="post">


    Date: <input type="text" name="date">
    <br>
    <br>
    Description: <input type="text" name="description">
    <br>
    <br>
    <input type="submit" value="Insert">
</form>

<form action="/DoServlet" method="get">


    <input type="submit" value="Show">
</form>


</body>
</html>
