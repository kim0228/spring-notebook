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
		<div>
			<label>제목</label> <input type="text" name="title"/>
		</div>

		<div>
			<label>작성자</label> <input type="text" name="writer"/>
		</div>

		<div>
			<label>내용</label>
			<textarea rows="5" cols="50" name="content"></textarea>
		</div>

		<div>
			<button type="submit">작성</button>
			<!-- submit속성은 데이터를 전송한다는 의미이다. -->
 		</div>
	</form>
</body>
</html>