<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<%!public void jspInit() {
		String defaultUser = getServletConfig().getInitParameter("defaultUser");
		ServletContext context = getServletContext();
		context.setAttribute("defaultUser", defaultUser);
	}%>
<body>

	Default user from the server config is:
	<%=getServletConfig().getInitParameter("defaultUser")%>
	The valus in the servlet Context is:
	<%=getServletContext().getAttribute("defaultUser")%>

</body>
</html>