<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board list</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>

	<h2>Board List</h2>
	[[
	${boardList}
	]]
	
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
     	<tr>
            <td>${bno}</td>
            <td>${btitle}</td>
            <td>${bcontent}</td>
            <td>${bwriteDate}</td>
            <td>${mid}</td>
            <td>${bref}</td>
            <td>${breLevel}</td>
            <td>${breStep}</td>
        </tr>
    </table>
</body>
</html>