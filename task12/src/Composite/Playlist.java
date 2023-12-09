package Composite;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements MusicComponent {
    private String name;
    private List<MusicComponent> components = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public void addComponent(MusicComponent component) {
        components.add(component);
    }

    @Override
    public void play() {
        System.out.println("Playing playlist: " + name);
        for (MusicComponent component : components) {
            component.play();
        }
    }
}
