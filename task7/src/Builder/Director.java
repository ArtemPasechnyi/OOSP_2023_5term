package Builder;

public class Director {
    public Computer buildComputer(ComputerBuilder builder) {
        builder.buildProcessor("Intel i7");
        builder.buildRam(16);
        builder.buildStorage(1000);
        builder.buildGraphicsCard("NVIDIA GeForce RTX 3080");
        return builder.getResult();
    }
}
