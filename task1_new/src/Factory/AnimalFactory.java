package Factory;

import Animals.Cat;
import Animals.Dog;
import Animals.Parrot;

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
