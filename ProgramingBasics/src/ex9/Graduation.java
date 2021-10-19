package ex9;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double grade = Double.parseDouble(scanner.nextLine());
        double finalGrade = 0;
        int lifes = 2;

        for (int i = 1; i <= 12; i++){

            if (grade >= 4){
                finalGrade += grade;
            }
            else {
                lifes--;
                if (lifes == 0){
                    System.out.println(name + " has been excluded at " + i + " grade");
                    break;
                }
                else {
                    i--;
                }
            }

            if (i == 12){
                System.out.printf("%s graduated. Average grade: %.2f", name, finalGrade / 12);
            }
            else {
                grade = Double.parseDouble(scanner.nextLine());
            }

        }



    }
}
