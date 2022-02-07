package ex6;

import java.util.Scanner;

public class SkiVacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String review = scanner.nextLine();

        double discount = 0;
        double price = 0;

        if(room.equals("room for one person")){
            price = (days - 1) * 18.0;
        }
        else if(room.equals("apartment")){
            price = (days - 1) * 25.0;
        }
        else {
            price = (days - 1) * 35.0;
        }

        if(room.equals("apartment") && days < 10){
            discount = 30.0 / 100.0;
        }
        else if(room.equals("apartment") && (days >= 10 && days <= 15)){
            discount = 35.0 / 100.0;
        }
        else if(room.equals("apartment") && days > 15){
            discount = 50.0 / 100.0;
        }
        else if(room.equals("president apartment") && days < 10){
            discount = 10.0 / 100.0;
        }
        else if(room.equals("president apartment") && (days >= 10 && days <= 15)){
            discount = 15.0 / 100.0;
        }
        else if(room.equals("president apartment") && days > 15){
            discount = 20.0 / 100;
        }
        else {
            discount = 0;
        }

        price = price - (price * discount);

        if(review.equals("positive")){
            price = price + (price * 25.0 / 100.0);
        }
        else {
            price = price - (price * 10.0 / 100.0);
        }

        System.out.printf("%.2f", price);

    }
}
