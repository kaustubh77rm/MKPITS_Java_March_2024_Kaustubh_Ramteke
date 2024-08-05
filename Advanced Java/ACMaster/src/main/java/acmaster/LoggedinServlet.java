package acmaster;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoggedinServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");

        int loginStatus = AcMaster.checklogin(userId, password);
        
        if (loginStatus == 1) {
            HttpSession session = request.getSession();
            session.setAttribute("userid", userId); // Ensure this line is executed
            System.out.println("User logged in: " + userId); // Debugging output
            response.sendRedirect("ShowDetails.jsp");
        } else {
            response.sendRedirect("accountdetails.jsp");
        }
    }
}
