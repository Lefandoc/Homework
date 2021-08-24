package ru.geekbrains.homework6;

public class Cat extends Animal { // 1. Класс Кот с наследованием от класса Животное.

    private static int catAmount;
    private int clawLength;

    public Cat(String name, int age, int clawLength) {
        super(name,age);
//        this.name = name;
//        this.age = age;
        this.clawLength = clawLength;
        amount++;
        catAmount++;
    }

//    3. У каждого животного есть ограничения на действия (бег: 200 м., плавание: не умеет плавать)
    @Override
    public void run(int distance) {
        if (distance <= 200 && distance > 0) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else if (distance < 0) {
            System.out.println(name + " попятился назад");
        } else if (distance == 0) {
            System.out.println(name + " стоит на месте");
        } else {
            System.out.println(name + " пробежал 200 метров из " + distance + " и лег спать");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты, включая " + name + ", не умеют плавать!");
    }

    public void voice() {
        System.out.println();
        System.out.println("мурк");
    }

    public static void checkCatAmount () {
        System.out.println("Создано котов: " + catAmount);
    }
}
