<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" 
import="java.sql.*, acmaster.Table" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Account Transactions</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1>Account Transactions</h1>
        <%
            String userId = (String) session.getAttribute("userid");
            if (userId != null && !userId.isEmpty()) {
                Connection connection = null;
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;
                
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/world";
                    String root = "root";
                    String dbPassword = "kprsql";
                    connection = DriverManager.getConnection(url, root, dbPassword);

                    String sql = "SELECT t.t_id, t.transdate, t.amount, t.transtype " +
                                 "FROM transactions t " +
                                 "JOIN acmaster a ON t.userid = a.userid " +
                                 "WHERE t.userid = ?";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, userId);
                    resultSet = preparedStatement.executeQuery();

                    if (resultSet.isBeforeFirst()) { // Check if there are any results
                        out.println("<table class='table table-striped'>");
                        out.println("<tr><th>Transaction ID</th><th>Date</th><th>Amount</th><th>Type</th></tr>");
                        
                        while (resultSet.next()) {
                            out.println("<tr>");
                            out.println("<td>" + resultSet.getInt("t_id") + "</td>");
                            out.println("<td>" + resultSet.getTimestamp("transdate") + "</td>");
                            out.println("<td>" + resultSet.getInt("amount") + "</td>");
                            out.println("<td>" + resultSet.getString("transtype") + "</td>");
                            out.println("</tr>");
                        }
                        out.println("</table>");
                    } else {
                        out.println("<div class='alert alert-danger' role='alert'>No transactions found for the given User ID.</div>");
                    }
                } catch (Exception e) {
                    out.println("<div class='alert alert-danger' role='alert'>Error: " + e.getMessage() + "</div>");
                } finally {
                    try {
                        if (resultSet != null) resultSet.close();
                        if (preparedStatement != null) preparedStatement.close();
                        if (connection != null) connection.close();
                    } catch (Exception e) {
                        out.println("<div class='alert alert-danger' role='alert'>Error during resource closure: " + e.getMessage() + "</div>");
                    }
                }
            } 
            else 
            {
                out.println("<div class='alert alert-danger' role='alert'>User ID is not available in the session.</div>");
            }
        %>
    </div>
</body>
</html>