<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>새 도서 추가</h2>
	    <form action="/book/add" method="post">
	        <p>제목: <input type="text" name="title" required></p>
	        <p>작가: <input type="text" name="author" required></p>
	        <p>가격: <input type="number" name="price" required></p>
	        <p>
	            <input type="submit" value="등록">
	            <a href="/book/list">취소</a>
	        </p>
	    </form>

</body>
</html>