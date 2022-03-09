package AssociativeArraysExc;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyUsers = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("End")) {

            String[] input = line.split(" -> ");

            String companyName = input[0];
            String userId = input[1];

            List<String> potentialList = companyUsers.get(companyName);

            if (potentialList == null) {
                List<String> users = new ArrayList<>();
                users.add(userId);
                companyUsers.put(companyName, users);
            } else {
                if (!companyUsers.get(companyName).contains(userId)) {
                    companyUsers.get(companyName).add(userId);
                }
            }

            line = scanner.nextLine();
        }

        companyUsers.forEach((key, value) -> {
            System.out.println(key);
            for (String user : value) {
                System.out.println("-- " + user);
            }
        });

    }
}
