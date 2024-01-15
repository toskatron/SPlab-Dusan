package services;

import com.example.splab.interfaces.BookElementVisitor;
import model.Book;
import model.Chapter;

public class RenderVisitor implements BookElementVisitor {
    @Override
    public void visit(Book book) {
        System.out.println("Rendering Book:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthors());
        System.out.println("ISBN: " + book.getContent());
        //here we can add chapter to book and render it chapter.accept(this) and
        // then it'll trigger an cascade effect to iterate the whole book
        System.out.println("Book rendering complete.");
    }
}

