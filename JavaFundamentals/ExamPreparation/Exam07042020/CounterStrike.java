package ExamPreparation.Exam07042020;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());

        String line = scanner.nextLine();

        int counter = 0;
        int wonBattles = 0;
        boolean gameOver = false;

        while (!line.equals("End of battle")) {

            int distance = Integer.parseInt(line);

            energy -= distance;

            if (energy < 0) {
                gameOver = true;
                break;
            }

            wonBattles ++;
            counter ++;

            if (counter % 3 == 0) {
                energy += wonBattles;
            }

            line = scanner.nextLine();
        }

        if (gameOver) {
            System.out.println("Not enough energy! Game ends with " + wonBattles + " won battles and 0 energy");
        } else {
            System.out.println("Won battles: " + wonBattles + ". Energy left: " + energy);
        }

    }
}
