package ex10;

import java.util.Scanner;

public class WalkingGoal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = Integer.parseInt(scanner.nextLine());
        int goal = 10000;
        String input = "";

        boolean achievedGoal = false;

        while (true){

            goal -= steps;
            if (goal <= 0){
                achievedGoal = true;
                break;
            }

            input = scanner.nextLine();
            if (!(input.equals("Going home"))){
                steps = Integer.parseInt(input);
            }
            else {
                steps = Integer.parseInt(scanner.nextLine());
                goal -= steps;
                if (goal <= 0){
                    achievedGoal = true;
                    break;
                }
                else {
                    break;
                }
            }

        }

        if (achievedGoal){
            System.out.printf("Goal reached! Good job!\n%d steps over the goal!", -(goal));
        }
        else {
            System.out.printf("%d more steps to reach goal.", goal);
        }

    }
}
