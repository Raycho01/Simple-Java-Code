package MidExamUnidentified;

import java.util.Arrays;
import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int health = 100;
        int bitcoins = 0;

        String[] commands = input.split("\\|");

        for (int i = 0; i < commands.length; i ++) {

            String[] command = commands[i].split(" ");

            switch (command[0]) {
                case "potion":
                    int healed = Integer.parseInt(command[1]);
                    if (health + healed > 100) {
                        healed = 100 - health;
                        health += healed;
                    }
                    else {
                        health += healed;
                    }
                    System.out.println("You healed for " + healed + " hp.");
                    System.out.println("Current health: " + health + " hp.");
                    break;
                case "chest":
                    bitcoins += Integer.parseInt(command[1]);
                    System.out.println("You found " + Integer.parseInt(command[1]) + " bitcoins.");
                    break;
                default:
                    int attack = Integer.parseInt(command[1]);
                    if (health - attack > 0) {
                        health -= attack;
                        System.out.println("You slayed " + command[0] + ".");
                    }
                    else {
                        health -= attack;
                        int bestRoom = i + 1;
                        System.out.println("You died! Killed by " + command[0] + ".");
                        System.out.println("Best room: " + bestRoom);
                    }
            }

            if (health <= 0) {
                break;
            }

        }

        if (health > 0) {
            System.out.println("You've made it!");
            System.out.println("Bitcoins: " + bitcoins);
            System.out.println("Health: " + health);
        }
    }
}
