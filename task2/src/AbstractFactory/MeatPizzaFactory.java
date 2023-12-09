package AbstractFactory;

public class MeatPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new MeatPizza();
    }
}