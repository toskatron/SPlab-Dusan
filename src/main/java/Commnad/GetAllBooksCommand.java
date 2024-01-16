package Commnad;

import com.example.splab.interfaces.Command;

public class GetAllBooksCommand implements Command {
    @Override
    public Object execute() {

        return "All books";
    }
}

