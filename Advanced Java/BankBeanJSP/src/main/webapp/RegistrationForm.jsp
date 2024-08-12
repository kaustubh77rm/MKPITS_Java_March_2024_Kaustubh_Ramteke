<%@ page import="bank1.RegistrationPage" %>
<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer Registration</title>
    
</head>
<body>
    <h2>Customer Registration Form</h2>
    <form action="RegistrationForm.jsp" method="post">
        <table>
            <tr>
                <td>Customer ID:</td>
                <td><input type="text" name="customerid" required></td>
            </tr>
            <tr>
                <td>First Name:</td>
                <td><input type="text" name="firstname" required></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><input type="text" name="lastname" required></td>
            </tr>
            <tr>
                <td>Date of Birth:</td>
                <td><input type="date" name="dateofbirth" required></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="email" name="email" required></td>
            </tr>
            <tr>
                <td>Phone Number:</td>
                <td><input type="text" name="phonenumber" required pattern="\d{10}"></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="text" name="address" required></td>
            </tr>
            <tr>
                <td>City:</td>
                <td><input type="text" name="city" required></td>
            </tr>
            <tr>
                <td>State:</td>
                <td><input type="text" name="state" required></td>
            </tr>
            <tr>
                <td>Zip Code:</td>
                <td><input type="text" name="zipcode" required></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Register"></td>
            </tr>
        </table>
    </form>

    <% 
        if ("POST".equalsIgnoreCase(request.getMethod())) {
            try {
                int customerid = Integer.parseInt(request.getParameter("customerid"));
                String firstname = request.getParameter("firstname");
                String lastname = request.getParameter("lastname");
                String dateofbirth = request.getParameter("dateofbirth");
                String email = request.getParameter("email");
                String phonenumber = request.getParameter("phonenumber");  // Changed to String
                String address = request.getParameter("address");
                String city = request.getParameter("city");
                String state = request.getParameter("state");
                String zipcode = request.getParameter("zipcode");

                RegistrationPage reg = new RegistrationPage(customerid, firstname, lastname, dateofbirth, email, phonenumber, address, city, state, zipcode);
                RegistrationPage.registerData(reg);

                out.println("Registration Successful!");
            } catch (Exception e) {
                out.println("Registration Failed: " + e.getMessage());
            }
        }
    %>
</body>
</html>