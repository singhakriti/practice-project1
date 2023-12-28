<%@page import="com.healthcare.entity.Patient"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Doctor Home Page</h2>

<form action="PatientController" method="post" class="form-group">  
	<%
		Object obj = session.getAttribute("patient");
	Patient patient = (Patient)obj;
			%>
<input type="hidden" name="operation" value="update">
<label>Name</label>
<input type="text" name="name" class="form-control"><br/>
<label>Email</label>
<input type="email" name="email" value="" class="form-control"><br/>
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
  </form>

<input type="submit" value="update" class="btn btn-success"/>
<br>
</body>
</html>