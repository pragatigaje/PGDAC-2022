<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<style>
	body{
		margin: 160px;
	    background: #bab9b9;
	    font-weight: bold;
	}
	.button{
		display: grid;
		height: 12px
	}
</style>
</head>
<body>
	<body>
	<div class="alert alert-info text-center" role="alert">
		Login
	</div>
	<!-- request is send to expense_add.jsp because of action tag  -->
	<form action="user_login.jsp" method="post">
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">User Name : </label>
		  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter UserName" name="uname">
		</div>
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">Password : </label>
		  <input type="password" class="form-control" id="exampleFormControlInput1" placeholder="Enter Item Password" name="upass">
		</div>
		<br>
		<div class="button">
			<button type="submit" class="btn btn-dark text-center">Login</button>
			<a href="user_reg_form.jsp" class="btn btn-link" >New User?, Register here!</a>		
		</div>
	</form>
</body>
</html>