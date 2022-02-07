package ArraysExc;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        if (size != 0) {

            String[] input = scanner.nextLine().split(" ");

            int[] ladyBugs = new int[size];
            int potential;

            for (int i = 0; i < input.length; i++) {
                potential = Integer.parseInt(input[i]);
                if (potential >= 0 && potential < size) {
                    ladyBugs[potential] = 1;
                }
            }

            String nextInput = scanner.nextLine();

            while (!(nextInput.equals("end"))) {

                String[] movement = nextInput.split(" ");

                int ladyBug = Integer.parseInt(movement[0]);

                if (ladyBug < size && ladyBug >= 0) {

                    String direction = movement[1];
                    int newPosition = Integer.parseInt(movement[2]);

                    if (ladyBugs[ladyBug] == 1) {

                        ladyBugs[ladyBug] = 0;

                        if (newPosition < 0) {
                            newPosition = Math.abs(newPosition);
                            if (direction.equals("right")) {
                                direction = "left";
                            } else if (direction.equals("left")) {
                                direction = "right";
                            }
                        }

                        if (direction.equals("right")) {
                            if (ladyBug + newPosition < size) {
                                for (int i = ladyBug + newPosition; i < size; i += newPosition) {
                                    if (ladyBugs[i] == 0) {
                                        ladyBugs[i] = 1;
                                        break;
                                    }
                                }
                            }
                        } else if (direction.equals("left")) {
                            if (ladyBug - newPosition >= 0) {
                                for (int i = ladyBug - newPosition; i >= 0; i -= newPosition) {
                                    if (ladyBugs[i] == 0) {
                                        ladyBugs[i] = 1;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }

                nextInput = scanner.nextLine();

            }

            for (int ladyBug : ladyBugs) {
                System.out.print(ladyBug + " ");
            }

        }

    }
}
