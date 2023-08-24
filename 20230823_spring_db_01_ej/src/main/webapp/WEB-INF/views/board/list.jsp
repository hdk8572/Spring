<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board list</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>

	<h2>Board List</h2>
	
	<table border="1">
		<tr>
			<td>BNO</td>
			<td>BTITLE</td>
			<td>BCONTENT</td>
			<td>BWRITE_DATE</td>
			<td>MID</td>
			<td>BREF</td>
			<td>BRE_LEVEL</td>
			<td>BRE_STEP</td>
		</tr>
		<c:forEach items="${boardList}" var="List">
     	<tr>
            <td>${List.bno}</td>
            <td>${List.btitle}</td>
            <td>${List.bcontent}</td>
            <td>${List.bwriteDate}</td>
            <td>${List.mid}</td>
            <td>${List.bref}</td>
            <td>${List.breLevel}</td>
            <td>${List.breStep}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>