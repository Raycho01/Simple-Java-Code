package ex4;

import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time_for_meter = Double.parseDouble(scanner.nextLine());
        double time;
        double slowing;

        time = distance * time_for_meter;

        slowing = distance / 15;
        slowing = Math.floor(slowing);
        slowing = slowing * 12.5;

        time = time + slowing;

        if(time < record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        }
        else{
            time = time - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", time);
        }

    }
}
