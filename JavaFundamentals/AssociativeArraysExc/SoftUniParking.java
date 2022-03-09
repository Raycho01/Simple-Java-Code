package AssociativeArraysExc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> registeredUsers = new LinkedHashMap<>();

        int commands = Integer.parseInt(scanner.nextLine());

        while (commands > 0) {

            String[] input = scanner.nextLine().split(" ");
            String currUser = input[1];

            if (input[0].equals("register")) {
                String currLicense = input[2];
                String potentialLicense = registeredUsers.get(input[1]);
                if (potentialLicense == null) {
                    registeredUsers.put(currUser, currLicense);
                    System.out.println(currUser + " registered " + currLicense + " successfully");
                } else {
                    System.out.println("ERROR: already registered with plate number " + potentialLicense);
                }
            } else {
                boolean isThere = false;
                for (Map.Entry<String, String> entry : registeredUsers.entrySet()) {
                    if (entry.getKey().equals(currUser)) {
                        registeredUsers.remove(currUser);
                        System.out.println(currUser + " unregistered successfully");
                        isThere = true;
                        break;
                    }
                }
                if (!isThere) {
                    System.out.println("ERROR: user " + currUser + " not found");
                }
            }

            commands --;
        }

        registeredUsers.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
