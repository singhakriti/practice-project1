<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<head>
<meta charset="ISO-8859-1">
<title>Patient Manager</title>
</head>
<body>
<div class="container">
<h2>Health Logger</h2>

<form action="PatientController" method="post" class="form-group">  
<input type="hidden" name="operation" value="add">
<label>Name</label>
<input type="text" name="name" class="form-control"><br/>
<label>Email</label>
<input type="email" name="email" class="form-control"><br/>
<label>Phone</label>
<input type="tel" name="phone" class="form-control"><br/>
<label>Age</label>
<input type="number" name="age" class="form-control"><br/>
<label>Diagnosis</label>
<input type="text" name="diagnosis" class="form-control"><br/>
<label>Remark</label>
<input type="text" name="remark" class="form-control"><br/>
<label>Gender </label>
<br>
  <input  type="radio" id="gender" name="gender" value="Male">
  <label for="gender">Male</label> <br>
  <input  type="radio" id="gender" name="gender" value="Female">
  <label for="gender">Female</label><br>
  <br> 

<input type="submit" value="submit" class="btn btn-success"/>
</form>
</div>
</body>
</html>