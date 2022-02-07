package ex7;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        char ch = word.charAt(0);

        for (int i = 0; i < word.length(); i++){
            ch = word.charAt(i);
            System.out.printf("%s \n", ch);
        }
    }
}
