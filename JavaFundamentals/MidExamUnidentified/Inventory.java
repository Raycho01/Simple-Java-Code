package MidExamUnidentified;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> items = new ArrayList<String>(List.of(input.split(", ")));

        String command = scanner.nextLine();

        while (!(command.equals("Craft!"))) {
            String[] action = command.split(" - ");

            switch (action[0]) {
                case "Collect":
                    if (!items.contains(action[1])) {
                        items.add(action[1]);
                    }
                    break;
                case "Drop":
                    items.remove(action[1]);
                    break;
                case "Combine Items":
                    String[] combine = action[1].split(":");
                    if (items.contains(combine[0])) {
                        int index = items.indexOf(combine[0]) + 1;
                        items.add(index, combine[1]);
                    }
                    break;
                case "Renew":
                    if (items.contains(action[1])) {
                        items.add(action[1]);
                        items.remove(action[1]);
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < items.size(); i ++) {
            if (i == items.size() - 1) {
                System.out.print(items.get(i));
            }
            else {
                System.out.print(items.get(i) + ", ");
            }
        }


    }
}
