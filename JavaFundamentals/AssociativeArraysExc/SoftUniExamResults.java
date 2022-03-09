package AssociativeArraysExc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> languageAttendances = new LinkedHashMap<>();
        Map<String, Integer> studentPoints = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("exam finished")) {

            String[] input = line.split("-");

            String currStudent = input[0];

            if (input[1].equals("banned")) {
                studentPoints.remove(currStudent);
            } else {

                String currLanguage = input[1];
                int currPoints = Integer.parseInt(input[2]);

                Integer potentialPoints = studentPoints.get(currStudent);

                if (potentialPoints == null) {
                    studentPoints.put(currStudent, currPoints);
                } else {
                    if (studentPoints.get(currStudent) < currPoints) {
                        studentPoints.put(currStudent, currPoints);
                    }
                }

                if (languageAttendances.containsKey(currLanguage)) {
                    languageAttendances.put(currLanguage, languageAttendances.get(currLanguage) + 1);
                } else {
                    languageAttendances.put(currLanguage, 1);
                }
            }

            line = scanner.nextLine();
        }

        System.out.println("Results:");

        studentPoints.forEach((key, value) -> System.out.println(key + " | " + value));

        System.out.println("Submissions:");

        languageAttendances.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}
