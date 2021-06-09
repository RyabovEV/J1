package HW3;

import java.util.Random;

/*
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
если в массиве есть место, в котором сумма левой и правой части массива равны.
**Примеры:
checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
Для усложнения задачи нельзя пользоваться вспомогательными массивами.
Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
Если выполнение задач вызывает трудности, можете обратиться к последней странице методического пособия. Для задач со * не нужно искать решение в интернете, иначе нет смысла их выполнять.
 */
public class HomeWorkApp3 {
    public static void main(String[] args) {
        changeArr();
        createArr();
        increaseArr();
        doubleArr();
        printArr(arrLength(5,15));
        maxAndMinArr();
        System.out.println(checkBalance(randomArr(5,8)));
        changeArr((randomArr(5,8)),-2);
    }

    public static void changeArr() {
        int[] arr = randomArr(2,8);
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
        printArr(arr);
    }

    public static void createArr() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        printArr(arr);
    }

    public static void increaseArr () {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] *= 2;
            }
        }
        printArr(arr);
    }

    public static void doubleArr () {
        int[][] arr = new int[5][5];
        int w = 1;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if ((i == j) || (j == arr.length-w)) {
                    arr[i][j] = 1;
                } else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            w++;
            System.out.println();
        }
    }

    public static int[] arrLength(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int randNum (int a){
        Random random = new Random();
        int number = random.nextInt(a);
        System.out.println(number);
        return number;
    }

    public static int[] randomArr (int a,int b){
        int[] arr =new int[b];
        for (int i = 0; i < arr.length; i++){
            arr[i] = randNum(a);
        }
        return arr;
    }

    public static void maxAndMinArr(){
        int[] arr = randomArr(10,8);
        int max,min;
        max = min = arr[0];
        System.out.println("Исходный массив");
        printArr(arr);
        for (int i = 0; i < arr.length; i++){
           if (arr[i] > max) max = arr[i];
           if (arr[i] < min) min = arr[i];
        }
        System.out.println("MAX = " + max);
        System.out.println("MIN = " + min);
    }

    public static boolean checkBalance (int[] arr){
        int sum1 = 0;
        int sum2;
        System.out.println("Исходный массив");
        printArr(arr);
        for (int i = 0; i < arr.length; i++){
            sum1 += arr[i];
            sum2 = 0;
            for (int j = arr.length - 1; j > i; j--){
                sum2 += arr[j];
            }
            if (sum1 == sum2){
                System.out.println("SUM2 = " + sum2);
                System.out.println("SUM1 = " + sum1);
                return true;
            }
        }
        return false;
    }

    public static void changeArr (int arr[], int a) {
        int t = 0;
        int first, last;
        System.out.println("Исходный массив");
        printArr(arr);
        do {
            first = arr[0];
            last = arr[arr.length - 1];
            if (a > 0) {
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = last;
            } else {
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = first;
            }
        t++;
        } while (t < Math.abs(a));
        System.out.println("Конечный массив");
        printArr(arr);
    }
}
