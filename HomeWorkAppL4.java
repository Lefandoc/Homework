package ru.geekbrains.homework4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkAppL4 {
    private static char[][] map;
    private static Scanner scan;
    private static Random rnd;

    private static final int SIZE = 3;

    private static final char MAP_ELEMENT_EMPTY = '_';
    private static final char MAP_ELEMENT_X = 'X';
    private static final char MAP_ELEMENT_0 = '0';

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        rnd = new Random();
        initMap();
        printMap();
        while (true) {
            playerTurn();
            printMap();
            if (checkWin(MAP_ELEMENT_X)) {
                System.out.println("Победил игрок!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Игра окончена - ничья!");
                break;
            }
            botTurn();
            printMap();
            if (checkWin(MAP_ELEMENT_0)) {
                System.out.println("Победил бот!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Игра окончена - ничья!");
                break;
            }
        }

    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = MAP_ELEMENT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("  " + (i + 1));
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isMoveValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE || map[x][y] != MAP_ELEMENT_EMPTY) {
            return false;
        }
        return true;
    }

    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты хода X, затем Y:");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;

            if (!isMoveValid(x,y)) {
                System.out.println("Недопустимый ход!");
            }
        } while (!isMoveValid(x,y));
        map[x][y] = MAP_ELEMENT_X;
    }

    public static void botTurn() {
        int x, y;

        do {
            x = rnd.nextInt(SIZE);
            y = rnd.nextInt(SIZE);

            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 1; j++) {
                    if (map[i][j] == MAP_ELEMENT_X && map[i][j + 2] == MAP_ELEMENT_X) {
                        x = i; // если Х в левом верхнем и правом верхнем углах
                        y = j + 1; // ставит 0 между ними
                        if (!isMoveValid(x,y)) {
                            x = rnd.nextInt(SIZE);
                            y = rnd.nextInt(SIZE);
                        }
                    }
                    if (map[i][j] == MAP_ELEMENT_X && map[i + 2][j] == MAP_ELEMENT_X) {
                        x = i + 1; // если X в левом верхнем и левом нижнем углах
                        y = j; // ставит 0 между ними
                        if (!isMoveValid(x,y)) {
                            x = rnd.nextInt(SIZE);
                            y = rnd.nextInt(SIZE);
                        }
                    }
                    if (map[i+2][j] == MAP_ELEMENT_X && map[i + 2][j + 2] == MAP_ELEMENT_X) {
                        x = i + 2; // если Х в левом нижнем и правом нижнем углах
                        y = j + 1; // ставит 0 между ними
                        if (!isMoveValid(x,y)) {
                            x = rnd.nextInt(SIZE);
                            y = rnd.nextInt(SIZE);
                        }
                    }
                    if (map[i][j] == MAP_ELEMENT_X && map[i + 2][j + 2] == MAP_ELEMENT_X) {
                        x = i + 1; // если X в левом верхнем и правом нижнем углах
                        y = j + 1; // ставит 0 между ними
                        if (!isMoveValid(x,y)) {
                            x = rnd.nextInt(SIZE);
                            y = rnd.nextInt(SIZE);
                        }
                    }
                    if (map[i+2][j+2] == MAP_ELEMENT_X && map[i][j + 2] == MAP_ELEMENT_X) {
                        x = i + 1; // если X в левом нижнем и правом верхнем углах
                        y = j + 1; // ставит 0 между ними
                        if (!isMoveValid(x,y)) {
                            x = rnd.nextInt(SIZE);
                            y = rnd.nextInt(SIZE);
                        }
                    }
                    if (map[i][j + 2] == MAP_ELEMENT_X && map[i + 2][j + 2] == MAP_ELEMENT_X) {
                        x = i + 1; // есди Х в правом врехнем и правом нижнем углах
                        y = j + 2; // ставит 0 между ними
                        if (!isMoveValid(x,y)) {
                            x = rnd.nextInt(SIZE);
                            y = rnd.nextInt(SIZE);
                        }
                    }

                }
            }

        } while (!isMoveValid(x,y));
        System.out.println("Ход бота: " + (x + 1) + "," + (y + 1));
        map[x][y] = MAP_ELEMENT_0;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == MAP_ELEMENT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char element) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < 1; j++) {
                if (map[i][j] == element && map[i][j + 1] == element && map[i][j + 2] == element) {
                    return true; // победы по горизонталям
                }
            }
        }
       for (int i = 0; i < 1; i++) {
           for (int j = 0; j < SIZE; j++) {
               if (map[i][j] == element && map[i+1][j] == element && map[i+2][j] == element) {
                   return true; // победы по вертикалям
               }
           }
       }
       for (int i = 0; i < 1; i++) {
           for (int j = 0; j < 1; j++) {
               if (map[i][j] == element && map[i+1][j+1] == element && map[i+2][j+2] == element) {
                   return true; // победа по диагонали
               }
           }
       }
        for (int i = 2; i > 1; i--) {
            for (int j = 2; j > 1; j--) {
                if (map[i][j-2] == element && map[i-1][j-1] == element && map[i-2][j] == element) {
                    return true; // победа по обратной диагонали
                }
            }
        }
        return false;
    }
}
