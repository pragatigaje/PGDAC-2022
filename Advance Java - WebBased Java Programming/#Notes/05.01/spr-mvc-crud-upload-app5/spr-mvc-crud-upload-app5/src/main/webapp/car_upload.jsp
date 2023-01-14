<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload Page</title>
</head>
<body>
	<form action="car_upload.htm" method="post" enctype="multipart/form-data" >
		<input type="hidden" name="id" value="<%=request.getParameter("id")%>" >
		<div>
			<label>Select Image</label>
			<input type="file" name="image" >
		</div>
		<button type="submit">Upload</button>
	</form>
</body>
</html>