package BasicSyntaxLab;

import java.util.Scanner;

public class ThirtyMins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();
        int mins = scanner.nextInt();

        mins += 30;

        if (mins >= 60) {
            hours++;
            mins -= 60;
        }

        if (hours > 23) {
            hours -= 24;
        }

        System.out.printf("%d:%02d", hours, mins);
    }
}
