package AbstractFactory;

public class SeafoodPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new SeafoodPizza();
    }
}
