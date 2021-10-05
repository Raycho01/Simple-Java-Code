package ex6;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        int result;
        double resultDouble;

        if(b > 0) {

            switch (operation){

                case "+":
                    result = a + b;
                    if(result % 2 == 0){
                        System.out.println(a + " " + operation + " " + b + " = " + result + " - even");
                    }
                    else{
                        System.out.println(a + " " + operation + " " + b + " = " + result + " - odd");
                    }
                    break;

                case "-":
                    result = a - b;
                    if(result % 2 == 0){
                        System.out.println(a + " " + operation + " " + b + " = " + result + " - even");
                    }
                    else{
                        System.out.println(a + " " + operation + " " + b + " = " + result + " - odd");
                    }
                    break;

                case "*":
                    result = a * b;
                    if(result % 2 == 0){
                        System.out.println(a + " " + operation + " " + b + " = " + result + " - even");
                    }
                    else{
                        System.out.println(a + " " + operation + " " + b + " = " + result + " - odd");
                    }
                    break;

                case "/":
                    double aa = a;
                    double bb = b;
                    resultDouble = aa / bb;
                    System.out.printf("%d %s %d = %.2f", a, operation, b, resultDouble);
                    break;

                case "%":
                    result = a % b;
                    System.out.printf("%d %s %d = %d", a, operation, b, result);
                    break;
            }

        }
        else{
            System.out.println("Cannot divide " + a + " by zero");
        }
    }
}
