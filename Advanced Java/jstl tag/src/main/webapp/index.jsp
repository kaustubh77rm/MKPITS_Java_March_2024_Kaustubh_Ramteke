<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL forEach Example</title>
</head>
<body>
    <c:forEach var="i" begin="1" end="5">
        Item <c:out value="${i}"/><p>
    </c:forEach>
</body>
</html>