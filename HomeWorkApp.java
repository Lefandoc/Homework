package ru.geekbrains.homework1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(getHypotenuseLength(3,4));
    }

//    2. Создайте метод printThreeWords(),
//    который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

//    3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
//    и инициализируйте их любыми значениями, которыми захотите.
//    Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
//    то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    public static void checkSumSign() {
        int a = 11;
        int b = 22;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

//    4. Создайте метод printColor() в теле которого задайте int переменную value и
//    инициализируйте ее любым значением. Если value меньше 0 (0 включительно),
//    то в консоль метод должен вывести сообщение “Красный”,
//    если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
//    если больше 100 (100 исключительно) - “Зеленый”;
    private static void printColor() {
        int value = 5;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

//    5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
//    и инициализируйте их любыми значениями, которыми захотите.
//    Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
//    в противном случае “a < b”;
    private static void compareNumbers() {
        int a = 7;
        int b = 9;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

//    6*. Написать метод:
//    public static double getHypotenuseLength(double a, double b)
//    который высчитывает длину гипотенузы треугольника и возвращает её.
//    Параметрами являются длины катетов. Вызовите метод, запишите результат в переменную и выведите его.
    public static double getHypotenuseLength(double a, double b) {
        double c = Math.pow(a, 2) + Math.pow(b, 2); // Возведение катетов a и b в квадарат и их сложение
        return Math.sqrt(c); // Квадратный корень из суммы квадратов катетов
    }

}

