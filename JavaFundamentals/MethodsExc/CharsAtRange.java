package MethodsExc;

import java.util.Scanner;

public class CharsAtRange {

    public static StringBuilder printASCII(char a, char b) {

        StringBuilder str = new StringBuilder();
        a += 1;
        if (a - b == 1 || a == b) {

        }
        else {
            for (char ch = a; ch < b; ch ++) {
                str.append(ch).append(" ");
            }
        }

        return  str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);

        System.out.println(printASCII(a, b).toString());

    }
}
