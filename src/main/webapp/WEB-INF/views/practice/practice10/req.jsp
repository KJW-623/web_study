<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div>
		<h1>${FromA}</h1>
		<h2>${OriginalA}</h2>
	</div>

	<div>
		<h1>${FromB}</h1>
		<h2>${OriginalB}</h2>
	</div>


</body>
</html>

<!-- 선생님 버전
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>FromA</p>
	<p>OriginalA</p>
<%-- 	<p>${fromBMsg}</p> --%>
	<p>${sessionScope.fromBMsg}</p>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>FromB</p>
	<p>OriginalB</p>
</body>
</html>
 -->