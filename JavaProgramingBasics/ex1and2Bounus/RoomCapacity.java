package ex1and2Bounus;

import java.util.Scanner;

public class RoomCapacity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        int seats;

        height = height * 100;
        width = width * 100;

        width = width - 100;
        width = width / 70;
        seats = (int) width;

        height = height / 120;
        seats = seats * (int) height;

        seats = seats - 3;
        System.out.println(seats);


    }
}
