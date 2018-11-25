package login;

import java.sql.*;

public class MySquelHandler {

    private Connection dbConnection;

    public MySquelHandler() throws SQLException {
        dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demologin",
                "root",
                "admin");
    }

    public boolean addUser(User userForAdd) {
        String sqlCmdAdd = "INSERT INTO user (username, password, mail)" +
                "VALUES(" + "'" + userForAdd.username + "'" + "," + "'" + userForAdd.email + "'" + "," + "'" + userForAdd.password + "'" + ")";
        boolean DBOpAdd = false;
        try {
            Statement statement = dbConnection.createStatement();
            DBOpAdd = statement.execute(sqlCmdAdd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DBOpAdd;
    }

    public boolean loginUser(User userForLogin) {
        String sqlCmdLogin = "SELECT username, email, password, FROM user WHERE username = " + "'" +
                userForLogin.username + "OR email = " + userForLogin.email;

        boolean DBOpLogin = false;
        try {
            Statement statement = dbConnection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlCmdLogin);
            if (resultSet.next()){
                System.out.println("Login successful!");
                return true;
            }
            else{
                System.out.println("Wrong username/password");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DBOpLogin;
    }
}
