class Chapter {
    private String name;
    private List<SubChapter> subChapters;
    public Chapter(String name, List<SubChapter> subChapters) {
        this.name = name;
        this.subChapters = subChapters;
    }
    public void print() {
        System.out.println("Chapter: " + name);
        for (SubChapter subChapter : subChapters) {
            subChapter.print();
        }
    }
}