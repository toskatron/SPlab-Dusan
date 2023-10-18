class SubChapter {
    private String name;
    private List<Object> content;

    public SubChapter(String name, List<Object> content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }
    public void printSubChapter() {
        System.out.println("SubChapter: " + name);

        for (Object contentItem : content) {
            if (contentItem instanceof Paragraph) {
                ((Paragraph) contentItem).print();
            } else if (contentItem instanceof Image) {
                ((Image) contentItem).print();
            } else if (contentItem instanceof Table) {
                ((Table) contentItem).print();
            }
        }
    }
}