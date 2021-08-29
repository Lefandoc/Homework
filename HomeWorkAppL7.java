package ru.geekbrains.lesson7;

public class HomeWorkAppL7 {
    public static void main(String[] args) {
        Bowl bowl1 = new Bowl(5);
        Cat cat = new Cat("Boris", 15);

        cat.info();
        bowl1.info();
        cat.feedTheCat(bowl1);
//        bowl1.info();
        bowl1.addFood(50);
//        bowl1.info();
        cat.info();

//        5. Создать массив котов и тарелку с едой,
//        попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
        Cat[] cats =  {
                new Cat("Barsik", 10),  new Cat("Marquis", 20),
                new Cat("Marta", 30), new Cat("Bounty", 15)
        };
        Bowl bowl2 = new Bowl(0);
        bowl2.addFood(55);
//        for (int i = 0; i < cats.length; i++) {
//            cats[i].feedTheCat(bowl2);
//            System.out.println();
//            for (int j = 0; j < cats.length; j++) {
//                if (i == cats.length - 1) {
//                    cats[j].info();
//                }
//            }
//        }

        for (Cat cat1 : cats) {
            cat1.feedTheCat(bowl2);
            System.out.println();
        }
        for (Cat cat1: cats) {
            cat1.info();
        }
    }
}
