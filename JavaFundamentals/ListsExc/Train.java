package ListsExc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!(input.equals("end"))) {

            String[] command = input.split(" ");

            if (command[0].equals("Add")) {
                numbers.add(Integer.parseInt(command[1]));
            }
            else {
                for (int i = 0; i < numbers.size(); i ++) {
                    if (capacity - numbers.get(i) >= Integer.parseInt(command[0])) {
                        numbers.set(i, numbers.get(i) + Integer.parseInt(command[0]));
                        break;
                    }
                }
            }

            input = scanner.nextLine();

        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }


    }
}
