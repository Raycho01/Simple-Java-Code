package RegularExpressionsExc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b[A-Za-z0-9][\\w.-]+@[a-z][a-z.-]*\\.[a-z][a-z.-]*\\b");

        String[] input = line.split("\\s+");

        for (int i = 0; i < input.length; i++) {
            Matcher matcher = pattern.matcher(input[i]);
            if (matcher.find()) {
                System.out.println(matcher.group(0));
            }
        }

    }
}
