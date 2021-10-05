package ex1and2Bounus;

import java.util.Scanner;

public class Trapeziod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double result;
        result = (a + b) * h / 2;
        System.out.printf("%.2f", result);
    }
}
