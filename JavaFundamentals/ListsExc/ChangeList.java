package ListsExc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!(input.equals("end"))) {

            String[] command = input.split(" ");

            if (command[0].equals("Delete")) {
                Integer integer = Integer.parseInt(command[1]);
                while (numbers.remove(integer));

            }
            else {
                numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
            }

            input = scanner.nextLine();

        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }


    }
}
