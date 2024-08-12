<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="stud.Student" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Form</title>
</head>
<body>
    <h1>Student Registration Form</h1>
    <form action="NewFile.jsp" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" ><br><br>
        <label for="marks">Marks:</label>
        <input type="number" id="marks" name="marks" ><br><br>
        <input type="submit" value="Submit">
    </form>
  </body>
</html>