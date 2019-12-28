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
<input type="radio" name="flag" value="1" required="required"><input type="text", name="answer1" required="required"><br/>
<input type="radio" name="flag" value="2" required="required"><input type="text", name="answer2" required="required"><br/>
<input type="radio" name="flag" value="3" required="required"><input type="text", name="answer3" required="required"><br/>
<input type="radio" name="flag" value="4" required="required"><input type="text", name="answer4" required="required"><br/>
<button type="submit" name="submit" onclick="myFunction()">SUBMIT</button>
</form>
</c:if>
<c:if test="${lev==2}">
<form action="level2.lti" method="post">
Enter Question:<input type="text", name="question" ><br/>
Enter answers:<br/>
<input type="radio" name="flag" value="1" required="required"><input type="text", name="answer1" required="required"><br/>
<input type="radio" name="flag" value="2" required="required"><input type="text", name="answer2" required="required"><br/>
<input type="radio" name="flag" value="3" required="required"><input type="text", name="answer3" required="required"><br/>
<input type="radio" name="flag" value="4" required="required"><input type="text", name="answer4" required="required"><br/>
<button type="submit" name="submit" onclick="myFunction()">SUBMIT</button>
</form>
</c:if>
<c:if test="${lev==3}">
<form action="level3.lti" method="post">
Enter Question:<input type="text", name="question" ><br/>
Enter answers:<br/>
<input type="radio" name="flag" value="1" required="required"><input type="text", name="answer1" required="required"><br/>
<input type="radio" name="flag" value="2" required="required"><input type="text", name="answer2" required="required"><br/>
<input type="radio" name="flag" value="3" required="required"><input type="text", name="answer3" required="required"><br/>
<input type="radio" name="flag" value="4" required="required"><input type="text", name="answer4" required="required"><br/>
<button type="submit" name="submit" onclick="myFunction()">SUBMIT</button>
</form>
</c:if>
<script>
function myFunction() {
  alert("Question Added!!");
}
</script>
<form action="adminDashboard.lti">
<button type="submit" name="Exit">Exit</button>
</form>
</body>
</html>