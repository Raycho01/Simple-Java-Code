package MidExamUnidentified;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());

        int[] attendances = new int[students];

        for (int i = 0; i < students; i ++) {
            attendances[i] = Integer.parseInt(scanner.nextLine());
        }

        int maxBonus = 0;
        double tempMaxBonus = 0;
        int maxAttendances = 0;

        for (int i = 0; i < students; i ++) {
            double temp = ((attendances[i] * 1.0) / lectures) * (5 + bonus);
            if (temp > tempMaxBonus) {
                tempMaxBonus = temp;
                maxAttendances = attendances[i];
            }
        }

        maxBonus = (int)Math.ceil(tempMaxBonus);

        System.out.println("Max Bonus: " + maxBonus + ".");
        System.out.println("The student has attended " + maxAttendances + " lectures.");

    }
}
