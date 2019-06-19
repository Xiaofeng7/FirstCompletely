<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
	<title>个人信息</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/register.css">
</head>
<body>
	<div class="login">
		<form action="${pageContext.request.contextPath}/myaccount/updateInformation.action" method="post">
			<table>
				<caption>我的信息</caption>
				<tr>
					<td><label>用户名：</label></td>
					<td><c:out value="${person.username}"></c:out></td>
				</tr>
				<tr>
					<td><label>昵&nbsp;&nbsp;&nbsp;称：</label></td>
					<td><input type="text" name="nickname" value="${person.informationForUser.nickname}"/></td>
				</tr>
				<tr>
					<td><label>生&nbsp;&nbsp;&nbsp;日：</label></td>
					<td><input type="date" name="birthday" value="${person.informationForUser.birthday}"/></td>
					<%-- <td><fmt:formatDate value="${person.informationForUser.birthday}" type="date" pattern="yyyy-MM-dd"/></td> --%>
				</tr>
				<tr>
					<td><label>邮&nbsp;&nbsp;&nbsp;箱：</label></td>
					<td><input type="text" name="email" value="${person.informationForUser.email}"/></td>
				</tr>
				<tr>
					<td><label>电&nbsp;&nbsp;&nbsp;话：</label></td>
					<td><input type="text" name="tel" value="${person.informationForUser.tel}"/></td>
				</tr>
				<tr>
					<td><label>住&nbsp;&nbsp;&nbsp;址：</label></td>
					<td><input type="text" name="address" value="${person.informationForUser.address}"/></td>
				</tr>
				<tr>
					<td><label>自我介绍：</label></td>
					<td><input type="text" name="instruction" value="${person.informationForUser.instruction}"/></td>
				</tr>
				<tr>
					<td><a href="${pageContext.request.contextPath}/myaccount/deleteAccount.action?inId=${person.informationForUser.id}">注销账户</a></td>
					<td><input type="submit" value="提交" style="background-color: green;border: 0px;"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>

  

  
  
