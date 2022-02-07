package ex12;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int totalTickets = 0;
        double standard = 0;
        double student = 0;
        double kids = 0;
        boolean breaking = false;
        String[] info = new String[20];
        int i = 0;

        while (!(input.equals("Finish"))){

            int seats = Integer.parseInt(scanner.nextLine());
            String ticketsType = scanner.nextLine();
            int numbSeats = seats;

            while (!(ticketsType.equals("End")) || seats < 1){

                seats--;
                totalTickets++;

                if (ticketsType.equals("standard")){
                    standard++;
                }
                else if (ticketsType.equals("student")){
                    student++;
                }
                else {
                    kids++;
                }

                ticketsType = scanner.nextLine();
                if (ticketsType.equals("Finish")){
                    breaking = true;
                    break;
                }

            }

            seats = numbSeats - seats;
            double percentSeats = (seats * 1.0 / numbSeats) * 100;

            info[i] = input + " - " + String.format("%.2f", percentSeats) + "% full.";
            i++;

            if (breaking){
                break;
            }

            input = scanner.nextLine();

        }

        for (int j = 0; j < i; j++){
            System.out.println(info[j]);
        }

        System.out.println("Total tickets: " + totalTickets);
        standard = (standard / totalTickets) * 100;
        student = (student / totalTickets) * 100;
        kids = (kids / totalTickets) * 100;

        System.out.printf("%.2f%% student tickets.\n", student);
        System.out.printf("%.2f%% standard tickets.\n", standard);
        System.out.printf("%.2f%% kids tickets.", kids);




    }
}
