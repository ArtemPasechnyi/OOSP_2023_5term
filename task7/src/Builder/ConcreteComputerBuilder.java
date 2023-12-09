package Builder;

public class ConcreteComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public ConcreteComputerBuilder() {
        this.computer = new Computer("Default Processor", 4, 500, "Default Graphics Card");
    }

    @Override
    public void buildProcessor(String processor) {
        computer = new Computer(processor, computer.getRam(), computer.getStorage(), computer.getGraphicsCard());
    }

    @Override
    public void buildRam(int ram) {
        computer = new Computer(computer.getProcessor(), ram, computer.getStorage(), computer.getGraphicsCard());
    }

    @Override
    public void buildStorage(int storage) {
        computer = new Computer(computer.getProcessor(), computer.getRam(), storage, computer.getGraphicsCard());
    }

    @Override
    public void buildGraphicsCard(String graphicsCard) {
        computer = new Computer(computer.getProcessor(), computer.getRam(), computer.getStorage(), graphicsCard);
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}