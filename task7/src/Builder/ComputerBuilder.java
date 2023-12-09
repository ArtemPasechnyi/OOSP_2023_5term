package Builder;

public interface ComputerBuilder {
    void buildProcessor(String processor);
    void buildRam(int ram);
    void buildStorage(int storage);
    void buildGraphicsCard(String graphicsCard);
    Computer getResult();
}

