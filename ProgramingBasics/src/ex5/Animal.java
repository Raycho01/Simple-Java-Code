package ex5;

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();

        switch (animal){
            case "dog":
                System.out.printf("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.printf("reptile");
                break;
            default:
                System.out.printf("unknown");
        }
    }
}
