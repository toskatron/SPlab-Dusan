package Commnad;

import com.example.splab.interfaces.Command;

public class GetBookByIdCommand implements Command {
    private final Long id;

    public GetBookByIdCommand(Long id) {
        this.id = id;
    }
    @Override
    public Object execute() {
        // Logic to get book by ID
        return "Book with id: " + id;
    }
}

