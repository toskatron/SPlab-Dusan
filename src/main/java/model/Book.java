package model;

import com.example.splab.interfaces.BookElementVisitor;

import java.util.ArrayList;
import java.util.List;

public class Book implements Element {
    private Long id;
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
    public void accept(BookElementVisitor visitor) {
        visitor.visit(this);
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

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Element> getContent() {
        return content;
    }

    public void setContent(List<Element> content) {
        this.content = content;
    }
}
