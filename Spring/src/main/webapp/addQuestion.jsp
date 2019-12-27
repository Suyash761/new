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

<c:if test="${lev==1}">
<form action="level1.lti" method="post">
Enter Question:<input type="text", name="question" ><br/>
Enter answers:<br/>
<input type="radio" name="flag" value="1"><input type="text", name="answer1" ><br/>
<input type="radio" name="flag" value="2"><input type="text", name="answer2" ><br/>
<input type="radio" name="flag" value="3"><input type="text", name="answer3" ><br/>
<input type="radio" name="flag" value="4"><input type="text", name="answer4" ><br/>
<button type="submit" name="submit">SUBMIT</button>
</form>
</c:if>
<c:if test="${lev==2}">
<form action="level2.lti" method="post">
Enter Question:<input type="text", name="question" ><br/>
Enter answers:<br/>
<input type="radio" name="flag" value="1"><input type="text", name="answer1" ><br/>
<input type="radio" name="flag" value="2"><input type="text", name="answer2" ><br/>
<input type="radio" name="flag" value="3"><input type="text", name="answer3" ><br/>
<input type="radio" name="flag" value="4"><input type="text", name="answer4" ><br/>
<button type="submit" name="submit">SUBMIT</button>
</form>
</c:if>
<c:if test="${lev==3}">
<form action="level3.lti" method="post">
Enter Question:<input type="text", name="question" ><br/>
Enter answers:<br/>
<input type="radio" name="flag" value="1"><input type="text", name="answer1" ><br/>
<input type="radio" name="flag" value="2"><input type="text", name="answer2" ><br/>
<input type="radio" name="flag" value="3"><input type="text", name="answer3" ><br/>
<input type="radio" name="flag" value="4"><input type="text", name="answer4" ><br/>
<button type="submit" name="submit">SUBMIT</button>
</form>
</c:if>

<form action="SubjectChoice.jsp">
<button type="submit" name="Exit">Exit</button>
</form>
</body>
</html>