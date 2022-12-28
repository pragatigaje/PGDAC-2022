<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expense Add</title>
</head>
<body>
	<form action="expense_add.jsp" method="post" >
		<div>
			<label>Item:</label>
			<input type="text" name="item" placeholder="Enter Item Name" >
		</div>
		<div>
			<label>Price:</label>
			<input type="text" name="price" placeholder="Enter Price" >
		</div>
		<div>
			<label>Quantity:</label>
			<input type="text" name="quantity" placeholder="Enter Quantity" >
		</div>
		<div>
			<label>Date:</label>
			<input type="text" name="edate" placeholder="Enter date" >
		</div>
		<button type="submit" >Add</button>
	</form>
</body>
</html>