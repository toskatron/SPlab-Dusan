package Commnad;
import com.example.splab.interfaces.Command;

public class DeleteBookCommand implements Command {
    private final Long id;

    public DeleteBookCommand(Long id) {
        this.id = id;
    }

    @Override
    public Object execute() {

        return "Book deleted with id: " + id;
    }
}

