package TextProcessingExc;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double result = 0;

        for (String string : input) {
            char firstLetter = string.toLowerCase().charAt(0);
            char lastLetter = string.toLowerCase().charAt(string.length() - 1);

            int firstPosition = firstLetter - 96;
            int lastPosition = lastLetter - 96;

            String strToNumber = string.substring(1, string.length() - 1);
            double number = Double.parseDouble(strToNumber);

            firstLetter = string.charAt(0);
            lastLetter = string.charAt(string.length() - 1);

            if (Character.isUpperCase(firstLetter)) {
                number /= firstPosition;
            } else {
                number *= firstPosition;
            }

            if (Character.isUpperCase(lastLetter)) {
                number -= lastPosition;
            } else {
                number += lastPosition;
            }

            result += number;
        }

        System.out.printf("%.2f\n", result);

    }
}
