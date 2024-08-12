package bank1;

import java.sql.*;

public class RegistrationPage {
	private	int customerid;
	private String firstname;
	private String lastname;
	private String dateofbirth;
	private String email;
	private String phonenumber;
	private String address;
	private String city;
	private String state;
	private String zipcode;
 
public RegistrationPage(int customerid, String firstname, String lastname, String dateofbirth, String email,
			String phonenumber, String address, String city, String state, String zipcode) {
		
		this.customerid = customerid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateofbirth = dateofbirth;
		this.email = email;
		this.phonenumber = phonenumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(String dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}

public static void registerData(RegistrationPage reg) {
	Connection connection = null;
	PreparedStatement prep = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb","root","kprsql");
		
		String query = "insert into customers (customerid,firstname,lastname,dateofbirth,email,phonenumber,address,city,state,zipcode) values (?,?,?,?,?,?,?,?,?,?)";
        prep = connection.prepareStatement(query);
        prep.setInt(1, reg.getCustomerid());
        prep.setString(2, reg.getFirstname());
        prep.setString(3, reg.getLastname());
        prep.setString(4, reg.getDateofbirth());
        prep.setString(5, reg.getEmail());
        prep.setString(6, reg.getPhonenumber());
        prep.setString(7, reg.getAddress());
        prep.setString(8, reg.getCity());
        prep.setString(9, reg.getState());
        prep.setString(10, reg.getZipcode());

        prep.executeUpdate();
	}
	catch(Exception e) {
		e.printStackTrace();
	}	
  }
}