<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改</title>
</head>
<body style="margin:0px; background-position-x: center; background-image: url(image/li.jpg); background-repeat: repeat-y;">
	<center>
		<h1>修改页面</h1>
		<hr>
		<form action="modify" method="post">
			用户名:<input type="text" name="name"><br>
			密码:<input type="text" name="password"><br> 
			<input type="submit" value="提交">&nbsp&nbsp&nbsp<input type=reset value="重置">
		</form>
	</center>
</body>
</html>