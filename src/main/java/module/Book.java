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

    public void addContent(Element element) {
        try {
            Element clone = element.clone(); // Clone the element
            content.add(clone); // Add the clone to the content list
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    @Override
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
        Book cloned = (Book) super.clone();
        cloned.content = new ArrayList<>(); // Create a new list for the clone
        for (Element element : this.content) {
            cloned.addContent(element.clone()); // Clone and add all elements
        }
        return cloned;
    }
}
