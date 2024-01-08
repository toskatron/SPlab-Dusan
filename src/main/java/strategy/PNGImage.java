package strategy;

public class PNGImage implements ImageLoader {
    private String url;

    public PNGImage(String url) {
        this.url = url;
    }

    public void loadImage() {
        System.out.println("Loading PNG image from " + url);
        // Implement actual PNG loading logic here
    }

    public void displayImage() {
        System.out.println("Displaying PNG image");
        // Implement display logic here
    }
}
