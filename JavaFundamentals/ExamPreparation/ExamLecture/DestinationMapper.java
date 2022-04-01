package ExamPreparation.ExamLecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(=[A-Z]([a-z]|[A-Z])*=)|(\\/[A-Z]([a-z]|[A-Z])*\\/)");

        Matcher matcher = pattern.matcher(input);

        List<String> locations = new ArrayList<>();
        int travelPoints = 0;

        while (matcher.find()) {
            String potential = matcher.group(0);

            potential = potential.substring(1, potential.length()-1);

            if (potential.length() >= 3) {
                travelPoints += potential.length();
                locations.add(potential);
            }

        }

        System.out.print("Destinations: ");

        for (int i = 0; i < locations.size(); i++) {
            if (i == locations.size() - 1) {
                System.out.print(locations.get(i));
            } else {
                System.out.print(locations.get(i) + ", ");
            }
        }

        System.out.println();

        System.out.println("Travel Points: " + travelPoints);


    }
}
