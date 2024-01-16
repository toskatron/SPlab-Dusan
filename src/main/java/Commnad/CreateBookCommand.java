package Commnad;

import com.example.splab.interfaces.Command;

public class CreateBookCommand implements Command {
    private final String bookData;

    public CreateBookCommand(String bookData) {
        this.bookData = bookData;
    }

    @Override
    public Object execute() {

        return "Book created";
    }
}
