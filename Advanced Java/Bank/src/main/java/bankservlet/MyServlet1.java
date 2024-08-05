package bankservlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "MyServlet1", urlPatterns = {"/MyServlet1"})
public class MyServlet1 extends HttpServlet {
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter printWriter = response.getWriter()) {
            HttpSession session = request.getSession(true);
            session.setAttribute("Name", "Roshan");
            session.setAttribute("RollNo", 1);

            printWriter.print("<a href='http://localhost:8082/Bank/MyServlet2.java'>Go to second servlet</a>");
        } catch (Exception e) {
            log("An error occurred: ", e);
        }
    }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "This servlet sets user information in the session and provides a link to the second servlet.";
    }
}