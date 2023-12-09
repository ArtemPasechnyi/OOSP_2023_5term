package TemplateMethod;

public class Shop extends CityObject {
    @Override
    protected void drawSpecific() {
        System.out.println("Отрисовка магазина");
    }
}
