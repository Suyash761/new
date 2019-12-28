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
<c:if test="${adminlev==1}">
<form action="addEditDetailsAdminLevel1.lti">
Question:<input type="text", name="question" placeholder="${ adminlevQuestion.question }" value="${ adminlevQuestion.question }"><br/>
<br/>
Option 1 : <input type="text", name="answer1" placeholder="${ adminlevQuestion.answer1 }" value="${ adminlevQuestion.answer1 }"><br/><br/>
Option 2 : <input type="text", name="answer2" placeholder="${ adminlevQuestion.answer2 }" value="${ adminlevQuestion.answer2 }"><br/><br/>
Option 3 : <input type="text", name="answer3" placeholder="${ adminlevQuestion.answer3 }" value="${ adminlevQuestion.answer3 }"><br/><br/>
Option 4 : <input type="text", name="answer4" placeholder="${ adminlevQuestion.answer4 }" value="${ adminlevQuestion.answer4 }"><br/><br/>
Answer :
<input type="text", name="flag" placeholder="${ adminlevQuestion.flag }" value="${ adminlevQuestion.flag }"><br/><br/>
<button type="submit" name="submit" onclick="myFunction()">UPDATE</button>
</form>
</c:if>
<c:if test="${adminlev==2}">
<form action="addEditDetailsAdminLevel2.lti">
Question:<input type="text", name="question" placeholder="${ adminlevQuestion.question }" value="${ adminlevQuestion.question }"><br/>
<br/>
Option 1 : <input type="text", name="answer1" placeholder="${ adminlevQuestion.answer1 }" value="${ adminlevQuestion.answer1 }"><br/><br/>
Option 2 : <input type="text", name="answer2" placeholder="${ adminlevQuestion.answer2 }" value="${ adminlevQuestion.answer2 }"><br/><br/>
Option 3 : <input type="text", name="answer3" placeholder="${ adminlevQuestion.answer3 }" value="${ adminlevQuestion.answer3 }"><br/><br/>
Option 4 : <input type="text", name="answer4" placeholder="${ adminlevQuestion.answer4 }" value="${ adminlevQuestion.answer4 }"><br/><br/>
Answer :
<input type="text", name="flag" placeholder="${ adminlevQuestion.flag }" value="${ adminlevQuestion.flag }"><br/><br/>
<button type="submit" name="submit" onclick="myFunction()">UPDATE</button>
</form>
</c:if>
<c:if test="${adminlev==3}">
<form action="addEditDetailsAdminLevel3.lti">
Question:<input type="text", name="question" placeholder="${ adminlevQuestion.question }" value="${ adminlevQuestion.question }"><br/>
<br/>
Option 1 : <input type="text", name="answer1" placeholder="${ adminlevQuestion.answer1 }" value="${ adminlevQuestion.answer1 }"><br/><br/>
Option 2 : <input type="text", name="answer2" placeholder="${ adminlevQuestion.answer2 }" value="${ adminlevQuestion.answer2 }"><br/><br/>
Option 3 : <input type="text", name="answer3" placeholder="${ adminlevQuestion.answer3 }" value="${ adminlevQuestion.answer3 }"><br/><br/>
Option 4 : <input type="text", name="answer4" placeholder="${ adminlevQuestion.answer4 }" value="${ adminlevQuestion.answer4 }"><br/><br/>
Answer :
<input type="text", name="flag" placeholder="${ adminlevQuestion.flag }" value="${ adminlevQuestion.flag }"><br/><br/>
<button type="submit" name="submit" onclick="myFunction()">UPDATE</button>
</form>
</c:if>
<script>
function myFunction() {
  alert("Updated!!");
}
</script>
<form action="adminDashboard.lti">
<button type="submit" name="Exit">Exit</button>
</form>
</body>
</html>