package services;

import com.example.splab.interfaces.ImageLoader;
import model.Image;

public class ImageProxy {
    private Image realImage;
    private String url;
    private ImageLoader imageLoader;

    public ImageProxy(String url, ImageLoader imageLoader) {
        this.url = url;
        this.imageLoader = imageLoader;
    }

    public void displayImage() {
        if (realImage == null) {
            realImage = new Image(imageLoader);
            realImage.load();
        }
        realImage.display();
    }
}
