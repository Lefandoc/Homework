package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false; // 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void feedTheCat(Bowl bowl) {
        if (satiety) {
            System.out.printf("Кот %s сейчас не голоден!\n", name);
            return;
        }
//        2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
//        (например, в миске 10 еды, а кот пытается покушать 15-20).
//        Кот просто не будет кушать
        if (bowl.getFood() <= 0 || (bowl.getFood() - appetite) < 0) {
            System.out.printf("В миске пусто или мало корма! %s не может поесть\n", name);
            return;
        }
//        4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
//        то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
//        if ((bowl.getFood() - appetite) < 0) {
//            int left = appetite - bowl.getFood();
//            System.out.printf("%s поел, но все еще голоден! Нужно еще %d г. корма\n", name, left);
//            return;
//        }
        bowl.setFood((bowl.getFood() - appetite));
        System.out.printf("Вы покормили кота %s, в миске осталось %d г. корма\n", name, bowl.getFood());
        satiety = true;
        System.out.println(name + " теперь доволен и сыт");
    }


    public void info() {
        System.out.print("Имя кота: " + name);
        if (!satiety) {
            System.out.println(". Кот голоден");
        }
        if (satiety) {
            System.out.println(". Кот сыт!");
        }

    }
}
