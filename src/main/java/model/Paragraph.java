package model;

import com.example.splab.interfaces.AlignStrategy;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignmentStrategy;

    public Paragraph(String text) {
        this.text = text;
        // Default alignment strategy could be set here if needed
    }

    // Method to set a new alignment strategy
    public void setAlignStrategy(AlignStrategy alignmentStrategy) {
        this.alignmentStrategy = alignmentStrategy;
    }

    @Override
    public void print() {
        if (alignmentStrategy == null) {
            System.out.println(text);
        } else {
            alignmentStrategy.render(text);
        }
    }

    @Override
    public Element clone() throws CloneNotSupportedException {
        return null;
    }
}