<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
</head>
<body style="margin:0px; background-position-x: center; background-image: url(image/li.jpg); background-repeat: repeat-y;">
	<center>
		<h1>登陆页面</h1>
		<hr>
		<form action="login" method="post">
			用户名:<input type="text" name="name"><br> 
			密码:<input type="password" name="password"><br> 
			
			<input type="submit" value="登录">&nbsp &nbsp&nbsp<input type=reset value="重置">


		</form>
	</center>
</body>
</html>