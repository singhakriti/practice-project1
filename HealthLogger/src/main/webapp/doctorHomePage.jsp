<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h2>Doctor Home Page</h2>

		<form action="managePatient.jsp">
			<input type="submit" value="Add Patients" class="btn btn-warning"><br>
		</form>

		<form action="search.jsp">
			<input type="submit" value="Search Patients" class="btn btn-info"><br>
		</form>

		<form action="manageVitals.jsp">
			<input type="submit" value="Manage Vitals" class="btn btn-success">
			<a href="adminHomePage.jsp">Back</a>
		</form>
	</div>
	
</body>
</html>