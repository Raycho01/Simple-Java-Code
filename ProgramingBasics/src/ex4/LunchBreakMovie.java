package ex4;

import java.util.Scanner;

public class LunchBreakMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int time_for_episode = Integer.parseInt(scanner.nextLine());
        int time_of_break = Integer.parseInt(scanner.nextLine());
        double time;
        double time_needed;

        time_needed = time_of_break * 0.125;
        time_needed = time_needed + (time_of_break * 0.25);

        time = time_of_break;
        time = time - time_needed;

        if(time >= time_for_episode){
            time = time - time_for_episode;
            time = Math.ceil(time);
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.", name, (int)time);
        }
        else{
            time = time_for_episode - time;
            time = Math.ceil(time);
            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.", name, (int)time);
        }
    }
}
