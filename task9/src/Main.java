import Singleton.ResourceManager;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ResourceManager resourceManager = new ResourceManager();
        Image image = resourceManager.getImage("path/to/image.png");

        JFrame frame = new JFrame("Image Display");
        frame.setSize(300, 300);

        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Image cachedImage = resourceManager.getImage("path/to/image.png");

        System.out.println("Is cached image the same instance? " + (image == cachedImage));
    }
}