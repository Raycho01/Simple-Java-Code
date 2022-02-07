package ex6;

import java.util.Scanner;

public class OutfitChooser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String weather = scanner.nextLine();
        String outfit = "";
        String shoes = "";

        if(weather.equals("Morning")){
            if(degrees >= 10 && degrees <= 18){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
                System.out.println("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
            }
            if(degrees > 18 && degrees <= 24){
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.println("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
            }
            if(degrees > 24){
                outfit = "T-Shirt";
                shoes = "Sandals";
                System.out.println("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
            }
        }

        if(weather.equals("Afternoon")){
            if(degrees >= 10 && degrees <= 18){
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.println("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
            }
            if(degrees > 18 && degrees <= 24){
                outfit = "T-Shirt";
                shoes = "Sandals";
                System.out.println("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
            }
            if(degrees > 24){
                outfit = "Swim Suit";
                shoes = "Barefoot";
                System.out.println("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
            }
        }

        if(weather.equals("Evening")){
            if(degrees >= 10 && degrees <= 18){
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.println("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
            }
            if(degrees > 18 && degrees <= 24){
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.println("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
            }
            if(degrees > 24){
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.println("It's " + degrees + " degrees, get your " + outfit + " and " + shoes + ".");
            }
        }

    }
}
