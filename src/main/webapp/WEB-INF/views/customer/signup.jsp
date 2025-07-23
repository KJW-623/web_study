<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 가입</h1>

	<form action="/customer/signup" method="post">
		<label>아이디<input type="text" name="id"></label><br>
		<label>비밀번호<input type="password" name="pw"></label><br>
		<label>이름<input type="text" name="name"></label><br> 

		<button type="submit">완료하기</button>
	</form>

</body>
</html>