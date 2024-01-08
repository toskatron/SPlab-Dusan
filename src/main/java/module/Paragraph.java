package module;

public class Paragraph implements Element {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    // The other methods remain the same...

    @Override
    public void print() {
        System.out.println("Paragraph: " + text);
    }

    @Override
    public Element clone() throws CloneNotSupportedException {
        // Directly use the default object clone.
        return (Element) super.clone();
    }
}
