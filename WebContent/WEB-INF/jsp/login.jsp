<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录界面</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
</head>
<body>
<div class="login">
		<form action="${pageContext.request.contextPath}/myaccount/login.action" method="post">
			<table>
				<caption>登&nbsp;&nbsp;&nbsp;录</caption><br><br><br>
				<tr>
					<td><input type="text" name="username" placeholder="用户名"></td>
				</tr>
				<tr>
					<td><input type="password" name="passwd" placeholder="密码"></td>
				</tr>
				<tr>
					<td><input type="submit" value="登录" style="background-color: green;border: 0px;"></td>
				</tr>
				<tr>
					<td><a href="${pageContext.request.contextPath}/jsp/register.jsp">没有账号？去注册</a></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>