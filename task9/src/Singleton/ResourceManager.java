package Singleton;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ResourceManager {
    private Map<String, Image> imageCache;

    public ResourceManager() {
        imageCache = new HashMap<>();
    }

    public Image getImage(String imagePath) {
        if (imageCache.containsKey(imagePath)) {
            return imageCache.get(imagePath);
        } else {
            Image image = loadImage(imagePath);

            imageCache.put(imagePath, image);
            return image;
        }
    }

    private Image loadImage(String imagePath) {
        return Toolkit.getDefaultToolkit().getImage(imagePath);
    }

}
