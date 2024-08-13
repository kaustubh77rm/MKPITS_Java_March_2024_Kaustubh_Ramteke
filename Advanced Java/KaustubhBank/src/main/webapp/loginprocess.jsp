<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Options</title>
</head>
<body>
<jsp:useBean id="log" class="acc.AccountDAO" scope="session">
<jsp:setProperty name="log" property="email" param="email"/>
<jsp:setProperty name="log" property="password" param="password"/>
</jsp:useBean>
			<% 
			if(log.login())
			{	
				session.setAttribute("accno", log.getAccno());
				response.sendRedirect("operations.jsp");
			}
			else {
				out.println("login failed");
			}
			%>
			<a href="login.jsp">Login </a>            
</body>
</html>