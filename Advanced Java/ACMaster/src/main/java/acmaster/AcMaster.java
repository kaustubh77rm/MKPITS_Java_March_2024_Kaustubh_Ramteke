package acmaster;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AcMaster {
    private int userId;
    private String password;
    private String name;
    private String address;
    private String city;
    private double balance;

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public static void registerDetails(AcMaster a) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/world";
            String root = "root";
            String password = "kprsql";
            connection = DriverManager.getConnection(url, root, password);

            String query = "insert into acmaster (userid, password, name, address, city, balance) VALUES (?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, a.getUserId());
            preparedStatement.setString(2, a.getPassword());
            preparedStatement.setString(3, a.getName());
            preparedStatement.setString(4, a.getAddress());
            preparedStatement.setString(5, a.getCity());
            preparedStatement.setDouble(6, a.getBalance());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            	}
            }
        }

    public static int checklogin(String userId, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/world";
            String root = "root";
            String dbPassword = "kprsql";
            connection = DriverManager.getConnection(url, root, dbPassword);

            String query = "SELECT * FROM acmaster WHERE userid = ? AND password = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, userId);
            preparedStatement.setString(2, password);
            
            resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                return resultSet.getInt(1) > 0 ? 1 : 0; // Returns 1 if user exists, else 0
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0; // Default return value
    }
}