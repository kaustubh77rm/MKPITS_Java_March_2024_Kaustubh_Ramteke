<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Tag Example</title>  
</head>  
<body>  
<c:out value="${'Welcome to javaTpoint'}"/>

<c:forEach var = "i" begin = "1" end = "10">
<c:out value = "${i}"/>
</c:forEach>

<c:set var="String" value="Welcome to javatpoint"/>  
  
<c:if test="${fn:contains(String, 'javatpoint')}">  
   <p>Found javatpoint string<p>  
</c:if>  

</body>  
</html>  