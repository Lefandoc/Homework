package ru.geekbrains.homework6;

public class HomeWorkAppL6{
    public static void main(String[] args) {
        Cat kitty = new Cat("Mark", 4,2);
        Cat kitten = new Cat("Barsik", 5,2);
        Dog puppy = new Dog("Bully", 3);
//        Animal animals = new Animal();

        kitty.run(0);
        kitty.swim(3);
        kitten.run(300);

        puppy.run(600);
        puppy.swim(20);

        Animal.numberOfAnimals();
        Cat.checkCatAmount();
        Dog.checkDogAmount();
    }
}
