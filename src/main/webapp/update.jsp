<%--
  Created by IntelliJ IDEA.
  User: 乐云涛
  Date: 2019/9/18
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/update" method="post">
    <table border="1">
        <tr>
            <th> <h2>修改</h2></th>
        </tr>
        <tr style="display: none">
            <th><input   type="text"  value="${usersById.id}" name="id"/></th>
        </tr>
        <tr>
            <th>姓名：<input type="text"  value="${usersById.name}" name="name"/></th>
        </tr>
        <tr>
            <th>pwd：<input type="password" value="${usersById.pwd}" name="pwd"/></th>
        </tr>
        <tr>
            <th><input type="submit" value="提交"/></th>
        </tr>
    </table>
</form>
</body>
</html>
