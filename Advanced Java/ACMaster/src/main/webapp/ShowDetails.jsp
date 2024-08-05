<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Details</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f8f9fa;
    }
    .container {
        max-width: 800px;
        margin: 50px auto;
        padding: 20px;
        border: 1px solid #dee2e6;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        background-color: #ffffff;
        text-align: center;
    }
    h1 {
        margin-bottom: 20px;
        color: #343a40;
    }
    table {
        width: 100%;
        border-collapse: collapse;
        margin-bottom: 20px;
    }
    table, th, td {
        border: 1px solid #dee2e6;
    }
    th, td {
        padding: 15px;
        text-align: left;
    }
    th {
        background-color: #f1f1f1;
    }
    .btn-custom {
        font-size: 18px;
        padding: 10px 20px;
        background-color: #007bff;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        margin: 10px;
    }
    .btn-custom:hover {
        background-color: #0056b3;
    }
    .footer-btns {
        display: flex;
        justify-content: space-around;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Account Details</h1>
   
        <div class="footer-btns">
        	<form action="tableofdetails.jsp" method="get">
                <button type="submit" class="btn-custom">Transactions Table</button>
            </form>
            <form action="deposit.jsp" method="get">
                <button type="submit" class="btn-custom">Deposit</button>
            </form>
            <form action="withdrawal.jsp" method="get">
                <button type="submit" class="btn-custom">Withdrawal</button>
            </form>
            <form action="accountdetails.jsp" method="get">
                <button type="submit" class="btn-custom">Login Page</button>
            </form>
      
        </div>
    </div>
</body>
</html>