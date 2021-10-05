package ex3and4Bonus;

import java.util.Scanner;

public class GrapeToWine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vineyard = Integer.parseInt(scanner.nextLine());
        double grape_by_meter = Double.parseDouble(scanner.nextLine());
        int wine_needed = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double grape;
        double wine;
        double wine_for_workers;

        grape = vineyard * grape_by_meter;

        wine = 0.4 * grape / 2.5;

        if(wine > wine_needed){
            double wine_2 = wine;
            Math.ceil(wine);
            System.out.printf("Good harvest this year! Total wine: %d liters.\n", (int)wine);
            wine_for_workers = wine_2 - wine_needed;
            wine_for_workers = wine_for_workers / workers;
            Math.ceil(wine_for_workers);
            wine = wine_2 - wine_needed;
            Math.ceil(wine);
            System.out.printf("%d liters left -> %d liters per person.", (int)wine, (int)wine_for_workers);
        }
        else{
            wine = wine_needed - wine;
            Math.ceil(wine);
            System.out.printf("It will be a tough winter! More %d liters wine needed.", (int)wine);
        }
    }
}
