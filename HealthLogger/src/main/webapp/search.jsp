<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<div class="container">
</head>
<body>

<h2>Doctor Home Page</h2>

 <form action="PatientController" method="get" class="form-group">
 <label>Search Patient</label>
<input type="email" name="email" class="form-control"><br/>
<input type="submit" value="search" class="btn btn-success"/>
</form>
 
<form action="managePatient.jsp">
<input type="submit" value="Add Patients" class="btn btn-danger">
</form>

<form action="doctorHomePage.jsp">
<input type="submit" value="Home" class="btn btn-success"/>
</form>

<a href="doctorHomePage.jsp">Back</a>


</body>
</div>
</html>
