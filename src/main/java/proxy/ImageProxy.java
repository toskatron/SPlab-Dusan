package proxy;

import module.Element;
import module.Image;

public class ImageProxy implements Element {
    private String imageName;
    private Image realImage;

    public ImageProxy(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void print() {
        if (realImage == null) {
            realImage = new Image(imageName);
        }
        realImage.print();
    }

    @Override
    public Element clone() throws CloneNotSupportedException {
        ImageProxy clone = (ImageProxy) super.clone();
        if (this.realImage != null) {
            clone.realImage = (Image) this.realImage.clone();
        }
        return clone;
    }
}
