<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Process</title>
</head>
<body>

<jsp:useBean id="reg" class="acc.AccountDAO" scope="request">
<jsp:setProperty name="reg" property="*" />
</jsp:useBean>

<%
    if(reg.register()>0)
    {
    	out.println("Registration successful!");
    }
    else{
    	out.println("Registration Failed!");
    }
%>
<button><a href="login.jsp">Login</a></button>
</body>
</html>