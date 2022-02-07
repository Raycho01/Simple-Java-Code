package BasicSyntaxLab;

import java.util.Scanner;

public class PadwanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        int lightSabersNeeded = (int) Math.ceil(students + (students * 0.1));
        int beltsNeeded = students - (students / 6);

        double moneyNeeded = (lightSabersNeeded * priceLightsabers) + (students * priceRobes) + (beltsNeeded * priceBelts);

        if (money >= moneyNeeded) {
            System.out.printf("The money is enough - it would cost %.2flv.", moneyNeeded);
        }
        else {
            System.out.printf("George Lucas will need %.2flv more.", moneyNeeded - money);
        }
    }
}
