<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
<title>게시물 목록</title>
</head>
<body>

	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach items="${list}" var="list">
				<!-- forEach는 리스트형데이터를 받아서 그 리스트의 갯수만큼 반복한다.
			forEach내부에 있는 items속성에는 컨트롤러에서 작성했던 list 즉, 
			model.addattribute("list",list)가 들어간다. 
			var속성은 items에 있는 데이터가 들어갈 변수가 된다. -->
				<tr>
					<td>${list.bno}</td>
					<td>
					<a href="/board/view?bno=${list.bno}">${list.title}</a>
					</td>
					<td>${list.writer}</td>
					<td><fmt:formatDate value="${list.regDate}" pattern="yyyy-MM-dd" /></td>
					<td>${list.viewCnt}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>