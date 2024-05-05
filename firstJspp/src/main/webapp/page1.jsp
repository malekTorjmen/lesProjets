<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.Date" %>
     <%@page import="java.net.InetAddress" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Nous sommes le <%out.println(new Date()); %></p>
<p>le nom de votre machine: <%out.println(System.getProperty("user.name")); %></p>
<p>votre adresse Ip est <%out.println(InetAddress.getLocalHost().getHostAddress()); %></p>
<p> le nom du serveur sur lequelle vous etes connecte <%out.println(request.getServerName()); %></p>
</body>
</html>