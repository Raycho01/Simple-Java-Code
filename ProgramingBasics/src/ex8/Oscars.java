package ex8;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int jury = Integer.parseInt(scanner.nextLine());
        double points = academyPoints;

        for (int i = 0; i < jury; i++){

            String person = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());

            points = points + ((person.length() * juryPoints) / 2);

            if (points > 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, points);
                break;
            }

        }

        if (points <= 1250.5){
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - points);
        }

    }
}
