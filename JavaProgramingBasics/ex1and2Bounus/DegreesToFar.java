package ex1and2Bounus;

import java.util.Scanner;

public class DegreesToFar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degrees = Double.parseDouble(scanner.nextLine());
        double result;

        result = (degrees * 1.8) + 32;
        System.out.printf("%.2f", result);
    }
}
