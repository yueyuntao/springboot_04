<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/add" method="post">
 <table border="1">
     <tr>
         <th> <h2>新增</h2></th>
     </tr>
     <tr>
         <th>姓名：<input type="text" name="name"/></th>
     </tr>
     <tr>
         <th>pwd：<input type="password" name="pwd"/></th>
     </tr>
     <tr>
         <th><input type="submit" value="提交"/></th>
     </tr>
 </table>
</form>
</body>
</html>
