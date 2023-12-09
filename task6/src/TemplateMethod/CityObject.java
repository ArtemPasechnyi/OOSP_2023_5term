package TemplateMethod;

public abstract class CityObject {
    public final void draw() {
        drawBase();
        drawSpecific();
        drawOverlay();
    }

    private void drawBase() {
        System.out.println("Отрисовка базовых элементов объекта");
    }

    protected abstract void drawSpecific();

    private void drawOverlay() {
        System.out.println("Добавление оверлея к объекту");
    }
}