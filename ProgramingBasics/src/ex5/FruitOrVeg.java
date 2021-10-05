package ex5;

import java.util.Scanner;

public class FruitOrVeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();

        switch (product){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.printf("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.printf("vegetable");
                break;
            default:
                System.out.printf("unknown");
        }
    }
}
