package module;

import java.util.ArrayList;
import java.util.List;

public class Book implements Element {
    private String title;
    private List<Author> authors = new ArrayList<>();
    private List<Element> content = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void add(Element element) {
        content.add(element);
    }

    public void remove(Element element) {
        content.remove(element);
    }

    public Element get(int index) {
        return content.get(index);
    }

    public void print() {
        System.out.println("Book: " + title);
        System.out.println("Authors:");
        for (Author author : authors) {
            author.print();
        }
        for (Element element : content) {
            element.print();
        }
    }

    @Override
    public Element clone() throws CloneNotSupportedException {
        return null;
    }
}
