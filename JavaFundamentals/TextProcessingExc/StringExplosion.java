package TextProcessingExc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        List<Character> result = new ArrayList<>();

        //  abv>1>1>2>2asdasd

        int index = string.indexOf('>');

        if (index > 0) {

            String startingText = string.substring(0, index);

            for (int i = 0; i < startingText.length(); i++) {
                result.add(startingText.charAt(i));
            }

            string = string.substring(index);

        }

        //  >1>1>2>2asdasd

        int explosion = 0;

        for (int i = 0; i < string.length(); i ++) {
            char symbol = string.charAt(i);

            if (symbol == '>') {
                result.add(symbol);
                explosion += Integer.parseInt(String.valueOf(string.charAt(i + 1)));
            } else {
                if (explosion > 0) {
                    explosion --;
                } else {
                    result.add(symbol);
                }
            }
        }

        for (Character character : result) {
            System.out.print(character);
        }

    }
}
