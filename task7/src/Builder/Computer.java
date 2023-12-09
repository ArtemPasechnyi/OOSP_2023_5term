package Builder;

public class Computer {
    private String processor;
    private int ram;
    private int storage;
    private String graphicsCard;

    public Computer(String processor, int ram, int storage, String graphicsCard) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }


    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
}
