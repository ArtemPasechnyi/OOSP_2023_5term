import AbstractFactory.*;

public class Main {
    public static void main(String[] args) {
        PizzaFactory meatPizzaFactory = new MeatPizzaFactory();
        PizzaStore meatPizzaStore = new PizzaStore(meatPizzaFactory);
        meatPizzaStore.orderPizza();

        PizzaFactory vegetarianPizzaFactory = new VegetarianPizzaFactory();
        PizzaStore vegetarianPizzaStore = new PizzaStore(vegetarianPizzaFactory);
        vegetarianPizzaStore.orderPizza();

        PizzaFactory seafoodPizzaFactory = new SeafoodPizzaFactory();
        PizzaStore seafoodPizzaStore = new PizzaStore(seafoodPizzaFactory);
        seafoodPizzaStore.orderPizza();
    }
}
