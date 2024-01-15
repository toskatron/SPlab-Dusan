package model;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String title;
    private List<Element> content = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public void add(Element element) {
        if (element != null) {
            content.add(element);
        } else {
            // Optionally throw an exception or log a warning
            throw new IllegalArgumentException("Cannot add null element to section");
        }
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element elem : content) {
            if (elem != null) { // Additional null check before printing
                elem.print();
            }
        }
    }

    @Override
    public Element clone() throws CloneNotSupportedException {
        return null;
    }
}
