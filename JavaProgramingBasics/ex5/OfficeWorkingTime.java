package ex5;

import java.util.Scanner;

public class OfficeWorkingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if(day.equals("Sunday") || hour < 10 || hour > 18){
            System.out.printf("closed");
        }
        else {
            System.out.printf("open");
        }
    }
}
