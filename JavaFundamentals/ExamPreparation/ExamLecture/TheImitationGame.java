package ExamPreparation.ExamLecture;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder encrypted = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Decode")) {

            String[] command = input.split("\\|");

            switch (command[0]) {
                case "ChangeAll":
                    encrypted = new StringBuilder(encrypted.toString().replaceAll(command[1], command[2]));
                    break;
                case "Insert":
                    if (Integer.parseInt(command[1]) > encrypted.length() || Integer.parseInt(command[1]) < 0) {
                        break;
                    }
                    encrypted.insert(Integer.parseInt(command[1]), command[2]);
                    break;
                case "Move":
                    if (Integer.parseInt(command[1]) > encrypted.length() || Integer.parseInt(command[1]) < 0) {
                        break;
                    }
                    String toBeAdded = encrypted.substring(0, Integer.parseInt(command[1]));
                    String afterRemoved = encrypted.substring(Integer.parseInt(command[1]));
                    encrypted = new StringBuilder(afterRemoved + toBeAdded);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + encrypted);
    }
}
