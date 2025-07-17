<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
        <h1>*신체질량지수(BMI) = 체중(kg) / [신장(m)]2</h1>
        <form action="/practice06/result-bmi" method="post">
            <label for="name">이름: </label>
            <input type="text" id="name" name="name" required> <br>

            <label for="height">키: </label>
            <input type="number" id="height" name="height" required>
            <span>cm</span> <br>

            <label for="weight">몸무게: </label>
            <input type="number" id="weight" name="weight" required>
            <span>kg</span> <br>

            <button type="submit">확인하기</button>
        </form>
    </div>
	
	<!-- <body>
		<h1>ask-bmi</h1>
		<h2>입력항목</h2>
		<form action="/practice06/result-bmi4" method="post">
		<form action="/practice06/result-bmi4" method="get">
			이름 : <input type="text" name="name"><br>
			키 : <input type="text" name="height"><br>
			몸무게 : <input type="text" name="weight"><br>
			<button type="submit">확인하기</button>
		</form>
	</body> -->

</body>
</html>

