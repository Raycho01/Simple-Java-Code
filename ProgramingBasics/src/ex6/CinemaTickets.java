package ex6;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double money = 0;

        if(type.equals("Premiere")){
            money = rows * columns * 12;
        }
        else if(type.equals("Normal")){
            money = rows * columns * 7.5;
        }
        else if(type.equals("Discount")){
            money = rows * columns * 5;
        }
        else{
            System.out.println("Error.");
        }
        System.out.println(money);
    }
}
