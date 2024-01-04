<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.sql.*;"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String emailid,password; %>
<%
emailid =request.getParameter("emailid");
password =request.getParameter("pass");
//RequestDispatcher rd1=request.getRequestDispatcher("home.jsp");
//RequestDispatcher rd2=request.getRequestDispatcher("login.jsp");
if(emailid.equals("akriti@gmail.com") && password.equals("123")){
	out.println("Login Successfully");
	//rd1.forward(request, response);
	%>
	<jsp:forward page="home.jsp"></jsp:forward>
	<%
	
}else{
	out.println(" Failure Try once again");
	//rd2.include(request, response);
	%>
	<jsp:forward page="login.jsp"></jsp:forward>
	<%
}
%>
</body>
</html>