<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 등록</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/board/insert" method="post">
		번호 :<input type="text" name="bno"><br>
		제목 :<input type="text" name="btitle"><br>
		내용 :<input type="text" name="bcontent"><br>
		날짜 :<input type="text" name="bwriteDate"><br>
		계정 :<input type="text" name="mid"><br>
		댓글 :<input type="text" name="bref"><br>
		대댓글 :<input type="text" name="breLevel"><br>
		대대댓글 :<input type="text" name="breStep"><br>
		<input type="submit" value="등록">
	</form>
</body>
</html>