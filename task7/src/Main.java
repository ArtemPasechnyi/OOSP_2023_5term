import Builder.Computer;
import Builder.ConcreteComputerBuilder;
import Builder.Director;

public class Main {
    public static void main(String[] args) {
        ConcreteComputerBuilder builder = new ConcreteComputerBuilder();
        Director director = new Director();

        Computer computer = director.buildComputer(builder);
        System.out.println(computer);
    }
}
