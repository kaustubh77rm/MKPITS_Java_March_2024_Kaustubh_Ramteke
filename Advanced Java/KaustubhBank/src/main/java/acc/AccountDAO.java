package acc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountDAO {

	private int accno;
	private String name; 
	private String address;
	private String city;
	private String phone_number;
	private double balance;
	private String email;
	private String password;
	
	public AccountDAO() {}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int register() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int r=0;
        try {
            String url = "jdbc:mysql://localhost:3306/bank";
            String root = "root";
            String db_password = "kprsql";
            connection = DriverManager.getConnection(url, root, db_password);

            String query = "insert into accountholdermaster (name, address, city, phone_number, balance, email, password) values (?,?,?,?,0.0,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, address);
            preparedStatement.setString(3, city);
            preparedStatement.setString(4, phone_number);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, password);
            r=preparedStatement.executeUpdate();            
        } 
        catch (Exception e) {
            System.out.println(e);
        } 
        return r;
        }
	
	public boolean login() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        boolean flag=false;
        try {
            String url = "jdbc:mysql://localhost:3306/bank";
            String root = "root";
            String db_password = "kprsql";
            connection = DriverManager.getConnection(url, root, db_password);

            String query = "select accno from accountholdermaster where email = ? and password = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
	        	accno = rs.getInt("accno");
                flag=true;
            }}
         
        catch (Exception e) {
            System.out.println(e);
        } 
        return flag;
    }
}