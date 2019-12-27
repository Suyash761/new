<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<style type="text/css">
  <%@include file="/adminLogin.css" %>
</style>
</head>
<body>

<div class="container" align="center">
<form action="adminLogin.lti" method="post">
<h1>Welcome</h1>
<input type="text" name="username" placeholder="Username" required/><br>
<input type="password" name="password" placeholder="Password" required/><br>
<button type="submit" value="Submit">Submit</button>	
</form>
</div>

<h3>${ message }</h3>

</body>
</html>











































