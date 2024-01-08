package module;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Chapter> chapters = new ArrayList<>();
    private Author author;

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public int createChapter(String chapterName) {
        Chapter newChapter = new Chapter(chapterName);
        chapters.add(newChapter);
        return chapters.indexOf(newChapter);
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }

    public void print() {
        System.out.println("Book: " + title);
        if (author != null) {
            author.print();
        }
        for (Chapter chapter : chapters) {
            chapter.print();
        }
    }
}
