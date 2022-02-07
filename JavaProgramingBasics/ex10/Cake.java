package ex10;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int cake = width * length;
        int takenPieces = Integer.parseInt(scanner.nextLine());

        String input = "";
        cake -= takenPieces;

        while (cake > 0){

            input = scanner.nextLine();
            if (!(input.equals("STOP"))){
                takenPieces = Integer.parseInt(input);
                cake -= takenPieces;
            }
            else {
                break;
            }

        }

        if (cake > 0){
            System.out.println(cake + " pieces are left.");
        }
        else {
            System.out.println("No more cake left! You need " + -(cake) + " pieces more.");
        }

    }
}
