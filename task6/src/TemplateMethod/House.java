package TemplateMethod;

public class House extends CityObject {
    @Override
    protected void drawSpecific() {
        System.out.println("Отрисовка дома");
    }
}
