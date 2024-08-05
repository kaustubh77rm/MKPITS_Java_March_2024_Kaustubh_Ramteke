package bankservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/BankJava1")
public class BankJava1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public BankJava1() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        String useridStr = request.getParameter("userid");
        String password = request.getParameter("password");
        String action = request.getParameter("action");

        if (useridStr == null || password == null || useridStr.isEmpty() || password.isEmpty()) {
            pw.println("<p>Userid and password must not be empty</p>");
            return;
        }

        int userid;
        try {
            userid = Integer.parseInt(useridStr);
        } catch (NumberFormatException e) {
            pw.println("<p>Invalid userid format</p>");
            return;
        }

        Connection connection = null;
        PreparedStatement preState = null;
        ResultSet resultSet = null;

        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/world";
            String user = "root";
            String pass = "kprsql";
            connection = DriverManager.getConnection(url, user, pass);

            if (action == null) {
                String sql = "SELECT * FROM acmaster WHERE userid=? AND password=?";
                preState = connection.prepareStatement(sql);
                preState.setInt(1, userid);
                preState.setString(2, password);

                resultSet = preState.executeQuery();

                if (resultSet.next()) {
                    // Print user details with CSS
                    pw.println("<html><head><title>User Details</title>");
                    pw.println("<style>");
                    pw.println("body { font-family: Arial, sans-serif; background-color: #f0f0f0; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
                    pw.println(".user-details { background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); width: 300px; text-align: center; }");
                    pw.println(".user-details h1 { font-size: 24px; margin-bottom: 20px; }");
                    pw.println(".user-details p { margin: 10px 0; }");
                    pw.println(".button { margin-top: 10px; padding: 10px 20px; font-size: 16px; color: #fff; border: none; border-radius: 4px; cursor: pointer; }");
                    pw.println(".button.deposit { background-color: #28a745; }");
                    pw.println(".button.deposit:hover { background-color: #218838; }");
                    pw.println(".button.withdraw { background-color: #dc3545; }");
                    pw.println(".button.withdraw:hover { background-color: #c82333; }");
                    pw.println(".button.transfer { background-color: #17a2b8; }");
                    pw.println(".button.transfer:hover { background-color: #138496; }");
                    pw.println(".button.statement { background-color: #ffc107; color: #000; }");
                    pw.println(".button.statement:hover { background-color: #e0a800; }");
                    pw.println(".button.logout { background-color: #dc3545; }");
                    pw.println(".button.logout:hover { background-color: #c82333; }");
                    pw.println("</style></head><body>");
                    pw.println("<div class='user-details'>");
                    pw.println("<h1>User Details</h1>");
                    pw.println("<p><strong>User ID:</strong> " + resultSet.getInt("userid") + "</p>");
                    pw.println("<p><strong>Name:</strong> " + resultSet.getString("name") + "</p>");
                    pw.println("<p><strong>Address:</strong> " + resultSet.getString("address") + "</p>");
                    pw.println("<p><strong>City:</strong> " + resultSet.getString("city") + "</p>");
                    pw.println("<p><strong>Balance:</strong> " + resultSet.getBigDecimal("balance") + "</p>");
                    pw.println("<form method='post' action='BankJava1'>");
                    pw.println("<input type='hidden' name='userid' value='" + userid + "' />");
                    pw.println("<input type='hidden' name='password' value='" + password + "' />");
                    pw.println("<input type='number' name='amount' placeholder='Amount'/>");
                    pw.println("<input type='submit' name='action' value='Deposit' class='button deposit' />");
                    pw.println("<input type='submit' name='action' value='Withdraw' class='button withdraw' />");
                    pw.println("<input type='submit' name='action' value='Transfer' class='button transfer' />");
                    pw.println("<input type='submit' name='action' value='Statement' class='button statement' />");
                    pw.println("<input type='submit' name='action' value='Logout' class='button logout' />");
                    pw.println("</form>");
                    pw.println("</div>");
                    pw.println("</body></html>");
                    
                } else {
                    pw.println("<p>Invalid userid or password</p>");
                }
            } else {
                // Handle different actions
                if (action.equals("Transfer")) {
                    handleTransfer(request, response, connection, userid, password);
                } else if (action.equals("Statement")) {
                    handleStatement(request, response, connection, userid, password);
                } else if (action.equals("Logout")) {
                    pw.println("<p>You have been logged out. <a href='landing_page.html'>Login again</a></p>");
                } else {
                    pw.println("<p>Invalid action</p>");
                }
            }
        } catch (Exception e) {
            pw.println("<p>Error in database connection: " + e.getMessage() + "</p>");
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preState != null) preState.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                pw.println("<p>Error closing resources: " + e.getMessage() + "</p>");
            }
        }
    }

    private void handleTransfer(HttpServletRequest request, HttpServletResponse response, Connection connection, int userid, String password) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        String recipientStr = request.getParameter("recipient");
        String amountStr = request.getParameter("amount");

        if (recipientStr == null || amountStr == null || recipientStr.isEmpty() || amountStr.isEmpty()) {
            pw.println("<p>Recipient and amount must not be empty</p>");
            return;
        }

        int recipient;
        BigDecimal amount;
        try {
            recipient = Integer.parseInt(recipientStr);
            amount = new BigDecimal(amountStr);
        } catch (NumberFormatException e) {
            pw.println("<p>Invalid input format</p>");
            return;
        }

        PreparedStatement preState = null;
        ResultSet resultSet = null;

        try {
            // Check sender's balance
            String sql = "SELECT balance FROM acmaster WHERE userid=? AND password=?";
            preState = connection.prepareStatement(sql);
            preState.setInt(1, userid);
            preState.setString(2, password);
            resultSet = preState.executeQuery();

            if (resultSet.next()) {
                BigDecimal currentBalance = resultSet.getBigDecimal("balance");
                if (amount.compareTo(currentBalance) > 0) {
                    pw.println("<p>Insufficient funds</p>");
                    return;
                }

                // Check recipient's existence
                sql = "SELECT balance FROM acmaster WHERE userid=?";
                preState = connection.prepareStatement(sql);
                preState.setInt(1, recipient);
                resultSet = preState.executeQuery();

                if (!resultSet.next()) {
                    pw.println("<p>Recipient does not exist</p>");
                    return;
                }

                // Perform transfer
                BigDecimal recipientBalance = resultSet.getBigDecimal("balance");
                BigDecimal newSenderBalance = currentBalance.subtract(amount);
                BigDecimal newRecipientBalance = recipientBalance.add(amount);

                // Update sender's balance
                sql = "UPDATE acmaster SET balance=? WHERE userid=? AND password=?";
                preState = connection.prepareStatement(sql);
                preState.setBigDecimal(1, newSenderBalance);
                preState.setInt(2, userid);
                preState.setString(3, password);
                preState.executeUpdate();

                // Update recipient's balance
                sql = "UPDATE acmaster SET balance=? WHERE userid=?";
                preState = connection.prepareStatement(sql);
                preState.setBigDecimal(1, newRecipientBalance);
                preState.setInt(1, recipient);
                preState.executeUpdate();

                pw.println("<p>Transfer successful</p>");
                pw.println("<p>New Balance: " + newSenderBalance + "</p>");
                pw.println("<a href='BankJava1?userid=" + userid + "&password=" + password + "'>Refresh</a>");
            } else {
                pw.println("<p>Invalid userid or password</p>");
            }
        } catch (Exception e) {
            pw.println("<p>Error in database connection: " + e.getMessage() + "</p>");
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preState != null) preState.close();
            } catch (Exception e) {
                pw.println("<p>Error closing resources: " + e.getMessage() + "</p>");
            }
        }
    }

    private void handleStatement(HttpServletRequest request, HttpServletResponse response, Connection connection, int userid, String password) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();

        try {
            // Retrieve transaction history (assuming there's a transactions table)
            String sql = "SELECT * FROM transactions WHERE userid=? ORDER BY date DESC";
            PreparedStatement preState = connection.prepareStatement(sql);
            preState.setInt(1, userid);
            ResultSet resultSet = preState.executeQuery();

            // Print transactions
            pw.println("<html><head><title>Transaction Statement</title>");
            pw.println("<style>");
            pw.println("body { font-family: Arial, sans-serif; background-color: #f0f0f0; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
            pw.println(".statement { background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); width: 400px; text-align: center; }");
            pw.println(".statement h1 { font-size: 24px; margin-bottom: 20px; }");
            pw.println(".statement table { width: 100%; border-collapse: collapse; margin-bottom: 20px; }");
            pw.println(".statement table, .statement th, .statement td { border: 1px solid #ddd; }");
            pw.println(".statement th, .statement td { padding: 8px; text-align: left; }");
            pw.println(".statement th { background-color: #f2f2f2; }");
            pw.println("</style></head><body>");
            pw.println("<div class='statement'>");
            pw.println("<h1>Transaction Statement</h1>");
            pw.println("<table>");
            pw.println("<tr><th>Date</th><th>Type</th><th>Amount</th><th>Balance</th></tr>");

            while (resultSet.next()) {
                pw.println("<tr>");
                pw.println("<td>" + resultSet.getDate("date") + "</td>");
                pw.println("<td>" + resultSet.getString("type") + "</td>");
                pw.println("<td>" + resultSet.getBigDecimal("amount") + "</td>");
                pw.println("<td>" + resultSet.getBigDecimal("balance") + "</td>");
                pw.println("</tr>");
            }

            pw.println("</table>");
            pw.println("</div>");
            pw.println("</body></html>");
        } catch (Exception e) {
            pw.println("<p>Error retrieving transactions: " + e.getMessage() + "</p>");
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (Exception e) {
                pw.println("<p>Error closing resources: " + e.getMessage() + "</p>");
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}