package ex1and2Bounus;

import java.util.Scanner;

public class WeatherPrognosePart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degrees = Double.parseDouble(scanner.nextLine());

        if(degrees >= 26 && degrees <= 35){
            System.out.printf("Hot");
        }
        else if(degrees < 26 && degrees > 20){
            System.out.printf("Warm");
        }
        else if(degrees <= 20 && degrees >= 15){
            System.out.printf("Mild");
        }
        else if(degrees < 15 && degrees >= 12){
            System.out.printf("Cool");
        }
        else if(degrees < 12 && degrees >= 5){
            System.out.printf("Cold");
        }
        else{
            System.out.printf("unknown");
        }
    }
}
