package AbstractFactory;

class MeatPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Подготовка мясной пиццы");
    }

    @Override
    public void bake() {
        System.out.println("Печь мясную пиццу");
    }

    @Override
    public void cut() {
        System.out.println("Разрезать мясную пиццу");
    }

    @Override
    public void box() {
        System.out.println("Упаковать мясную пиццу");
    }
}
