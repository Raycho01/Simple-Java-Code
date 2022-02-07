package preExam;

import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fats = Double.parseDouble(scanner.nextLine());
        double protein = Double.parseDouble(scanner.nextLine());
        double carbs = Double.parseDouble(scanner.nextLine());
        double calories = Double.parseDouble(scanner.nextLine());
        double water = Double.parseDouble(scanner.nextLine());

        fats = (fats/100 * calories) / 9;
        protein = (protein/100 * calories) / 4;
        carbs = (carbs/100 * calories) / 4;

        double food = fats + protein + carbs;

        double caloriesPerGram = calories / food;

        water = 100 - water;

        caloriesPerGram = water/100 * caloriesPerGram;

        System.out.printf("%.4f", caloriesPerGram);

    }
}
