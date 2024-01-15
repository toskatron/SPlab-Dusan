package com.example.splab.interfaces;

import model.Book;
import model.Chapter;

public interface BookElementVisitor {
    void visit(Book book);
    //void visit(Chapter chapter);
}
