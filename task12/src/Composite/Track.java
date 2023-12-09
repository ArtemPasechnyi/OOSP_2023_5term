package Composite;

public class Track implements MusicComponent {
    private String name;

    public Track(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Playing track: " + name);
    }
}
