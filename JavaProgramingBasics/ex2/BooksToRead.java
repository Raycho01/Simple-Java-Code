package ex2;

import java.util.Scanner;

public class BooksToRead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pages_per_hour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hours = pages / pages_per_hour;
        hours = hours / days;
        System.out.println(hours);

    }
}
