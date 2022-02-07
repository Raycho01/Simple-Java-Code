package DataTypesAndVariablesExc;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhausting = Integer.parseInt(scanner.nextLine());
        int targets = 0;
        int originalPower = power;

        while (power >= distance) {
            power -= distance;
            targets++;
            if (power == originalPower / 2) {
//                if (power % exhausting == 0) {
                    power = power / exhausting;
//                }
            }
        }

        System.out.println(power);
        System.out.println(targets);
    }
}
