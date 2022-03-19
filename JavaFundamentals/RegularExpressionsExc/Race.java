package RegularExpressionsExc;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(", ");

        Map<String, Integer> racers = new LinkedHashMap<>(names.length);

        for (String name : names) {
            racers.put(name, 0);
        }

        Pattern pattern = Pattern.compile("(?<nameCharacter>[A-Za-z])|(?<numberToSum>\\d)");

        String input = scanner.nextLine();

        while (!input.equals("end of race")) {
            StringBuilder name = new StringBuilder();
            int distance = 0;
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                if (matcher.group("nameCharacter") != null) {
                    name.append(matcher.group("nameCharacter"));
                } else {
                    distance += Integer.parseInt(matcher.group("numberToSum"));
                }
            }

            Integer potentialDistance = racers.get(name.toString());

            if (potentialDistance != null) {
                racers.put(name.toString(), potentialDistance + distance);
            }

            input = scanner.nextLine();
        }

        Map<String, Integer> result = racers.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        List<String> keys = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            keys.add(entry.getKey());
        }

        Collections.reverse(keys);

        int counter = 1;

        for (String name : keys) {
            switch (counter) {
                case 1:
                    System.out.println("1st place: " + name);
                    break;
                case 2:
                    System.out.println("2nd place: " + name);
                    break;
                case 3:
                    System.out.println("3rd place: " + name);
                    break;
                default:
                    break;
            }
            counter ++;
        }

    }
}
