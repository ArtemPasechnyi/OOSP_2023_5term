package Composite;

import java.util.List;
import java.util.ArrayList;

public class Album implements MusicComponent {
    private String name;
    private List<MusicComponent> tracks = new ArrayList<>();

    public Album(String name) {
        this.name = name;
    }

    public void addTrack(MusicComponent track) {
        tracks.add(track);
    }

    @Override
    public void play() {
        System.out.println("Playing album: " + name);
        for (MusicComponent track : tracks) {
            track.play();
        }
    }
}
