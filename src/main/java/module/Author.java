package module;


public class Author {
    private String name;
    private String surname;

    public Author(String fullName) {
        String[] parts = fullName.split(" ");
        this.name = parts[0];
        this.surname = parts[1];
    }

    public void print() {
        System.out.println("Author: " + name + " " + surname);
    }
}

