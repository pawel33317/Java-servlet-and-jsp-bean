<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="pl.haks.loginserv.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>

<h3>Login Successful!</h3>

<br>
<%
//User user = (User) session.getAttribute("user"); //teraz nie trzeba pobierac nazwy z sesji bo uzylismy dispatchera

//User user = (User) request.getAttribute("user");  zamiast tego <jsp:useBean ...
%>

<jsp:useBean id="user" class="pl.haks.loginserv.dto.User" scope="request">
<jsp:setProperty property="userName" name="user" value="domyslnaWartoscJakNieBedzieWlasciwosciGetUserName"/>
</jsp:useBean>


<%//=user.getUserName() %>


<!-- wyciagamy ze zmiennej user tag getUserName -->
<br>Hello <jsp:getProperty property="userName" name="user"/>

</body>
</html>