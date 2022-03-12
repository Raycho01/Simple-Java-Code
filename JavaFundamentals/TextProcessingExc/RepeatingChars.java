package TextProcessingExc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Character> result = new ArrayList<>();
        result.add(input.charAt(0));

        for (int i = 1; i < input.length(); i ++) {
            char currSymbol = input.charAt(i);
            char prevSymbol = input.charAt(i-1);

            if (!(currSymbol == prevSymbol)) {
                result.add(currSymbol);
            }
        }

        for (Character usedSymbol : result) {
            System.out.print(usedSymbol);
        }

    }
}
