package ex5;

import java.util.Scanner;

public class TicketShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        switch (day){
            case "Monday":
                System.out.printf("12");
                break;
            case "Tuesday":
                System.out.printf("12");
                break;
            case "Wednesday":
                System.out.printf("14");
                break;
            case "Thursday":
                System.out.printf("14");
                break;
            case "Friday":
                System.out.printf("12");
                break;
            case "Saturday":
                System.out.printf("16");
                break;
            case "Sunday":
                System.out.printf("16");
                break;
            default:
                System.out.printf("Error");
        }
    }
}
