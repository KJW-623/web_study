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
	<h2>도서 상세 정보</h2>
    <p><strong>ID:</strong> ${book.id}</p>
    <p><strong>제목:</strong> ${book.title}</p>
    <p><strong>작가:</strong> ${book.author}</p>
    <p><strong>가격:</strong> ${book.price}원</p>

    <p>
        <a href="/book/edit/${book.id}">수정</a> |
        <a href="/book/delete/${book.id}">삭제</a> |
        <a href="/book/list">목록으로</a>
    </p>
</body>
</html>