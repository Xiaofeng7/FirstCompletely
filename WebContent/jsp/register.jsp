<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>注册</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/register.css">
</head>
<body>
	<div class="login">
		<form action="${pageContext.request.contextPath}/myaccount/register.action" method="post">
			<table>
				<caption>注&nbsp;&nbsp;&nbsp;册</caption>
				<tr>
					<td><label>用户名：</label></td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td><label>密&nbsp;&nbsp;&nbsp;码：</label></td>
					<td><input type="password" name="passwd"></td>
				</tr>
				<tr>
					<td><label>昵&nbsp;&nbsp;&nbsp;称：</label></td>
					<td><input type="text" name="nickname"></td>
				</tr>
				<tr>
					<td><label>生&nbsp;&nbsp;&nbsp;日：</label></td>
					<td><input type="date" name="birthday"></td>
				</tr>
				<tr>
					<td><label>邮&nbsp;&nbsp;&nbsp;箱：</label></td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td><label>电&nbsp;&nbsp;&nbsp;话：</label></td>
					<td><input type="text" name="tel"></td>
				</tr>
				<tr>
					<td><label>住&nbsp;&nbsp;&nbsp;址：</label></td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td><label>自我介绍：</label></td>
					<td><input type="text" name="instruction"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="注册" style="background-color: green;border: 0px;height:40px;"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>

  

  
  
