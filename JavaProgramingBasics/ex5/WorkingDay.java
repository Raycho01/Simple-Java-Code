package ex5;

import java.util.Scanner;

public class WorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        switch (day){
            case "Monday":
                System.out.printf("Working day");
                break;
            case "Tuesday":
                System.out.printf("Working day");
                break;
            case "Wednesday":
                System.out.printf("Working day");
                break;
            case "Thursday":
                System.out.printf("Working day");
                break;
            case "Friday":
                System.out.printf("Working day");
                break;
            case "Saturday":
                System.out.printf("Weekend");
                break;
            case "Sunday":
                System.out.printf("Weekend");
                break;
            default:
                System.out.printf("Error");
        }
    }
}
