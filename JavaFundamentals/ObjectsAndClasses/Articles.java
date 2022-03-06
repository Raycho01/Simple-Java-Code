package ObjectsAndClasses;

import java.util.Scanner;

public class Articles {

    public static class Article{
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return new String(title + " - " + content + ": " + author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(", ");

        Article article = new Article(line[0], line[1], line[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i ++) {
            String[] command = scanner.nextLine().split(": ");
            switch (command[0]) {
                case "Edit":
                    article.setContent(command[1]);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(command[1]);
                    break;
                case "Rename":
                    article.setTitle(command[1]);
                    break;
            }
        }

        System.out.println(article.toString());
    }
}