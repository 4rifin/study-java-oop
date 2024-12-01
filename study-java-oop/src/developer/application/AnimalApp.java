package developer.application;

import developer.data.Animal;
import developer.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Katty";
        animal.eat();
    }

}
