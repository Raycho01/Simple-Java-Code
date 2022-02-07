package ex4;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time_1 = Integer.parseInt(scanner.nextLine());
        int time_2 = Integer.parseInt(scanner.nextLine());
        int time_3 = Integer.parseInt(scanner.nextLine());

        int minutes;
        int seconds;

        minutes = (time_1 + time_2 + time_3) / 60;
        seconds = (time_1 + time_2 + time_3) % 60;

        if(seconds < 10){
            System.out.printf("%d:0%d", minutes, seconds);
        }
        else {
            System.out.printf("%d:%d", minutes, seconds);
        }

    }
}
