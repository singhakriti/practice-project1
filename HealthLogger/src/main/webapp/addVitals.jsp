<%@page import="com.healthcare.entity.Patient"%>
<%@page import="java.util.List"%>
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
<h2>Health Logger</h2>
<!--  <form action="listOfVitals.jsp">-->
<form action="manageVitals.jsp">
<input type="submit" value="Home" class="btn btn-success"/><br/>
</form>
<form action="VitalController" method="post">
<input type="hidden" name="operation" value="addVitals">
    <label>Patient</label><br>
    <select name="patient">
    	<%
		Object obj = session.getAttribute("listPatients");
		List<Patient> listOfPatient = (List<Patient>)obj;
		for(Patient p: listOfPatient){
			%>
			<option value=<%=p.getEmail() %>><%=p.getName() %></option>
			<%
		}
		
			%>
    </select><br><br>
<label>BP Low</label>
<input type="number" name="bplow" class="form-control"><br/>
<label>BP High</label>
<input type="number" name="bphigh" class="form-control"><br/>
<label>SPO2</label>
<input type="number" name="spo2" class="form-control"><br/>
<input type="submit" value="submit" class="btn btn-success"/>
</form>
<a href="adminHome.jsp">Back</a>

</body>
</html>