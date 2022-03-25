package ExamPreparation.Exam04042020;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder actKey = new StringBuilder(scanner.nextLine());

        String line = scanner.nextLine();

        while (!line.equals("Generate")) {

            String[] command = line.split(">>>");

            switch (command[0]) {

                case "Contains":

                    if (actKey.toString().contains(command[1])) {
                        System.out.println(actKey + " contains " + command[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":

                    int startIndex = Integer.parseInt(command[2]);
                    int endIndex = Integer.parseInt(command[3]);
                    String toReplace;
                    if (command[1].equals("Upper")) {
                        toReplace = actKey.substring(startIndex, endIndex).toUpperCase();
                    } else {
                        toReplace = actKey.substring(startIndex, endIndex).toLowerCase();
                    }
                    actKey.replace(startIndex, endIndex, toReplace);
                    System.out.println(actKey);
                    break;

                case "Slice":

                    int start = Integer.parseInt(command[1]);
                    int end = Integer.parseInt(command[2]);
                    actKey.delete(start, end);
                    System.out.println(actKey);
                    break;

            }

            line = scanner.nextLine();

        }

        System.out.println("Your activation key is: " + actKey);

    }
}
