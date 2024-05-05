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
    String mail=request.getParameter("mail");
    String password=request.getParameter("password");
    
    user u=new user();
    u.setMail(mail);
    u.setPassword(password);
    session.setAttribute("user",u);
    response.sendRedirect("affiche1.jsp");
    %>
</body>
</html>