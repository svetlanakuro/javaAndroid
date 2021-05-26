package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int SIZE = 5;
    private static final int DOTS_TO_WIN = 4; // данное условие не реализовано
    private static final char DOT_EMPTY = '-';
    private static final char DOT_X = 'x';
    private static final char DOT_O = 'o';
    private static char[][] map;
    private static final Scanner sc = new Scanner(System.in);
    private static final Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (isWin(DOT_X)) {
                System.out.println("You won!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Is draw.");
            }
            aiTurn();
            printMap();
            if (isWin(DOT_O)) {
                System.out.println("Computer has won!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Is draw.");
            }
        }
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter the horizontal coordinate:");
            x = sc.nextInt() - 1;
            System.out.println("Enter the vertical coordinate:");
            y = sc.nextInt() - 1;
        } while (isCellInvalid(x, y));
        map[y][x] = DOT_X;
    }

    private static boolean isCellInvalid(int x, int y) {
        return (x < 0 || x >= SIZE) || (y < 0 || y >= SIZE) || map[y][x] != DOT_EMPTY;
    }

    private static boolean isWin(char dot) {
        return (checkLines(dot) || checkDiagonals(dot));
    }

    private static boolean checkLines(char dot) {
        boolean vertical, horizontal;
        for (int i = 0; i < SIZE; i++) {
            vertical = true;
            horizontal = true;
            for (int j = 0; j < SIZE; j++) {
                vertical &= (map[i][j] == dot);
                horizontal &= (map[j][i] == dot);
            }
            if (vertical || horizontal) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDiagonals(char dot) {
        int win = 0;
        boolean mainDiagonal, secondDiagonal;
        mainDiagonal = true;
        secondDiagonal = true;
        for (int i = 0; i < (SIZE); i++) {
            mainDiagonal &= (map[i][i] == dot);
            secondDiagonal &= (map[SIZE-i-1][i] == dot);
        }
        if (mainDiagonal || secondDiagonal) {
            return true;
        }
        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (isCellInvalid(x, y));
        System.out.printf("Computer go off to the point: %d %d\n", x + 1, y + 1);
        map[y][x] = DOT_O;
    }
}
