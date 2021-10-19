package ex9;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password = scanner.nextLine();
        String enterPassword = scanner.nextLine();

        while(!(password.equals(enterPassword))){
            enterPassword = scanner.nextLine();
        }

        System.out.println("Welcome " + name + "!");

    }
}
