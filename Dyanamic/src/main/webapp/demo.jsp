<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome Ladies & Gentleman!!!!!</h1>
	<% Date d= new Date(); %>
	<h3><%=d %></h3>
	<%Random rd=new Random();%>
	<%Long randomValue=rd.nextLong(); %>
	<h5 style="color:blue"><%=randomValue %></h5>
	
</body>
</html>