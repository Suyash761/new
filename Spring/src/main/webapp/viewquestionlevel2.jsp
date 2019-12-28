<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Question No: ${ sessionScope.qnol2 + 1 }
<form action="scorelevel2.lti" method="post">
<h2>${ currentQs.question }</h2><br/>
<input type="radio" name="ans" value="1" required="required">${ currentQs.answer1 }<br/>
<input type="radio" name="ans" value="2" required="required">${ currentQs.answer2 }<br/>
<input type="radio" name="ans" value="3" required="required">${ currentQs.answer3 }<br/>
<input type="radio" name="ans" value="4" required="required">${ currentQs.answer4 }<br/>
<button type="submit">Next</button>
</form>
<form action="studentDashboard.lti">
<button type="submit" name="exit">EXIT</button>
</form>
</body>
</html>