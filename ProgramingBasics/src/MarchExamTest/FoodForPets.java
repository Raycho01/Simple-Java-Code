package MarchExamTest;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        double dog = 0;
        double cat = 0;
        double dog_day = 0;
        double cat_day = 0;
        double cookies_day = 0;
        double cookies = 0;
        double food_eaten = 0;
        double food_percent = 0;
        double dog_percent = 0;
        double cat_percent = 0;

        for(int i = 0; i < days; i++){
            dog_day = Double.parseDouble(scanner.nextLine());
            cat_day = Double.parseDouble(scanner.nextLine());
            dog = dog + dog_day;
            cat = cat + cat_day;
            if(i % 3 == 0){
                cookies_day = (cat_day + dog_day) * 0.10;
                cookies = cookies + cookies_day;
            }
        }

        System.out.printf("%f %f %f \n \n \n", dog, cat, cookies);

        System.out.printf("Total eaten biscuits: %dgr. \n", (int) cookies);

        food_eaten = cat + dog;

        food_percent = (food / food_eaten) * 10;

        System.out.printf("%.2f of the food has been eaten. \n", food_percent);

        dog_percent = (food_eaten / dog) * 10;
        cat_percent = (food_eaten / cat) * 10;

        System.out.printf("%.2f eaten from the dog. \n", dog_percent);
        System.out.printf("%.2f eaten from the cat.", cat_percent);

    }
}
