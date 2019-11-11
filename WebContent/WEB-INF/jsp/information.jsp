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
		<form>
			<table>
				<caption>我的信息</caption>
				<tr>
					<td><label>用户名：</label></td>
					<td><c:out value="${person.username}"></c:out></td>
				</tr>
				<tr>
					<td><label>昵&nbsp;&nbsp;&nbsp;称：</label></td>
					<td><c:out value="${person.informationForUser.nickname}"></c:out></td>
				</tr>
				<tr>
					<td><label>生&nbsp;&nbsp;&nbsp;日：</label></td>
					<td><fmt:formatDate value="${person.informationForUser.birthday}" type="date" pattern="yyyy-MM-dd"/></td>
				</tr>
				<tr>
					<td><label>邮&nbsp;&nbsp;&nbsp;箱：</label></td>
					<td><c:out value="${person.informationForUser.email}"></c:out></td>
				</tr>
				<tr>
					<td><label>电&nbsp;&nbsp;&nbsp;话：</label></td>
					<td><c:out value="${person.informationForUser.tel}"></c:out></td>
				</tr>
				<tr>
					<td><label>住&nbsp;&nbsp;&nbsp;址：</label></td>
					<td><c:out value="${person.informationForUser.address}"></c:out></td>
				</tr>
				<tr>
					<td><label>自我介绍：</label></td>
					<td><c:out value="${person.informationForUser.instruction}"></c:out></td>
				</tr>
				<tr>
					<td><label><a href="${pageContext.request.contextPath}/myaccount/goUpdateInformation.action">修改信息</a></label></td>
				</tr>
				<tr>
					<td><label><a href="/FirstCompletely/FileRepository/files/16113328 赵新阳20191111001445_395.doc">我日</a></label></td>
					<td><img src="${pageContext.request.contextPath}/FileRepository/images/3.jpg" width="555" height="555" alt="" title="" align="" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>

  

  
  
