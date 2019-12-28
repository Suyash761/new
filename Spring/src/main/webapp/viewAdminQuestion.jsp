<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
.main{
width: 100%;
height: 100%;
text-align: center;
}
.tab {
top: 50%;
left: 50%;
auto;
padding-top: 20px;
}

.tab td
{
padding:25px 25px 10px ;
}
.top{
font-size: 25px;
color:white;
text-align:justify;
}

.top nav{
display: block;
background-color:teal;
padding: 15px;
}

.but{
height: 35px;
border-radius: 5px;
}

.but>input{

height: 35px;
border-radius: 5px;
border: 1px solid grey;
background:powderblue;
}
</style>
<script>
function proceed(questionId) {
document.getElementById("questionid").value=questionId;

}
</script>
</head>
<body bgcolor="#e6e2d3">
<form action="editDetailsAdmin.lti">
<div class="main">

<table style="color: olive; " class="tab">
<tr>
<th>Question ID</th>
<th>Question</th>
<th>Option 1</th>
<th>Option 2</th>
<th>Option 3</th>
<th>Option 4</th>
<th>Correct Option</th>
</tr>
<c:forEach items="${ adminlevel }" var="quesview">
<tr>
<td>${ quesview.questionId }</td>
<td>${ quesview.question }</td>
<td>${ quesview.answer1 }</td>
<td>${ quesview.answer2 }</td>
<td>${ quesview.answer3 } </td>
<td>${ quesview.answer4 } </td>
<td>${ quesview.flag } </td>
<div class="but">
<td><input type="submit" value="Edit" onclick="proceed(${ quesview.questionId })"/><td>

</div>
</td>
</tr>
</c:forEach>
</table>
</div>
<input id="questionid" type="hidden" name="viewQuestiontId"/>
</form>
<form action="adminDashboard.lti">
<button type="submit" name="exit">EXIT</button>
</form>
</body>
</html>

