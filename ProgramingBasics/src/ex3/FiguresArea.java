package ex3;

import java.util.Scanner;

public class FiguresArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        switch (figure){

            case "square":
                double a = Double.parseDouble(scanner.nextLine());
                double area_1 = a * a;
                System.out.printf("%.3f", area_1);
                break;
            case "rectangle":
                double b = Double.parseDouble(scanner.nextLine());
                double c = Double.parseDouble(scanner.nextLine());
                double area_2;
                area_2 = c * b;
                System.out.printf("%.3f", area_2);
                break;
            case "circle":
                double d = Double.parseDouble(scanner.nextLine());
                double area_3;
                area_3 = Math.PI * d * d;
                System.out.printf("%.3f", area_3);
                break;
            case "triangle":
                double e = Double.parseDouble(scanner.nextLine());
                double f = Double.parseDouble(scanner.nextLine());
                double area_4;
                area_4 = (e * f) / 2;
                System.out.printf("%.3f", area_4);
        }
    }
}
