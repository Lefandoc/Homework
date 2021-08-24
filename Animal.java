package ru.geekbrains.homework6;

public class Animal {
    protected String name;
    protected int age;
    protected static int amount;

//    Конструктор для возможности создания объекта animals в main.
//     protected Animal() {} // upd: Не требуется при использовании статического метода.


    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    2. Все животные могут бежать и плыть.
//    В качестве параметра каждому методу передается длина препятствия.
//    Результатом выполнения действия будет печать в консоль.
    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " метров");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " метров");
    }

    public static void numberOfAnimals () {
        System.out.println("Всего создано " + amount + " животных");
    }
}
