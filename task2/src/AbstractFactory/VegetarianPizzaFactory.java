package AbstractFactory;

public class VegetarianPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new VegetarianPizza();
    }
}
