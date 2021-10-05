package ex1and2Bounus;

import java.util.Scanner;

public class FruitsEuro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double veg_price = Double.parseDouble(scanner.nextLine());
        double fruits_price = Double.parseDouble(scanner.nextLine());
        double veg_kg = Double.parseDouble(scanner.nextLine());
        double fruits_kg = Double.parseDouble(scanner.nextLine());
        double result;

        result = (veg_kg * veg_price) + (fruits_kg * fruits_price);
        result = result / 1.94;
        System.out.printf("%.2f", result);
    }
}
