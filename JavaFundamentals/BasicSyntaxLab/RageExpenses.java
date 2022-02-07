package BasicSyntaxLab;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCrashes = lostGames / 2;
        int mouseCrashes = lostGames / 3;
        int keyboardCrashes = lostGames / 6;
        int displayCrashes = keyboardCrashes / 2;

        double rageExpenses = (headsetPrice * headsetCrashes) + (mousePrice * mouseCrashes)
                + (keyboardPrice * keyboardCrashes) + (displayPrice * displayCrashes);

        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
