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
	<h1>관리자 페이지</h1>
	<h2>사용자 상세 페이지</h2>


	<p>아이디 : ${user.id}</p>
	<p>이름 : ${user.name}</p>

	<p>
		<c:choose>
			<c:when test="${user.userType == 'CUS'}">사용자</c:when>
			<c:when test="${user.userType == 'ADM'}">관리자</c:when>
		</c:choose>
	</p>
	
	<div>
		<buttion type="button" onClick="location.href='/admin/modifyUser/${user.id}'">수정하기</buttion>
		<buttion type="button" onClick="location.href='/admin/users'">사용자 목록 보기</buttion>
	</div>

</body>
</html>