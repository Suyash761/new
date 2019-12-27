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
<input type="radio" name="ans" value="1">${ currentQs.answer1 }<br/>
<input type="radio" name="ans" value="2">${ currentQs.answer2 }<br/>
<input type="radio" name="ans" value="3">${ currentQs.answer3 }<br/>
<input type="radio" name="ans" value="4">${ currentQs.answer4 }<br/>
<button type="submit">Next</button>
</form>
</body>
</html>