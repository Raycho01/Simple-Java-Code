package DataTypesAndVariablesExc;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double value = 0;
        double max = 0;
        int snowMax = 0;
        int timeMax = 0;
        int qualityMax = 0;

        for (int i = 0; i < n; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());

            value = Math.pow((snow / (double) time), quality);

            if (value > max) {
                max = value;
                snowMax = snow;
                timeMax = time;
                qualityMax = quality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", snowMax, timeMax , max, qualityMax);
    }
}
