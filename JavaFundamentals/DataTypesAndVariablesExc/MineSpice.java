package DataTypesAndVariablesExc;

import java.util.Scanner;

public class MineSpice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spice = Integer.parseInt(scanner.nextLine());
        int storage = 0;
        int consumes = 26;
        int days = 0;

        while (spice >= 100) {
            storage += spice;
            spice -= 10;
            days++;
            storage -= consumes;
        }
        storage -= consumes;

        if (storage < 0) {
            storage = 0;
        }

        System.out.println(days);
        System.out.println(storage);
    }
}
