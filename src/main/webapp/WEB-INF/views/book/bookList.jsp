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
	<h2>도서 목록</h2>
	<a href="/book/add">도서 추가</a>
	<br>
	<br>
	<table border="1">
	    <tr><th>ID</th><th>제목</th><th>작가</th><th>가격</th><th>기능</th></tr>
	    <c:forEach var="book" items="${bookList}">
	        <tr>
	            <td>${book.id}</td>
	            <td><a href="/book/detail/${book.id}">${book.title}</a></td>
	            <td>${book.author}</td>
	            <td>${book.price}</td>
	            <td>
	                <a href="/book/edit/${book.id}">수정</a> |
	                <a href="/book/delete/${book.id}">삭제</a>
	            </td>
	        </tr>
	    </c:forEach>
	</table>
</body>
</html>