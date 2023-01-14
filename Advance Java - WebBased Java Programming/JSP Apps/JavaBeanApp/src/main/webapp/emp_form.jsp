<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMP Form</title>
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
	<form action="emp_add.jsp" method="post">
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">Emp Id</label>
		  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter Emp ID" name="eid">
		</div>
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">Name</label>
		  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter Name" name="ename">
		</div>
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">Salary</label>
		  <input type="password" class="form-control" id="exampleFormControlInput1" placeholder="Enter Salary" name="sal">
		</div>
		<button type="submit" class="btn btn-dark center">Add Employee</button>
	</form>
</body>
</html>