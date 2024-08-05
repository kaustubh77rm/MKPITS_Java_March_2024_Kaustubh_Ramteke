package bankservlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.time.LocalDate;

/**
 * @author kaustubh
 */
@WebServlet(name = "Myservlet2", urlPatterns = {"/Myservlet2"})
public class MyServlet2 extends HttpServlet {

    @SuppressWarnings({ "static-access" })
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	try {
	    PrintWriter printWriter=response.getWriter();
	    
	    HttpSession session=request.getSession(true);
	    String nameString = session.getAttribute("name").toString();
	    String rollnoString=session.getAttribute("rollno").toString();
	  
	  	printWriter.print(rollnoString+"<br/><br/>");
	  	printWriter.println(session.getAttributeNames());
	  	printWriter.print(nameString);
	  	printWriter.println("session creation time"+session.getCreationTime());
	  	printWriter.println("session id"+session.getId());
	  	long timex=session.getCreationTime();
	    String x=(String.valueOf(timex));
	    
		LocalDate localDate=LocalDate.now();
	    printWriter.println("localtime "+localDate.parse(x));
	  
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
	return "Short description";
    }// </editor-fold>
}