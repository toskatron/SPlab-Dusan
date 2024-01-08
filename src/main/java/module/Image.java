package module;

public class Image implements Element {
    private String url;

    public Image(String url) {
        this.url = url;
    }

    // The `Image` doesn't have children, so these methods can be empty
    public void add(Element element) {}
    public void remove(Element element) {}
    public Element get(int index) { return null; }

    public void print() {
        System.out.println("Image with name:" + url);
    }

    @Override
    public Element clone() throws CloneNotSupportedException {
        return null;
    }
}