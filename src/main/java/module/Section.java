package module;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String title;
    private List<Element> content = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public void add(Element element) {
        try {
            Element clone = element.clone(); // Clone the element
            content.add(clone); // Add the clone to the content list
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element element : content) {
            element.print();
        }
    }

    @Override
    public Element clone() throws CloneNotSupportedException {
        Section cloned = (Section) super.clone();
        cloned.content = new ArrayList<>(); // Create a new list for the clone
        for (Element element : this.content) {
            cloned.add(element.clone()); // Clone and add all elements
        }
        return cloned;
    }
}
