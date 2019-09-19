<%--
  Created by IntelliJ IDEA.
  User: 乐云涛
  Date: 2019/9/15
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" width="360px">
    <tr>
        <th colspan="4">用户表</th>
    </tr>
    <c:forEach items="${users}" var="li">
        <tr>
            <th><a href="/getUsers?id=${li.id}">${li.id}</a></th>
            <th>${li.name}</th>
            <th>${li.pwd}</th>
            <th><a href="/delete?id=${li.id}">删除</a></th>
        </tr>
    </c:forEach>
</table>

<a href="add.jsp">新增</a>

</body>
</html>
