package strategy;

public class JPGImage implements ImageLoader {
    private String url;

    public JPGImage(String url) {
        this.url = url;
    }

    public void loadImage() {
        System.out.println("Loading JPG image from " + url);
        // Implement actual JPG loading logic here
    }

    public void displayImage() {
        System.out.println("Displaying JPG image");
        // Implement display logic here
    }
}
