package MidExam20022020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String[] arrayLine = line.split(", ");

        List<String> friends = new ArrayList<>(Arrays.asList(arrayLine));

        String input = scanner.nextLine();

        int blacklistedCounter = 0;
        int lostCounter = 0;

        while (!(input.equals("Report"))) {
            String[] command = input.split(" ");

            switch (command[0]) {
                case "Blacklist":
                    boolean flag = false;
                    for (int i = 0; i < friends.size(); i ++) {
                        if (friends.get(i).equals(command[1])) {
                            System.out.println(command[1] + " was blacklisted.");
                            friends.set(i, "Blacklisted");
                            blacklistedCounter ++;
                            flag = true;
                        }
                    }
                    if (!flag) {
                        System.out.println(command[1] + " was not found.");
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(command[1]);
                    if (index >= 0 && index < friends.size()) {
                        for (int i = 0; i < friends.size(); i ++) {
                            if (i == index && !friends.get(i).equals("Blacklisted") && !friends.get(i).equals("Lost")) {
                                System.out.println(friends.get(i) + " was lost due to an error.");
                                friends.set(i, "Lost");
                                lostCounter ++;
                                break;
                            }
                        }
                    }
                    break;
                case "Change":
                    int changeIndex = Integer.parseInt(command[1]);
                    if (changeIndex >= 0 && changeIndex < friends.size()) {
                        System.out.println(friends.get(changeIndex) + " changed his username to " + command[2] + ".");
                        friends.set(changeIndex, command[2]);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("Blacklisted names: " + blacklistedCounter);
        System.out.println("Lost names: " + lostCounter);

        for (String friend : friends) {
            System.out.print(friend + " ");
        }

    }
}
