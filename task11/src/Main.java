import Prototype.WorldMapGenerator;
import Prototype.WorldMapPrototype;

public class Main {
    public static void main(String[] args) {

        WorldMapPrototype prototype = new WorldMapPrototype();
        prototype.addTile("Grass");
        prototype.addTile("Water");
        prototype.addTile("Mountain");

        WorldMapGenerator generator = new WorldMapGenerator(prototype);

        WorldMapPrototype map1 = generator.generateMap();

        System.out.println("Map 1 tiles: " + map1.getTiles());

        WorldMapPrototype map2 = generator.generateMap();

        System.out.println("Map 2 tiles: " + map2.getTiles());
    }
}