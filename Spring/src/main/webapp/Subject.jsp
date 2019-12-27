<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
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
				border: 2px solid black;
				
				padding: 40px;
				text-align: center;
				position: relative;
				top: 50%;
				left: 36%;
				color: black;
				text-decoration: bold;
				font-size: 24px;
			}
			</style>
</head>

<body style="margin:0px!important">
			<form action="subjectoption.lti">
			<div style="width:100%;float:center;height:100%;background-image: url('Image/exam.jfif')">
			
			<button type="submit" value="1" style="width:140px;position:absolute; top:100px; left: 600px;" class="btn">Java</button>
			
			<button type="submit" style="width:140px;position:absolute; top:100px; left: 400px;" class="btn">Python</button>
			<button type="submit" style="width:140px;position:absolute; top:100px; left: 800px;" class="btn">C++</button>
			<button type="submit" style="width:140px;position:absolute; top:300px; left: 400px;" class="btn">PHP</button>
			<button type="submit" style="width:140px;position:absolute; top:300px; left: 600px;" class="btn">SQL</button>
			<button type="submit" style="width:140px;position:absolute; top:300px; left: 800px;" class="btn">C#</button>
			
			</div>
		</form>

</body>
</html>