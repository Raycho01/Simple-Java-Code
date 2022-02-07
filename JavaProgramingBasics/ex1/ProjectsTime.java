package ex1;

import java.util.Scanner;

public class ProjectsTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());

        System.out.println("The architect " + name + " will need " + projects * 3 + " hours to complete " + projects + " project/s.");
    }
}
