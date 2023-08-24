<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member/list</title>
</head>
<body>
	<h1>Member List</h1>
	<div>
		<table border="1">
			<tr>
				<td>MID</td>
				<td>MPWD</td>
				<td>MNAME</td>
				<td>MEMAIL</td>
			</tr>
			<c:forEach items="${memberList}" var="memberList">
			<tr>
				<td>${memberList.mid}</td>
				<td>${memberList.mpwd}</td>
				<td>${memberList.mname}</td>
				<td>${memberList.memail}</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>