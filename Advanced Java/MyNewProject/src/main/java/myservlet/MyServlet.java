package myservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/sakila";
            String user = "root";
            String password = "kprsql";
            Connection connection = DriverManager.getConnection(url, user, password);

            // Create a statement
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from sd");

            // Generate the HTML table
            pw.println("<table border='2' align='center'>");
            pw.println("<tr><th>RollNo</th><th>Name</th><th>Address</th><th>City</th></tr>");
            while (resultSet.next()) {
                pw.println("<tr>");
                pw.println("<td>" + resultSet.getString(1) + "</td>");
                pw.println("<td>" + resultSet.getString(2) + "</td>");
                pw.println("<td>" + resultSet.getString(3) + "</td>");
                pw.println("<td>" + resultSet.getString(4) + "</td>");
                pw.println("</tr>");
            }
            pw.println("</table>");

            // Close the connection
            connection.close();
        } catch (Exception e) {
            pw.println("Error: " + e.getMessage());
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}