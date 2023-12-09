import Composite.Album;
import Composite.Playlist;
import Composite.Track;


public class Main {
    public static void main(String[] args) {
        Track track1 = new Track("Song 1");
        Track track2 = new Track("Song 2");
        Track track3 = new Track("Song 3");

        Album album = new Album("Album 1");
        album.addTrack(track1);
        album.addTrack(track2);

        Playlist playlist = new Playlist("My Playlist");
        playlist.addComponent(track3);
        playlist.addComponent(album);

        playlist.play();
    }
}
