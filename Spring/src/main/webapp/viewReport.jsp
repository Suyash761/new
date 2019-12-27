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
<table border="1">
	<c:forEach items="${ report }" var="repo">
	<tr>
		<td>Date/time : ${repo.dateTime }</td>
		<td>Level 1 score : ${repo.level1score }</td>
		<td>Level 2 score : ${repo.level2score }</td>
		<td>Level 3 score : ${repo.level3score }</td>
	</c:forEach>
</table>
<form action="Login.jsp">
<button type="submit" name="exit">Exit</button>
</form>
</body>
</html>