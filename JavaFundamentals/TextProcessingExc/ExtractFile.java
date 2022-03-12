package TextProcessingExc;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();

        int startingIndexOfFile = path.lastIndexOf("\\");

        String file = path.substring(startingIndexOfFile + 1);

        int startingIndexOfType = file.lastIndexOf(".");

        String nameOfFile = file.substring(0, startingIndexOfType);

        String type = file.substring(startingIndexOfType + 1);

        System.out.println("File name: " + nameOfFile);
        System.out.println("File extension: " + type);
    }
}
