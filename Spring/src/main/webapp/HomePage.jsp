<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
			html,
			body {
				height: 100%;
			}
			.vl {
			  border-left: 6px solid #010313;
			  height: 100%;
			  position: absolute;
			  left: 49%;
			  margin-left: -3px;
			  
			}
			
			.btn{
				border: 2px solid #e0ef09;
				
				padding: 40px;
				text-align: center;
				position: relative;
				top: 50%;
				left: 36%;
				color: white;
				text-decoration: none;
				font-size: 24px;
			}
			</style>
</head>

<body style="margin:0px!important">
			<div style="width:100%;height:100%">
			<div style="width:49%;float:left;background:#151965;height:100%">
				<a href="AdminLogin.jsp" class="btn">Admin</a>
			</div>
			
			<div style="width:2%;float:left;height:100%;background:#32407b">
				<div class="vl"></div>
			</div>
			
			<div style="width:49%;float:right;background:#32407b;height:100%">
				<a href="Login.jsp" style="width:50px;" class="btn">Student</a>
			</div>
				
			</div>
				
	
</body>
</html>