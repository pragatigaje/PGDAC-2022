<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload Photo</title>
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
	<div class="mb-3">
	  <form action="UploadServlet" method="post" enctype="multipart/form-data">
  		  <label for="formFile" class="form-label">Select Image</label>
		  <input class="form-control" type="file" name="image">
		  <br>
		  <button type="submit" class="btn btn-primary mb-3">Upload</button>
	  </form>
	</div>
</body>
</html>