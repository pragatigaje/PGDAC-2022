<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passenger</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
	<form action="passenger_add.jsp" method="post" class="container form">
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">User Name</label>
		  <input type="text" class="form-control" name="name" required="required">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Gender</label>
		  
			<div class="form-check">
				  <input class="form-check-input" type="radio" name="gender" value="male" >
				  <label class="form-check-label" for="flexRadioDefault1" >Male</label>
			</div>
			<div class="form-check">
				  <input class="form-check-input" type="radio" name="gender" value="female" checked>
				  <label class="form-check-label" for="flexRadioDefault2">Female</label>
			</div>
		  
		</div>
		<div class="mb-3">
			<label>Select country :</label>
			<select name="country" required="required">
				<option value="India" >India</option>
				<option value="USA" >USA</option>
				<option value="UK" >UK</option>
				<option value="Dubai" >Dubai</option>
				<option value="Nepal" >Nepal</option>
			</select>
		</div>
		
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label" >About You</label>
		  <input type="text" class="form-control" name="about" required="required">
		</div>

		<div class="form-check">
			<input class="form-check-input" type="checkbox" name="maillist" id="flexCheckDefault" value="true" > 
				<label class="form-check-label" for="flexCheckDefault"> Would you like to join our mail list? </label>
		</div>
		<br>
		<div>
			<button type="submit" class="btn btn-primary">Add</button>
		</div>
	</form>
	<%@include file="passenger_list.jsp" %>
</body>
</html>