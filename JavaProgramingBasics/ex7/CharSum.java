package ex7;

import java.util.Scanner;

public class CharSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        char ch = word.charAt(0);
        int points = 0;

        for (int i = 0; i < word.length(); i++){
            ch = word.charAt(i);
            if (ch == 'a'){
                points ++;
            }
            else if (ch == 'e'){
                points += 2;
            }
            else if (ch == 'i'){
                points += 3;
            }
            else if (ch == 'o'){
                points += 4;
            }
            else if (ch == 'u'){
                points += 5;
            }
        }
        System.out.printf("%d", points);
    }
}
