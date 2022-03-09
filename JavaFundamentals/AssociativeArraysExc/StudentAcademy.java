package AssociativeArraysExc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {
    public static class Student {
        private String name;
        private double averageGrade;
        private int totalGrades;

        public Student(String name, double averageGrade, int totalGrades) {
            this.name = name;
            this.averageGrade = averageGrade;
            this.totalGrades = totalGrades;
        }

        public void setAverageGrade(double averageGrade) {
            totalGrades ++;
            this.averageGrade = (this.averageGrade + averageGrade) / totalGrades;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Student> studentMap = new LinkedHashMap<>();

        int lines = Integer.parseInt(scanner.nextLine());

        while (lines > 0) {

            String studentName = scanner.nextLine();
            double studentGrade = Double.parseDouble(scanner.nextLine());

            if (!studentMap.containsKey(studentName)) {
                Student student = new Student(studentName, studentGrade, 1);
                studentMap.put(studentName, student);
            } else {
                studentMap.get(studentName).setAverageGrade(studentGrade);
            }

            lines --;
        }

        Map<String, Student> filtered = new LinkedHashMap<>();

        studentMap.forEach((key, value) -> {
            if (value.averageGrade >= 4.5) {
                filtered.put(key, value);
            }
        });

        filtered.forEach((key, value) -> System.out.printf("%s -> %.2f\n", key, value.averageGrade));
    }
}

