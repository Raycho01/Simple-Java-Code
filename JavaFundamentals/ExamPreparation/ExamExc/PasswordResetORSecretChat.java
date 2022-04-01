package ExamPreparation.ExamExc;

import java.util.Scanner;

public class PasswordResetORSecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {

            String[] command = input.split(":\\|:");

            boolean print = true;

            switch (command[0]) {

                case "InsertSpace":
                    int spaceIndex = Integer.parseInt(command[1]);
                    text.insert(spaceIndex, " ");
                    break;

                case "Reverse":
                    String strToReverse = command[1];
                    int reverseStartIndex = text.indexOf(strToReverse);
                    if (reverseStartIndex != -1) {
                        int reverseEndIndex = reverseStartIndex + strToReverse.length() - 1;
                        StringBuilder reversedStr = new StringBuilder(text.substring(reverseStartIndex, reverseEndIndex)).reverse();
                        text.delete(reverseStartIndex, reverseEndIndex);
                        text.append(reversedStr);
                    } else {
                        System.out.println("error");
                        print = false;
                    }
                    break;

                case "ChangeAll":
                    String strToBeReplaced = command[1];
                    String strToReplaceWith = command[2];
                    text = new StringBuilder(text.toString().replaceAll(strToBeReplaced, strToReplaceWith));
                    break;

            }

            if (print) {
                System.out.println(text);
            }

            input = scanner.nextLine();
        }

        System.out.println("You have a new text message: " + text);

    }
}
