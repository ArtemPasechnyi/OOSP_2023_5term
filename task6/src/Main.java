import TemplateMethod.CityObject;
import TemplateMethod.House;
import TemplateMethod.Road;
import TemplateMethod.Shop;

public class Main {
    public static void main(String[] args) {
        CityObject house = new House();
        CityObject road = new Road();
        CityObject shop = new Shop();

        System.out.println("Отрисовка дома:");
        house.draw();

        System.out.println("\nОтрисовка дороги:");
        road.draw();

        System.out.println("\nОтрисовка магазина:");
        shop.draw();
    }
}
