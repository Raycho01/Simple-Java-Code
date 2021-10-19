package ex10;

import java.util.Scanner;

public class MovingOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        String input = "";
        int space = width * length * height;
        int boxes = Integer.parseInt(scanner.nextLine());
        space -= boxes;

        while (space > 0){

            input = scanner.nextLine();

            if (!(input.equals("Done"))){
                boxes = Integer.parseInt(input);
                space -= boxes;
            }
            else {
                break;
            }

        }

        if (space >= 0){
            System.out.println(space + " Cubic meters left.");
        }
        else {
            System.out.println("No more free space! You need " + -(space) + " Cubic meters more.");
        }

    }
}
