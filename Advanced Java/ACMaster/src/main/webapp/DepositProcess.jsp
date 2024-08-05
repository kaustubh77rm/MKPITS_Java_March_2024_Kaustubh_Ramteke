<%@ page import="acmaster.Deposit" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Deposit Process</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
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
        h1 {
            margin-bottom: 20px;
        }
        button {
            font-size: 18px;
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            margin-top: 10px;
        }
        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <%
            int userid = Integer.parseInt(request.getParameter("userid"));
            int depositAmount = 0;

            try {
                depositAmount = Integer.parseInt(request.getParameter("deposit"));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                out.println("<center><h1>Invalid amount format</h1>");
                out.println("<h2><a href='deposit.jsp'>Try Again</a></h2></center>");
                return;
            }

            Deposit deposit = new Deposit();
            deposit.setUserid(userid);
            deposit.setAmount(depositAmount);

            int value = Deposit.depositMoney(deposit);
            if (value > 0) {
                out.println("<center><h1>Amount deposited successfully</h1>");
            } else {
                out.println("<center><h1>Error occurred during the deposit process</h1>");
            }
        %>
        <form action="ShowDetails.jsp" method="get">
            <input type="hidden" name="userId" value="<%= userid %>">
            <button type="submit">Back to Details</button>
        </form>
        <form action="accountdetails.jsp" method="get">
            <input type="hidden" name="userId" value="<%= userid %>">
            <button type="submit">Go to Login Page</button>
        </form>
    </div>
</body>
</html>