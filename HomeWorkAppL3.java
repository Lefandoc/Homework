package ru.geekbrains.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkAppL3 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] array1 = new int[10];
        fillArray(array1);
        System.out.print(Arrays.toString(array1) + "\n");
        replace(array1);
        System.out.print(Arrays.toString(array1) + "\n");
        System.out.println("Задание 2");
        fill1to100();
        System.out.println("Задание 3");
        int []array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        arrayMultiply(array3);
        System.out.print(Arrays.toString(array3) + "\n");
        System.out.println("Задание 4");
        int[][] array4 = new int[5][5];
        arrayFillDiagonal(array4);
        System.out.println("Задание 5");
        int[] array5 = createArray(3,2+2);
        System.out.println(Arrays.toString(array5));
        System.out.println("Задание 6*");
        int[] array6 = scanArray(5);
        System.out.println("Заданный массив: " + Arrays.toString(array6));
        arrayMaxAndMin(array6);

        System.out.println("Задание 7**");
        int[] array71 = {5,8,4,2,7,9,13,21,1};
        int[] array72 = {5,8,4,13,7,2,9,1,21};
        int[] array73 = {2,2,2,1,2,2,10,1};
        int[] array74 = {1,1,1,2,1};
        int[] array75 = {1,21,1,22,1};
        System.out.println(Arrays.toString(array71) + checkSum(array71));
        System.out.println(Arrays.toString(array72) + checkSum(array72));
        System.out.println(Arrays.toString(array73) + checkSum(array73));
        System.out.println(Arrays.toString(array74) + checkSum(array74));
        System.out.println(Arrays.toString(array75) + checkSum(array75));
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random()*1); // Наполнение массива 0 и 1
        }
    }

    public static int[] scanArray(int len) {
        int[] arr = new int[len];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значения элементов массива:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

//    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void replace(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

//    2. Задать пустой целочисленный массив длиной 100.
//    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void fill1to100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) { ;
            arr[i] = i + 1;
        }
        System.out.print(Arrays.toString(arr) + "\n");
    }

//    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//    и числа меньшие 6 умножить на 2;
    public static void arrayMultiply(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

//    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами
//    (можно только одну из диагоналей,если обе сложно).
//    Определить элементы одной из диагоналей можно по следующему принципу:
//    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void arrayFillDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j || j == (arr.length - 1) - i) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

//    5. Написать метод, принимающий на вход два аргумента: len и initialValue,
//    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

//    6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
    public static void arrayMaxAndMin(int[] arr) {
        int min = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        min = max;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

//    7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    public static boolean checkSum(int[] arr) {
        int sum = 0, k = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int halfSum = sum / 2;
        for (int i = 0; i < arr.length; i++) {
            if (k >= halfSum) {
                break;
            }
            k += arr[i];
        }
        if (k == halfSum) {
            return true;
        }
        return false;
    }
}
