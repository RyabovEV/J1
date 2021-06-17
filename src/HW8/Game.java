package HW8;

import java.util.Random;
import java.util.Scanner;

public class Game {
    void game (){
        boolean win = false;
        String word = wordChoice();
        char[] charArr = word.toCharArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра угадай слово, пиши только маленькими буквами");
        int count = 0; // кол-во попыток отгадать
        do {
            System.out.println("Это слово " + wordBild(word, count));
            String str = scanner.nextLine();
            if (word.equals(str)) {
                System.out.println("как же ты хорош");
                win = true;
            } else if (count == charArr.length-1) {
                System.out.println("Буковки в слове закончились, конец игры");
                break;
            } else System.out.println("еще разок");
            count++;
        } while (!win);


    }

    String wordChoice(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        String word = words[random.nextInt(words.length)]; //слово для выигрыша
        return word;
    }

    String wordBild (String word, int count){
        String printWord = ""; // слово для подсказки
        for (int j = 0; j <= count; j++){
            printWord += word.charAt(j);
        }
        for (int i = 0; i < 15 - count; i++){
            printWord += "*";
        }
        return printWord;
    }
}
