<%@ page import="java.util.List" %>
<%@ page import="servlets.DoItem" %>
<%@ page import="servlets.DoItem" %>
<%--
  Created by IntelliJ IDEA.
  User: manda
  Date: 2024-08-14
  Time: 9:21 a.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<html>
<head>
    <title>Third Page</title>
</head>
<body>
<h3>Welcome to third page,you can see your Dos.</h3>
<table  border="1" , width="50%">
    <tr>
        <th>Date</th>
        <th>Description</th>

    </tr>


    <%

        List<DoItem> toDoItemList = (List<DoItem>) request.getAttribute("viewList");
        if (toDoItemList != null) {
        for(DoItem doItem :toDoItemList){
            %>
    <tr>
        <td><%= doItem.getDate()%></td>
        <td><%= doItem.getDescription()%></td>

    </tr>
    <%
        }
        }
        %>



</table>
</body>
</html>
