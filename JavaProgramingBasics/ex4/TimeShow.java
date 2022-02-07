package ex4;

import java.util.Scanner;

public class TimeShow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if(minutes + 15 >= 60){
            minutes = (minutes + 15) - 60;
            hours++;
            if(hours > 23){
                hours = 0;
            }
        }
        else{
            minutes = minutes + 15;
        }

        if(minutes < 10){
            System.out.printf("%d:0%d", hours, minutes);
        }
        else {
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}
