package ex1;

import java.util.Scanner;

public class HouseGardens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double metres = Double.parseDouble(scanner.nextLine());
        double price = metres * 7.61;
        double discount = price * 0.18;
        price = price - discount;
        System.out.println("The final price is: " + price + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
