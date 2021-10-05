package ex2;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dollars = Double.parseDouble(scanner.nextLine());
        double bgn = dollars * 1.79549;
        System.out.println(bgn);
    }
}
