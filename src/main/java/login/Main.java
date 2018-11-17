package login;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        try{
            DemoLogin app = new DemoLogin();

        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Startup failed");
        }


    }

}
