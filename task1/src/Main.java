import Factory.Animal;
import Factory.AnimalFactory;
import Factory.AnimalsType;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal dog = animalFactory.createAnimal(AnimalsType.EDog);
        Animal cat = animalFactory.createAnimal(AnimalsType.ECat);
        Animal parrot = animalFactory.createAnimal(AnimalsType.EParrot);

        dog.makeSound();
        cat.makeSound();
        parrot.makeSound();
    }
}
