package ExamPreparation.Exam04042020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern emojiPattern = Pattern.compile("(::[A-Z][a-z]{2,}::)|(\\*\\*[A-Z][a-z]{2,}\\*\\*)");
        Pattern numberPattern = Pattern.compile("[0-9]");

        Matcher emojiMatcher = emojiPattern.matcher(input);
        Matcher numberMatcher = numberPattern.matcher(input);

        List<String> emojis = new ArrayList<>();
        int coolness = 0;
        long coolThreshold = 1;

        while (numberMatcher.find()) {
            coolThreshold *= Integer.parseInt(numberMatcher.group());
        }

        int countEmojis = 0;

        while (emojiMatcher.find()) {

            String rawEmoji = emojiMatcher.group();
            String emoji = rawEmoji.substring(2, rawEmoji.length() - 2);
            countEmojis ++;

            for (int i = 0; i < emoji.length(); i++) {
                coolness += emoji.charAt(i);
            }

            if (coolness >= coolThreshold) {
                emojis.add(rawEmoji);
            }

            coolness = 0;

        }

        System.out.println("Cool threshold: " + coolThreshold);
        System.out.print(countEmojis + " emojis found in the text. ");
        System.out.println("The cool ones are:");

        for (String emoji : emojis) {
            System.out.println(emoji);
        }


    }
}
