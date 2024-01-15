package strategy;

public class AlignRight implements AlignStrategy {
    public void render(String text) {
        System.out.println(text + " >>");
    }
}
