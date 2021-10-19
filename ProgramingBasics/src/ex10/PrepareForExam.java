package ex10;

import java.util.Scanner;

public class PrepareForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());
        String exercise = scanner.nextLine();
        int grade = Integer.parseInt(scanner.nextLine());
        int lifes = badGrades;
        int counter = 0;
        double averageGrade = 0;
        String last = "";

        while (!(exercise.equals("Enough"))){

            if (grade <= 4){
                lifes--;
                if (lifes == 0){
                    break;
                }
            }

            counter++;
            averageGrade += grade;
            last = exercise;
            exercise = scanner.nextLine();
            if (exercise.equals("Enough")){
                break;
            }
            grade = Integer.parseInt(scanner.nextLine());

        }

        if (lifes == 0){
            System.out.printf("You need a break, %d poor grades.", badGrades);
        }
        else {
            averageGrade = averageGrade / counter;
            System.out.printf("Average score: %.2f\nNumber of problems: %d\nLast problem: %s", averageGrade, counter, last);
        }

    }
}
