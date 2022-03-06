package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    public static class Student {

        private String firstName;
        private String lastName;
        private double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String secondName) {
            this.lastName = secondName;
        }

        public double getGrade() {
            return grade;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + ": " + grade;
        }

        public static Student bestStudent(List<Student> students) {
            Student bestStudent = null;
            double bestGrade = 0;
            for (Student student : students) {
                if (student.getGrade() > bestGrade) {
                    bestStudent = student;
                    bestGrade = student.getGrade();
                }
            }
            return bestStudent;
        }

        public static void showGrades(List<Student> students) {
            List<Student> filtered = new ArrayList<>(students.size());
            int size = students.size();
            for (int i = 0; i < size; i ++) {
                Student best = bestStudent(students);
                filtered.add(best);
                students.remove(best);
            }

            for (Student student : filtered) {
                System.out.printf("%s %s: %.2f\n", student.getFirstName(), student.getLastName(), student.getGrade());
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>(lines);

        for (int i = 0; i < lines; i ++) {
            String[] input = scanner.nextLine().split(" ");
            Student student = new Student(input[0], input[1], Double.parseDouble(input[2]));
            students.add(student);
        }

        Student.showGrades(students);
    }
}
