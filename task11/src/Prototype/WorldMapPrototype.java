package Prototype;

import java.util.ArrayList;
import java.util.List;

public class WorldMapPrototype implements Cloneable {
    private List<String> tiles;

    public WorldMapPrototype() {
        this.tiles = new ArrayList<>();
    }

    public void addTile(String tile) {
        tiles.add(tile);
    }

    public List<String> getTiles() {
        return tiles;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
