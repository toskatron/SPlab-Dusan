package strategy;

public class AlignLeft implements AlignStrategy {
    public void render(String text) {
        System.out.println("<< " + text);
    }
}
