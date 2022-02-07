package ex12;

import java.util.Scanner;

public class PrimeNumbers {

    static int checkPrime(int n){
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    flag=1;
                    break;
                }
            }

        }
        return flag;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = 0;
        int primeNumbers = 0;
        int notPrimeNumbers = 0;

        while (!(input.equals("stop"))){

            number = Integer.parseInt(input);

            if (number < 0){
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            else if (checkPrime(number) == 0){
                primeNumbers += number;
            }
            else {
                notPrimeNumbers += number;
            }

            input = scanner.nextLine();
        }

        System.out.println("Sum of all prime numbers is: " + primeNumbers);
        System.out.println("Sum of all non prime numbers is: " + notPrimeNumbers);

    }
}
