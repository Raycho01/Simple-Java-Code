package preExam;

import java.util.Scanner;

public class ExamGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        double average = 0;
        double topStudents = 0;
        double goodStudents = 0;
        double midStudents = 0;
        double failStudents = 0;

        for (int i = 0; i < students; i++){

            double grade = Double.parseDouble(scanner.nextLine());
            average += grade;

            if (grade >= 5){
                topStudents++;
            }
            else if (grade >= 4 && grade <= 4.99){
                goodStudents++;
            }
            else if (grade >= 3 && grade <= 3.99){
                midStudents++;
            }
            else {
                failStudents++;
            }

        }

        average = average / students;

        topStudents = topStudents / students * 100;
        goodStudents = goodStudents / students * 100;
        midStudents = midStudents / students * 100;
        failStudents = failStudents / students * 100;

        System.out.printf("Top students: %.2f%%\n", topStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", goodStudents);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", midStudents);
        System.out.printf("Fail: %.2f%%\n", failStudents);
        System.out.printf("Average: %.2f", average);

    }
}
