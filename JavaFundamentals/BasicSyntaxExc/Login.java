package BasicSyntaxExc;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstUsername = scanner.nextLine();
        String password = scanner.nextLine();
        int counter = 0;
        boolean flag = true;
        StringBuilder builder = new StringBuilder(firstUsername);
        String username = builder.reverse().toString();

        while (!(username.equals(password))) {
            counter++;
            if (counter > 3) {
                System.out.printf("User %s blocked!", firstUsername);
                flag = false;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            password = scanner.nextLine();
        }

        if (flag) {
            System.out.printf("User %s logged in.", firstUsername);
        }

    }
}
