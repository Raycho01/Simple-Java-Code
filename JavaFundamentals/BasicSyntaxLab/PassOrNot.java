package BasicSyntaxLab;

import java.util.Scanner;

public class PassOrNot {
    public static void main(String[] args) {

        double grade = new Scanner(System.in).nextDouble();

        if (grade >= 3) {
            System.out.println("Passed!");
        }
        else {
            System.out.println("Failed!");
        }
    }
}
