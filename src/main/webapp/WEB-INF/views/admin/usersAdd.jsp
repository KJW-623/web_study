<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>유저 추가</h1>

	<form action="/admin/users/add" method="post">
		<label>아이디<input type="text" name="id"></label><br>
		<label>비밀번호<input type="password" name="pw"></label><br>
		<label>이름<input type="text" name="name"></label><br> 
		
		<h4>유저타입</h4>
		<select name="userType">
			<option value="CUS">사용자</option>
			<option value="ADM">관리자</option>
		</select> <br>
		<button type="submit">등록하기</button>
	</form>
	
</body>
</html>