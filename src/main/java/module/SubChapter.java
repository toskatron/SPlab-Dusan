package module;


import strategy.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Object> content = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String text) {
        content.add(new Paragraph(text));
    }

    public void createNewImage(ImageLoader imageName) {
        content.add(new Image(imageName));
    }

    public void createNewTable(String title) {
        content.add(new Table(title));
    }

    public void print() {
        System.out.println("SubChapter: " + name);
        for (Object element : content) {
            if (element instanceof Printable) {
                ((Printable)element).print();
            }
        }
    }
}