package MidExam20022020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String[] arrayLine = line.split("&");

        List<String> books = new ArrayList<>(Arrays.asList(arrayLine));

        String input = scanner.nextLine();

        while (!(input.equals("Done"))) {
            String[] command = input.split(" \\| ");
            switch (command[0]) {
                case "Add Book":
                    if (!books.contains(command[1])) {
                        books.add(0, command[1]);
                    }
                    break;
                case "Take Book":
                    books.remove(command[1]);
                    break;
                case "Swap Books":
                    if (books.contains(command[1]) && books.contains(command[2])) {
                        for (int i = 0; i < books.size(); i ++) {
                            if (books.get(i).equals(command[1])) {
                                books.set(i, command[2]);
                            }
                            else if (books.get(i).equals(command[2])) {
                                books.set(i, command[1]);
                            }
                        }
                    }
                    break;
                case "Insert Book":
                    if (!books.contains(command[1])) {
                        books.add(command[1]);
                    }
                    break;
                case "Check Book":
                    if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[1]) < books.size()) {
                        System.out.println(books.get(Integer.parseInt(command[1])));
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < books.size(); i ++) {
            if (i == books.size() - 1) {
                System.out.print(books.get(i));
            }
            else {
                System.out.print(books.get(i) + ", ");
            }
        }
    }
}
