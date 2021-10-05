package ex8;

import java.util.Scanner;

public class TennisTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int wins = 0;

        int points = startingPoints;

        for (int i = 0; i < tournaments; i++){

            String place = scanner.nextLine();

            switch (place){

                case "W":
                    points += 2000;
                    wins++;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;

            }

        }

        double averagePoints = ((points - startingPoints) * 1.0) / tournaments;
        averagePoints = Math.floor(averagePoints);

        double percentWins = wins * 1.0 / tournaments * 100;


        System.out.printf("Final points: %d\n", points);
        System.out.printf("Average points: %.0f\n", averagePoints);
        System.out.printf("%.2f%%\n", percentWins);


    }
}
