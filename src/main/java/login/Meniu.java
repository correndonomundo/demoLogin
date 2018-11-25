package login;

import java.util.Scanner;

public class Meniu {

    Scanner scan = new Scanner(System.in);
    private boolean quit = false;
    String userOption= "";



    public boolean runMenu() {

        while(!quit){
            System.out.println("introdu 1 pentru register, 2 pentru login sau 3 pentru iesire");
            userOption = scan.next();
            switch(userOption){
                case "r":
                    System.out.println("register");
                    break;
                case "l":
                    System.out.println("login");


            }
        }
        return true;
    }

}
