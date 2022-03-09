package AssociativeArraysExc;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courseStudents = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] input = line.split(" : ");

            String currCourse = input[0];
            String currStudent = input[1];

            List<String> potentialListOfStudents = courseStudents.get(currCourse);

            if (potentialListOfStudents == null) {
                List<String> listOfStudents = new ArrayList<>();
                listOfStudents.add(currStudent);
                courseStudents.put(currCourse, listOfStudents);
            } else {
              potentialListOfStudents.add(currStudent);
            }

            line = scanner.nextLine();
        }

        courseStudents.forEach((key, value) -> {
            System.out.println(key + ": " + value.size());
            for (String student : value) {
                System.out.println("-- " + student);
            }
        });
    }
}
