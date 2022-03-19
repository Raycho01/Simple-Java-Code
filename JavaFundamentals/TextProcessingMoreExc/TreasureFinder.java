package TextProcessingMoreExc;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strKey = scanner.nextLine().split(" ");

        int[] key = new int[strKey.length];

        for(int i = 0; i < strKey.length; i ++) {
           key[i] = Integer.parseInt(strKey[i]);
        }

        String input = scanner.nextLine();

        while (!input.equals("find")) {

            int j = 0;
            StringBuilder decrypted = new StringBuilder();

            for (int i = 0; i < input.length(); i ++) {
                char symbol = input.charAt(i);

                if (j == key.length) {
                    j = 0;
                }

                symbol -= key[j];
                j ++;

                decrypted.append(symbol);

            }


            String type = decrypted.substring(decrypted.indexOf("&") + 1, decrypted.lastIndexOf("&"));
            String coordinates = decrypted.substring(decrypted.indexOf("<") + 1, decrypted.lastIndexOf(">"));

            System.out.println("Found " + type + " at " + coordinates);

            input = scanner.nextLine();
        }

    }
}
