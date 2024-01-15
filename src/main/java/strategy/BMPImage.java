package strategy;

public class BMPImage implements ImageLoader {
    private String url;

    public BMPImage(String url) {
        this.url = url;
    }

    public void loadImage() {
        System.out.println("Loading BMP image from " + url);
        // Implement actual BMP loading logic here
    }

    public void displayImage() {
        System.out.println("Displaying BMP image");
        // Implement display logic here
    }
}
