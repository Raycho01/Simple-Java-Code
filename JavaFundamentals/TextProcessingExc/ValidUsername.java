package TextProcessingExc;

import java.util.Scanner;

public class ValidUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String username : usernames) {
            boolean isValid = true;
            int lengthOfUsername = username.length();
            if (lengthOfUsername < 3 || lengthOfUsername > 16) {
                isValid = false;
            } else {
                for (int i = 0; i < username.length(); i ++) {
                    char symbol = username.toLowerCase().charAt(i);
                    if ((symbol < 97 || symbol > 122) &&
                            symbol != 95 && symbol != 45 &&
                            (symbol < 48 || symbol > 57)) {
                        isValid = false;
                    }
                }
            }

            if (isValid) {
                System.out.println(username);
            }
        }


    }
}
