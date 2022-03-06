package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticlesNextPatch {

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
        int lines = Integer.parseInt(scanner.nextLine());
        List<Article> articleList = new ArrayList<>(lines);

        for (int i = 0; i < lines; i ++) {
            String[] command = scanner.nextLine().split(", ");
            Article article = new Article(command[0], command[1], command[2]);
            articleList.add(article);
        }

        for (Article article : articleList) {
            System.out.println(article.toString());
        }

    }
}
