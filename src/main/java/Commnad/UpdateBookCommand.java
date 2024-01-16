package Commnad;

import com.example.splab.interfaces.Command;

public class UpdateBookCommand implements Command {
    private final Long id;
    private final String bookData;

    public UpdateBookCommand(Long id, String bookData) {
        this.id = id;
        this.bookData = bookData;
    }

    @Override
    public Object execute() {
        return "Book updated with id: " + id;
    }
}

