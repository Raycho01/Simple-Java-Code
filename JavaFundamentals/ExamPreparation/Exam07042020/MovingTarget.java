package ExamPreparation.Exam07042020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        List<Integer> targets = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            targets.add(Integer.parseInt(line[i]));
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] commands = input.split(" ");

            String typeCommand = commands[0];
            int index = Integer.parseInt(commands[1]);

            if (index < 0 || index >= targets.size()) {
                if (typeCommand.equals("Add")) {
                    System.out.println("Invalid placement!");
                }
                break;
            }

            switch (typeCommand) {
                case "Shoot":
                    int power = Integer.parseInt(commands[2]);
                    targets.set(index, targets.get(index) - power);
                    if (targets.get(index) <= 0) {
                        targets.remove(index);
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(commands[2]);
                    targets.add(index, value);
                    break;
                case "Strike":
                    int radius = Integer.parseInt(commands[2]);
                    if (index + radius < targets.size() && index - radius >= 0) {
                        int j = index - 1;
                        for (int i = index; i <= index + radius; i++) {
                            if (j >= index - radius) {
                                targets.set(j, -1);
                                j --;
                            }
                            targets.set(i, -1);
                        }
                        for (int i = 0; i < targets.size(); i++) {
                            if (targets.get(i) == -1) {
                                targets.remove(i);
                                i --;
                            }
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < targets.size(); i ++) {
            if (i == targets.size() - 1) {
                System.out.print(targets.get(i));
            } else {
                System.out.print(targets.get(i) + "|");
            }
        }


    }
}
