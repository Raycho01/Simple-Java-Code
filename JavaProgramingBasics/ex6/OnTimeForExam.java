package ex6;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int exam_hours = Integer.parseInt(scanner.nextLine());
        int exam_minutes = Integer.parseInt(scanner.nextLine());
        int arrive_hours = Integer.parseInt(scanner.nextLine());
        int arrive_minutes = Integer.parseInt(scanner.nextLine());
        int hours = 0;
        int mins = 0;

        if(arrive_hours > exam_hours){

            hours = arrive_hours - exam_hours;
            if(exam_minutes > arrive_minutes){
                hours--;
                mins = 60 - (exam_minutes - arrive_minutes);
            }
            else if(exam_minutes == arrive_minutes){
                System.out.printf("Late\n%d:00 hours after the start", hours);
            }
            else {
                mins = arrive_minutes - exam_minutes;
            }

            if(hours < 1){
                System.out.printf("Late\n%d minutes after the start", mins);
            }
            else{
                System.out.printf("Late\n%d:%d hours after the start", hours, mins);
            }

        }
        else if(arrive_hours == exam_hours){

            if(arrive_minutes > exam_minutes){
                mins = arrive_minutes - exam_minutes;
                System.out.printf("Late\n%d minutes after the start", mins);
            }
            else if(arrive_minutes < exam_minutes && exam_minutes - arrive_minutes > 30){
                mins = exam_minutes - arrive_minutes;
                System.out.printf("Early\n%d minutes before the start", mins);
            }
            else if(arrive_minutes < exam_minutes && exam_minutes - arrive_minutes <= 30){
                mins = exam_minutes - arrive_minutes;
                System.out.printf("On time\n%d minutes before the start", mins);
            }
            else {
                System.out.print("On time");
            }

        }
        else {

            hours = exam_hours - arrive_hours;
            if(exam_minutes < arrive_minutes){
                hours--;
                mins = 60 - (arrive_minutes - exam_minutes);
                if(hours < 1){

                    if(mins > 30){
                        System.out.printf("Early\n%d minutes before the start", mins);
                    }
                    else {
                        System.out.printf("On time\n%d minutes before the start", mins);
                    }

                }
            }
            else if(exam_minutes == arrive_minutes){
                System.out.printf("Early\n%d:00 hours before the start", hours);
            }
            else {
                mins = exam_minutes - arrive_minutes;
                System.out.printf("Early\n%d:%d hours before the start", hours, mins);
            }

        }

    }
}
