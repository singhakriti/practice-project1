<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h2>Health Logger</h2>
<form action="doctorHomePage.jsp">
<input type="submit"value="Manage Patients"class="btn btn-primary">
</form>
<form action="manageVitals.jsp">
 <input type="submit"value="Manage Vitals"class="btn btn-secondary"> 
</form>
</div>
</body>
</html>