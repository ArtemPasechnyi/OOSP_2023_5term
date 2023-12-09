package AbstractFactory;

class SeafoodPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Подготовка морской пиццы");
    }

    @Override
    public void bake() {
        System.out.println("Печь морскую пиццу");
    }

    @Override
    public void cut() {
        System.out.println("Разрезать морскую пиццу");
    }

    @Override
    public void box() {
        System.out.println("Упаковать морскую пиццу");
    }
}
