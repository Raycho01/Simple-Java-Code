package ListsExc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        List<String> names = new ArrayList<>();

        for (int i = 0 ; i < commandsCount; i ++) {

            String[] input = scanner.nextLine().split(" ");
            if (input[2].equals("not")) {

                if (names.contains(input[0])) {
                    names.remove(input[0]);
                }
                else {
                    System.out.println(input[0] + " is not in the list!");
                }

            }
            else {

                if (!(names.contains(input[0]))){
                    names.add(input[0]);
                }
                else {
                    System.out.println(input[0] + " is already in the list!");
                }

            }

        }

        for (String name : names) {
            System.out.println(name);
        }

    }
}
