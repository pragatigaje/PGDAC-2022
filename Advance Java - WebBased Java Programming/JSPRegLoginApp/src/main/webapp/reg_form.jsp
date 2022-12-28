<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<style>
	body{
		margin: 160px;
	    background: #bab9b9;
	    font-weight: bold;
	}
</style>
</head>
<body>
	<form action="reg.jsp" method="post">
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">User Name</label>
		  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter User Name" name="uname">
		</div>
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">Password</label>
		  <input type="password" class="form-control" id="exampleFormControlInput1" placeholder="Enter Password" name="upass">
		</div>
		<button type="submit" class="btn btn-dark center">Register</button>
		<a href="login_from.jsp" class="btn btn-link" >Go Back to Login</a>
	</form>
</body>
</html>