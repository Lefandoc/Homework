package ru.geekbrains.lesson7;

public class Bowl {
    int food;

    public Bowl(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.printf("В миске %d г. корма\n\n", food);
    }

//    6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    public void addFood(int feed) {
        this.food += feed;
        System.out.printf("В миску положили %d г. корма\n", feed);
        info();
    }
}
