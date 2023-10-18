class Book {
    private Title title;
    private List<Author> authors;
    private TableOfContents tableOfContents;
    private List<Chapter> chapters;

    public Book(Title title, List<Author> authors, TableOfContents tableOfContents, List<Chapter> chapters) {
        this.title = title;
        this.authors = authors;
        this.tableOfContents = tableOfContents;
        this.chapters = chapters;
    }

    
    public void print() {
        // Print the book title
        title.print();
        // Print authors
        System.out.print("Authors: ");
        for (Author author : authors) {
            System.out.print(author.getName() + ", ");
        }
        System.out.println();

        if (tableOfContents != null) {
            System.out.println("Table of Contents: ");
        }
        System.out.println("Chapters: ");
        for (Chapter chapter : chapters) {
            System.out.println("Chapter: " + chapter.getTitle());
            for (SubChapter subChapter : chapter.getSubChapters()) {
                System.out.println("SubChapter: ");
                for (Object content : subChapter.getContent()) {
                    if (content instanceof Paragraph) {
                        System.out.println("Paragraph: " + ((Paragraph) content).getText());
                    } else if (content instanceof Image) {
                        System.out.println("Image: " + ((Image) content).getSource());
                    } else if (content instanceof Table) {
                        System.out.println("Table: ");
                    }
                }
            }
        }
    }
}
