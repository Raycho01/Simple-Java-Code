package ex1and2Bounus;

import java.util.Scanner;
import java.lang.Math;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double back_and_front_walls;
        double mid_walls;
        double roof_rectangles;
        double roof_triangles;
        double green_paint;
        double red_paint;

        back_and_front_walls = 2 * (x * x);
        back_and_front_walls = back_and_front_walls - (1.2 * 2);

        mid_walls = 2 * (x * y);
        mid_walls = mid_walls - (2 * (1.5 * 1.5));

        roof_rectangles = 2 * (x * y);

        roof_triangles = 2 * (x * h / 2);

        green_paint = (mid_walls + back_and_front_walls) / 3.4;
        red_paint = (roof_rectangles + roof_triangles) / 4.3;

        System.out.printf("%.2f \n", green_paint);
        System.out.printf("%.2f", red_paint);

    }
}
