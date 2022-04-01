package ExamPreparation.Exam07042020;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        int[] targets = new int[line.length];

        for (int i = 0; i < line.length; i++) {
            targets[i] = Integer.parseInt(line[i]);
        }

        String command = scanner.nextLine();

        int shotTargets = 0;

        while (!command.equals("End")) {

            int target = Integer.parseInt(command);

            if (target >= 0 && target < targets.length) {

                shotTargets ++;
                int indicator = targets[target];

                for (int i = 0; i < targets.length; i++) {
                    if (targets[i] > indicator && targets[i] != -1 && i != target) {
                        targets[i] -= indicator;
                    } else if (targets[i] <= indicator && targets[i] != -1 && i != target){
                        targets[i] += indicator;
                    }
                }

                targets[target] = -1;

            }

            command = scanner.nextLine();
        }

        System.out.print("Shot targets: " + shotTargets + " -> ");

        for (int target : targets) {
            System.out.print(target + " ");
        }


    }
}
