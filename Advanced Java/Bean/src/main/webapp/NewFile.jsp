<%@ page import="stud.Student" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Details</title>
</head>
<body>
    <h1>Student Details</h1>
    <%
        String name = request.getParameter("name");
        String marks = request.getParameter("marks");
        
        int marks = 0;
        if (marksStr != null && !marksStr.isEmpty()) {
            marks = Integer.parseInt(marksStr);
        }
        
        Student s = new Student();
        s.setName(name);
        s.setMarks(marks);
    %>
    
    <p>Name: <%= s.getName() %></p>
    <p>Marks: <%= s.getMarks() %></p>
    <p>Result: <%= s.getResult() %></p>
</body>
</html>