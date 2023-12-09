package AbstractFactory;

class VegetarianPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Подготовка вегетарианской пиццы");
    }

    @Override
    public void bake() {
        System.out.println("Печь вегетарианскую пиццу");
    }

    @Override
    public void cut() {
        System.out.println("Разрезать вегетарианскую пиццу");
    }

    @Override
    public void box() {
        System.out.println("Упаковать вегетарианскую пиццу");
    }
}
