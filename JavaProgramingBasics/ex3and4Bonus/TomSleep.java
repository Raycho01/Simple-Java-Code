package ex3and4Bonus;

import java.util.Scanner;

public class TomSleep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rest_days = Integer.parseInt(scanner.nextLine());
        int time_for_playing;
        int hours;
        int minutes;

        time_for_playing = (365 - rest_days) * 63;
        time_for_playing = time_for_playing + (rest_days * 127);

        if(time_for_playing > 30000){

            time_for_playing = time_for_playing - 30000;
            hours = time_for_playing / 60;
            minutes = time_for_playing % 60;

            if(time_for_playing < 60){
                hours = 0;
            }

            if(minutes < 10){
                System.out.printf("Tom will run away \n%d hours and 0%d minutes more for play", hours, minutes);
            }
            else{
                System.out.printf("Tom will run away \n%d hours and %d minutes more for play", hours, minutes);
            }
        }
        else{

            time_for_playing = 30000 - time_for_playing;
            hours = time_for_playing / 60;
            minutes = time_for_playing % 60;

            if(time_for_playing < 60){
                hours = 0;
            }

            if(minutes < 10){
                System.out.printf("Tom sleeps well \n%d hours and 0%d minutes less for play", hours, minutes);
            }
            else{
                System.out.printf("Tom sleeps well \n%d hours and %d minutes less for play", hours, minutes);
            }

        }
    }
}
