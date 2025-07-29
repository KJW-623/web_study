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
	 <h2>도서 정보 수정</h2>
	    <form action="/book/edit" method="post">
	        <!-- ID는 hidden으로 보내기 -->
	        <input type="hidden" name="id" value="${book.id}">
	        <p>제목: <input type="text" name="title" value="${book.title}" required></p>
	        <p>작가: <input type="text" name="author" value="${book.author}" required></p>
	        <p>가격: <input type="number" name="price" value="${book.price}" required></p>
	        <p>
	            <input type="submit" value="수정">
	            <a href="/book/list">취소</a>
	        </p>
	    </form>

</body>
</html>