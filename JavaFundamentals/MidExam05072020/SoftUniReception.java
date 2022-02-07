package MidExam05072020;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employee1 = Integer.parseInt(scanner.nextLine());
        int employee2 = Integer.parseInt(scanner.nextLine());
        int employee3 = Integer.parseInt(scanner.nextLine());

        int students = Integer.parseInt(scanner.nextLine());

        int answersPerHour = employee1 + employee2 + employee3;

        int timeToAnswerAllStudents = students / answersPerHour;

        if (students % answersPerHour > 0) {
            timeToAnswerAllStudents ++;
        }

        int delay = timeToAnswerAllStudents / 4;

        timeToAnswerAllStudents += delay;

        System.out.println("Time needed: " + timeToAnswerAllStudents + "h.");
    }
}