package module;

import strategy.ImageLoader;

import java.util.concurrent.TimeUnit;

public class Image {
    private ImageLoader imageLoader;

    public Image(ImageLoader imageLoader) {
        this.imageLoader = imageLoader;
    }

    public void load() {
        imageLoader.loadImage();
    }

    public void display() {
        imageLoader.displayImage();
    }
}