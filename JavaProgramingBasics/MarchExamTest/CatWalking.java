package MarchExamTest;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mins_walking = Integer.parseInt(scanner.nextLine());
        int num_walks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());
        int burned_calories;
        int all_mins;

        all_mins = mins_walking * num_walks;
        burned_calories = all_mins * 5;

        if(burned_calories >= calories * 0.5){
            System.out.println("Yes, the walk for your cat is enough. Burned calories per day: " + burned_calories + ".");
        }
        else{
            System.out.println("No, the walk for your cat is not enough. Burned calories per day: " + burned_calories + ".");
        }
    }
}
