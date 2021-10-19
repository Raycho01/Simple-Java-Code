package ex10;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        String input = scanner.nextLine();
        boolean found = false;
        int counter = 0;

        while (found != true){

            if(!(input.equals(bookName))){
                counter++;
                input = scanner.nextLine();
            }
            else {
                found = true;
                break;
            }

            if (input.equals("No More Books")){
                break;
            }

        }

        if (found == true){
            System.out.printf("You checked %d books and found it.", counter);
        }
        else {
            System.out.printf("The book you search is not here!\nYou checked %d books.", counter);
        }

    }
}
