package stud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NamesDAO {
    private int rollno;
    private String name;
    private String address;
    private String city;

    public NamesDAO() {}

    public NamesDAO(int rollno, String name, String address, String city) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
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

    public static void saveDetails(NamesDAO namesDAO) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/sakila";
            String root = "root";
            String password = "kprsql";
            connection = DriverManager.getConnection(url, root, password);

            String query = "INSERT INTO sd (rollno, name, address, city) VALUES (?,?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, namesDAO.getRollno());
            preparedStatement.setString(2, namesDAO.getName());
            preparedStatement.setString(3, namesDAO.getAddress());
            preparedStatement.setString(4, namesDAO.getCity());

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}