<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登陆页</title>
</head>
<body>
<h1>------欢迎登陆系统------</h1>
<form name="form" action="LoginServlet">
    用户：
    <input type="text" name="username" value="Robin" />
    <br>
    密码：
    <input type="password" name="password" value="" />
    <p></p>
    <input type="submit" value="确认" name="submit" />
    <input type="reset" value="重置" name="reset" />
</form>
<img src="images/1.jpg" width="470" height="290" alt="welcome"/>
<jsp:useBean id="user" scope="page" class="login.LoginBean" />
<jsp:getProperty name="user" property="username" />
<jsp:setProperty name="user" property="username" value="Robin" />
</body>

</html>