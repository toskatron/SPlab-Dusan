package module;

class Table implements Element {
    // Assuming 'something' is a title or similar attribute
    private String something;

    public Table(String something) {
        this.something = something;
    }

    // The `Table` doesn't have children, so these methods can be empty
    public void add(Element element) {}
    public void remove(Element element) {}
    public Element get(int index) { return null; }

    public void print() {
        System.out.println("Table: " + something);
    }

    @Override
    public Element clone() throws CloneNotSupportedException {
        return null;
    }
}