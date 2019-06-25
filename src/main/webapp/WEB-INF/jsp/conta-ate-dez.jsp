<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	Date inicio = new Date();
	long milis = 10000;
	Thread.sleep(milis);
	String result = "comecei a contar as " + inicio + "\ncontei ate " + milis / 1000 + "\nacabei de contar as " + new Date();
	
	%>
	<%=result %>
</body>
</html>