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
        <p><strong>이름:</strong> <span>${name}</span></p>
        <p><strong>키:</strong> <span>${height}</span> cm</p>
        <p><strong>몸무게:</strong> <span>${weight}</span> kg</p>

        <div>
            <p><strong>BMI:</strong> <span>${bmi}</span></p>
        </div>
    </div>


<!--<body>
	<h1>bmi 결과 페이지</h1>
	
	<p> 이름 : ${name}</p>
	<p> 키 : ${height}</p>
	<p> 몸무게 : ${weight}</p>
	<p> bmi 지수 : ${bmi}</p>
	
	<p> 이름 : ${personBmi.name}</p>
	<p> 키 : ${personBmi.height}</p>
	<p> 몸무게 : ${personBmi.weight}</p>
	<p> bmi 지수 : ${personBmi.bmi}</p>
</body>  -->


</body>
</html>