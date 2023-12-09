package Prototype;

public class WorldMapGenerator {
    private WorldMapPrototype prototype;

    public WorldMapGenerator(WorldMapPrototype prototype) {
        this.prototype = prototype;
    }

    public WorldMapPrototype generateMap() {
        try {
            return (WorldMapPrototype) prototype.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
