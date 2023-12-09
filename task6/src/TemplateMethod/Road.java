package TemplateMethod;

public class Road extends CityObject {
    @Override
    protected void drawSpecific() {
        System.out.println("Отрисовка дороги");
    }
}
