package acmaster;

import java.sql.*;

public class Withdrawal {
    private int userid;
    private int amount;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static int withdrawMoney(Withdrawal withdrawal) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int result = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/world";
            String root = "root";
            String dbPassword = "kprsql";
            connection = DriverManager.getConnection(url, root, dbPassword);

            String query = "UPDATE acmaster SET balance = balance - ? WHERE userid = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, withdrawal.getAmount());
            preparedStatement.setInt(2, withdrawal.getUserid());

            result = preparedStatement.executeUpdate();
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
        return result;
    }
}