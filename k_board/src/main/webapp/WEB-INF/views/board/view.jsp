<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 목록</title>
</head>
<body>
	<form method="post">
  <div>
    <label>제목</label> <input type="text" name="title" value="${view.title}" readonly="readonly"/>
  </div>

  <div>
    <label>작성자</label> <input type="text" name="writer" value="${view.writer}" readonly="readonly"/>
  </div>

  <div>
    <label>작성날짜</label> <input type="text" name="regDate"
 value="<fmt:formatDate value="${view.regDate}" pattern="yyyy-MM-dd" />" readonly="readonly"/>
</div>

  <div>
    <label>내용</label>
    <textarea rows="5" cols="50" name="content" readonly="readonly">${view.content}</textarea>
  </div>
</form>
</body>
</html>