package login;

import java.sql.SQLException;
import java.util.Scanner;

public class DemoLogin implements LoginCapable {

    private MySquelHandler sql;


    public DemoLogin() throws SQLException {
        sql = new MySquelHandler();
    }

    public boolean register(User register) {
       return sql.addUser(register);
    }

    public boolean login(User login) {
        return  sql.loginUser(login);
    }


    public boolean logout() {
        return false;
    }
}
