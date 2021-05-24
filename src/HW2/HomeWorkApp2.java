package HW2;
/*1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
если да – вернуть true, в противном случае – false.
2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное.
Замечание: ноль считаем положительным числом.
3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
Если выполнение задач вызывает трудности, можете обратиться к последней странице методического пособия. Для задач со * не нужно искать решение в интернете,
иначе нет смысла их выполнять.
 */

public class HomeWorkApp2 {
    public static void main(String[] args) {
        printL(checkSumSign(10,2));
        compareNumbers(-1);
        printL(checkNumber(2));
        printString(3,"This is string");
        printL(checkYear(2001));
    }

    public static boolean checkSumSign(int a, int b) {
        boolean s = (((a + b) >=10) && (a + b) <=20);
        return s;
    }

    public static void compareNumbers(int a) {
        if (a >=0 ) {
            System.out.println("Положительное");
        } else System.out.println("отрицательное");
    }

    public static boolean checkNumber(int a) {
        if (a >=0 ) return false;
        return true;
    }

    public static void printString(int a, String l) {
        int i = 0;
        while (i < a) {
            System.out.println(l);
            i++;
        }
    }

    public static boolean checkYear(int a) {
        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) return true;
        return false;
    }

    public static void printL (boolean a){
        System.out.println(a);
    }
}
