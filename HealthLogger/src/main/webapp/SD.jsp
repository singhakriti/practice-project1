<%@page import="com.healthcare.entity.Patient"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Doctor Home Page</h1>
<form action="managePatient.jsp">
<input type="submit"value="Add Patients"class="btn btn-warning"><br>
</form>
<form action="doctorHomePage.jsp">
<input type="submit" value="Home" class="btn btn-success"/>
</form>
<form action="login.jsp">
<input type="submit" value="Logout" class="btn btn-success"/>
</form>
<table border="1">
	<tr>
		<th>Sr. No.</th>
		<th>Email</th>
		<th>Name</th>
		<th>Phone</th>
		<th>Age</th>
		<th>Diagnosis</th>
		<th>Remark</th>
		<th>Gender</th>
		<th>Action</th>
	</tr>
	<%
		Object obj = session.getAttribute("patients");
	List<Patient> listOfPatient = (List<Patient>)obj;
		Iterator<Patient> li = listOfPatient.iterator();
		int count=1;
		while(li.hasNext()){
			Patient p = li.next();
			%>
			<tr>
			     	     
				<td><%=count++ %></td>
				<td><%=p.getEmail() %></td>
				<td><%=p.getName()%> </td>
				<td><%=p.getPhone()%> </td>
				<td><%=p.getAge() %> </td>
				<td><%=p.getDiagnosis() %> </td>
				<td><%=p.getRemark() %> </td>
				<td><%=p.getGender() %> </td>
				<td>
				
				
				<form action="PatientController" method="post">
						<input type="hidden" name="operation" value="delete">
						<input type="hidden" name="email" value="<%=p.getEmail()%>"/><br/>
						<input type="submit" value="Delete Patient"/>
					</form>
					<form action="update.jsp" >
						<input type="hidden" name="operation" value="Update">
						<input type="hidden" name="email" value="<%=p.getEmail()%>"/><br/>
						<input type="hidden" name="patient" value="<%=p%>"/><br/>
						<input type="submit" value="Update Patient"/>
					</form>
					    <form action="manageVitals.jsp">
						<input type="hidden" name="operation" value="ManageVitals">
						<input type="hidden" name="email" value="<%=p.getEmail()%>"/><br/>
						<input type="submit" value="ManageVitals"/>
					</form>			
					
					
			</tr>
			<%
		}
	%>
</table>
<br/>
<a href="search.jsp">Back</a>

</body>
</html>