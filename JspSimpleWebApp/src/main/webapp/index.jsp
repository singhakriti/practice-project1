<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to Simple Html Page</h2>
<%! int a,b,sum; %>
<%
a=100;
b=200;
int sum=a+b;
System.out.println("Welcome to jsp on console");
out.println("Welcome to Jsp on browser<br/>");
out.println("Sum of two no = "+sum);
out.println("<br/><font color=red>sum of two  number is "+sum+"</font");
%>
<br>
<p>Sum of two number is <%=10+20 %></p>
<font color="orange">Sum of <%=a %> and <%=b %> is <%=sum %></font>
<br/>
<a href="login.jsp"/>Login Page</a>
</body>
</html>