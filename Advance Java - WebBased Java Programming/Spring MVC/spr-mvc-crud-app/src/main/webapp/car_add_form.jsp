<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>car add form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
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
	.container{
		max-width: 500px;
	}
</style>
</head>
<body>
	<spr:form action="car_add.htm" commandName="car" method="post" class="form align-items-center container px-4">
		<div class="">
			<label for="exampleFormControlInput1" class="form-label" >Make:</label><br>
			<spr:input type="text" class="form-control" path="make"/>
			<spr:errors class="text-danger" path="make"></spr:errors>
		</div>
		<div class=>
			<label for="exampleFormControlInput1" class="form-label">Model:</label><br>
			<spr:input type="text" class="form-control" path="model"/>
			<spr:errors class="text-danger" path="make"></spr:errors>
		</div>
		<div class=>
			<label for="exampleFormControlInput1" class="form-label">Price:</label><br>
			<spr:input type="text" class="form-control" path="price"/>
			<spr:errors class="text-danger" path="make"></spr:errors>
		</div><br>
		<spr:button class="btn btn-secondary">Add</spr:button>
	</spr:form>
</body>
</html>