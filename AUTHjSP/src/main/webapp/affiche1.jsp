<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="p1.user" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
user u= new user();
u=(user)(session.getAttribute("user"));
%>
<h1>votre adresse email:<%=u.getMail() %></h1>
<h1>votre mot de pass:<%=u.getPassword() %></h1>
</body>
</html>