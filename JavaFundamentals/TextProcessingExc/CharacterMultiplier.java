package TextProcessingExc;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void wordsMultiplier(String firstWord, String secondWord) {

        int length;

        if (firstWord.length() > secondWord.length()) {
            length = secondWord.length();
        }
        else {
            length = firstWord.length();
        }

        int result = 0;

        for (int i = 0; i < length; i ++) {
            result += firstWord.charAt(i) * secondWord.charAt(i);
        }

        if (length == firstWord.length()) {
            for (int i = length; i < secondWord.length(); i ++) {
                result += secondWord.charAt(i);
            }
        } else {
            for (int i = length; i < firstWord.length(); i ++) {
                result += firstWord.charAt(i);
            }
        }

        System.out.println(result);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        wordsMultiplier(words[0], words[1]);
    }
}
