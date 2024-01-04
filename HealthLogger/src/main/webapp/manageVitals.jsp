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
<form action="VitalsController" method="get">
<input type="hidden" name="operation" value="addVitals">
<input type="submit" value="Add Vitals" class="btn btn-info"><br>
</form>
<form action="vitalAlerts.jsp">
<input type="submit" value="List Of Vitals" class="btn btn-danger"><br>
</form>
</div>
</body>
</html>