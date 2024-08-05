<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="acmaster.AcMaster" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Process</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            max-width: 600px;
            margin: 50px auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="container">
        <%
            String userId = request.getParameter("userId");
            String password = request.getParameter("password");
            String name = request.getParameter("name");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            double balance = Double.parseDouble(request.getParameter("balance"));

            AcMaster acMaster = new AcMaster();
            acMaster.setUserId(Integer.parseInt(userId));
            acMaster.setPassword(password);
            acMaster.setName(name);
            acMaster.setAddress(address);
            acMaster.setCity(city);
            acMaster.setBalance(balance);

            AcMaster.registerDetails(acMaster);
            out.println("<h3>Registration successful!</h3>");
        %>
        <a href="accountdetails.jsp" class="btn btn-primary">Go to Login Page</a>
    </div>
</body>
</html>