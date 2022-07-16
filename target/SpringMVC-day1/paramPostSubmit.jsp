<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/7/16
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>post请求接收参数测试</title>
</head>
<body>
<form action="/reciveParam01" method="post">
用户名：<input type="text" name="username" /><br/>
密&nbsp;&nbsp;码:<input type="password" name="password" /><br/>
<input type="submit" value="登录">
</form>
</body>
</html>
