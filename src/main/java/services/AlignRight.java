package services;

import com.example.splab.interfaces.AlignStrategy;

public class AlignRight implements AlignStrategy {
    public void render(String text) {
        System.out.println(text + " >>");
    }
}
