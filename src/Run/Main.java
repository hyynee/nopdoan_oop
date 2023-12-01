package Run;

import java.util.Scanner;

import MainCore.Menu;

public class Main {
    private static boolean authenticate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("USERNAME: ");
        String username = sc.nextLine();
        System.out.print("PASSWORD: ");
        String password = sc.nextLine();
        return "admin".equals(username) && "admin".equals(password);
    }
    public static void main(String[] args) {
        boolean loggedIn = false;
        do {
            loggedIn = authenticate();
            if (!loggedIn) {
                System.out.println("Username or password is incorrect. Please try again.");
            }
        } while (!loggedIn);
        Menu mainMenu = new Menu();
        mainMenu.mainMenu();
    }
}
