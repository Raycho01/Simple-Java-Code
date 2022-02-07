package MethodsExc;

import java.util.Scanner;

public class Vowels {

    public static int vowelsCount(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'a'
                    || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                counter ++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(vowelsCount(input));
    }
}
