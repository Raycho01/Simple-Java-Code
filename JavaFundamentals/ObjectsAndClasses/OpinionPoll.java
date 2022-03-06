package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return this.age;
        }

        @Override
        public String toString() {
            return new String(this.name + " - " + this.age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>(lines);

        for (int i = 0; i < lines; i ++) {
            String[] command = scanner.nextLine().split(" ");
            Person person = new Person(command[0], Integer.parseInt(command[1]));
            people.add(person);
        }

        for (Person person : people) {
            if (person.getAge() > 30) {
                System.out.println(person.toString());
            }
        }

    }
}
