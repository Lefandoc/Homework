package ru.geekbrains.homework6;

public class Dog extends Animal { // 1. Класс Собака с наследованием от класса Животное.
    public static int dogAmount;

    public Dog(String name, int age) {
        super(name, age);
//        this.name = name;
//        this.age = age;
        amount += 1;
        dogAmount += 1;
    }

//    3. У каждого животного есть ограничения на действия (бег: 500 м., плавание: 10 м.)
    @Override
    public void run(int distance) {
        if (distance <= 500 && distance > 0) {
            System.out.println(name + " пробежал " + distance + "метров");
            return;
        }
        if (distance < 0) {
            System.out.println(name + " попятился назад");
            return;
        }
        if (distance == 0) {
            System.out.println(name + " стоит на месте");
            return;
        }
        System.out.println(name + " пробежал 500 метров из " + distance + " и выдохся");
//        if (distance <= 500 && distance > 0) {
//            System.out.println(name + " пробежал " + distance + " метров");
//        } else if (distance < 0) {
//            System.out.println(name + " попятился назад");
//        } else if (distance == 0) {
//            System.out.println(name + " стоит на месте");
//        } else {
//            System.out.println(name + " пробежал 500 метров из " + distance + " и выдохся");
//        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println(name + " не сможет проплыть столько!");
            return;
        }
        if (distance < 0) {
            System.out.println(name + " не умеет плавать задом!");
            return;
        }
        if (distance == 0) {
            System.out.println(name + " держится на плаву");
            return;
        }
        System.out.println(name + " проплыл " + distance + " метров");
//        if (distance > 10) {
//            System.out.println(name + " не сможет проплыть столько!");
//        } else if (distance < 0) {
//            System.out.println(name + "не умеет плавать задом!");
//        } else if (distance == 0) {
//            System.out.println(name + " держится на плаву");
//        } else {
//            System.out.println(name + " проплыл " + distance + " метров");
//        }
    }

    public static void checkDogAmount() {
        System.out.println("Создано собак: " + dogAmount);
    }
}
