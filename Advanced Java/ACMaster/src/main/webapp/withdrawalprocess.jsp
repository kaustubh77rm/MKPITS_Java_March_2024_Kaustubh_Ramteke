<%@ page import="acmaster.Withdrawal" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Withdrawal Process</title>
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
            int withdrawalAmount = 0;

            try {
                withdrawalAmount = Integer.parseInt(request.getParameter("withdrawal"));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                out.println("<center><h1>Invalid amount format</h1>");
                out.println("<h2><a href='withdrawal.jsp'>Try Again</a></h2></center>");
                return;
            }

            Withdrawal withdrawal = new Withdrawal();
            withdrawal.setUserid(userid);
            withdrawal.setAmount(withdrawalAmount);

            int value = Withdrawal.withdrawMoney(withdrawal);
            if (value > 0) {
                out.println("<center><h1>Amount withdrawn successfully</h1>");
            } else {
                out.println("<center><h1>Error occurred during the withdrawal process</h1>");
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