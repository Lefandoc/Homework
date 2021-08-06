package ru.geekbrains.homework2;

public class HomeWorkAppL2 {
    public static void main(String[] args) {

        System.out.println(checkSum(10,3));
        checkNumberSign(0);
        System.out.println(isNegative(0));
        printLine("Java cool", 3);
        System.out.println(isLeapYear(1600));
    }

//  1. Написать метод, принимающий на вход два целых числа и проверяющий,
//  что их сумма лежит в пределах от 10 до 20 (включительно),
//  если да – вернуть true, в противном случае – false.
    public static boolean checkSum(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {
            return true;
        } else {
            return false;
        }
    }

//  2. Написать метод, которому в качестве параметра передается целое число,
//  метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//  Замечание: ноль считаем положительным числом.
    public static void checkNumberSign(int number) {
        if (number >= 0 ) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

//  3. Написать метод, которому в качестве параметра передается целое число.
//  Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isNegative(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

//  4. Написать метод, которому в качестве аргументов передается строка и число,
//  метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printLine(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

//  5. * Написать метод, который определяет, является ли год високосным,
//  и возвращает boolean (високосный - true, не високосный - false).
//  Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
