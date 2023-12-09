package Factory;

import Factory.Animals.Cat;
import Factory.Animals.Dog;
import Factory.Animals.Parrot;

public class AnimalFactory {
    public Animal createAnimal(AnimalsType animalType) {
        return switch (animalType) {
            case EDog -> new Dog();
            case ECat -> new Cat();
            case EParrot -> new Parrot();
            default -> null;
        };
    }
}
