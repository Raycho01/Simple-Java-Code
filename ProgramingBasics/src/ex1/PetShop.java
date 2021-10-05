package ex1;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dog_food = Double.parseDouble(scanner.nextLine()) * 2.5;
        int cat_food = Integer.parseInt(scanner.nextLine()) * 4;

        double sum = dog_food + cat_food;

        System.out.println(sum + " lv.");

    }
}
