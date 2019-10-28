<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 목록</title>
</head>
<body>

<form method="post">
<!-- post는 데이터를 전송하는 메소드이다. post는 우리들의 새로운 데이터를
	생성해서 보내거나, 기존 데이터를 수정해서 보낸다. -->

<label>제목</label>
<input type="text" name="title" /><br />

<label>작성자</label>
<input type="text" name="writer" /><br />

<label>내용</label>
<textarea cols="50" rows="5" name="content"></textarea><br />

<button type="submit">작성</button>

</form>
</body>
</html>