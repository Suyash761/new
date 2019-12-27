<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="examlevel3.lti" method="post">
<h1> Your score is : ${ counterlevel2 } </h1>
<h1>Congratulation, u cleared level 2 </h1>
<button type="submit" name="level3->">Level 3-></button>
</form>
<form action="Report.lti" method="post">
<button type="submit" name="exit">EXIT</button>
</form>
</body>
</html>