package HW4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {

        public static char[][] map; // поле игры
        public static final int SIZE = 3; // размер поля
        public static final int CHIP = 3; // кол-во символов в цепочке для выигрыша

        public static final char DOT_EMPTY = '.'; // пустое значенгие поля
        public static final char DOT_X = 'X'; // символ игрока
        public static final char DOT_O = 'O'; // символ противника

        public static void main(String[] args) {
            initMap();
            printMap();

            while (true) {
                humanTurn();
                printMap();
                if (isWinner(DOT_X)) {
                    System.out.println("Победил игрок");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();
                printMap();
                if (isWinner(DOT_O)) {
                    System.out.println("Победил противник");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
        }

        public static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        public static void printMap() {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void humanTurn() {
            Scanner scanner = new Scanner(System.in);
            int x;
            int y;
            do {
                System.out.println("Введите значения ячейки X Y");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
            } while (isCellInvalid(x, y));

            map[y][x] = DOT_X;
        }

        public static void aiTurn() {
            Random random = new Random();

            int x;
            int y;

            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (isCellInvalid(x, y));

            System.out.println("Противник выбрал " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }

        public static boolean isCellInvalid(int x, int y) {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                return true;
            }

            if (map[y][x] == DOT_EMPTY) {
                return false;
            }

            return true;
        }

    public static boolean isWinner (char s) {
        int gorizontal;
        int vertical;
        int diagonal1 = 0;
        int diagonal2 = 0;
        int w = 1;
        for (int i = 0; i < map.length; i++){
            gorizontal = 0;
            vertical = 0;
            for (int j = 0; j < map.length; j++){
                if (map[i][j] == s) {
                    gorizontal++;
                } else if ((j != (SIZE-1)) && (j != 0) && gorizontal > 0) gorizontal--;
                if (map[i][j] == s && j == map.length-w) {
                    diagonal1++;
                } else if ((i != (SIZE-1)) && (i != 0) && j == map.length-w) diagonal1--;
                if (map[i][j] == s && i == j) {
                    diagonal2++;
                } else if ((i != (SIZE-1)) && (i != 0) && i == j) diagonal2--;
                if (map[j][i] == s){
                    vertical++;
                } else if ((j != (SIZE - 1)) && (j != 0) && vertical > 0) vertical--;
            }
            if (gorizontal == CHIP || diagonal1 == CHIP || diagonal2 == CHIP || vertical == CHIP) return true;
            w++;
        }
        return false;
    }

        /*public static boolean isWinner(char symb) {
            if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) {
                return true;
            }
            if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) {
                return true;
            }
            if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) {
                return true;
            }

            if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) {
                return true;
            }
            if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) {
                return true;
            }
            if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) {
                return true;
            }

            if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) {
                return true;
            }
            if (map[0][2] == symb && map[1][1] == symb && map[2][0] == symb) {
                return true;
            }

            return false;
        }*/

        public static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

