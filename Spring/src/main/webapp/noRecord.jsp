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
<h1>NO EXAM GIVEN FOR THIS SUBJECT</h1>
<c:if test="${dummy==null}">
<form action="studentDashboard.lti">
<button type="submit" name="exit">Exit to Student Dashboard</button>
</form>
</c:if>
<c:if test="${dummy==1}">
<form action="adminDashboard.lti">
<button type="submit" name="exit">Exit to Admin Dashboard</button>
</form>
</c:if>
</body>
</html>