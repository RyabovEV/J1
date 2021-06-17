package HW8;

import java.util.Random;
import java.util.Scanner;

/*
Повторить построение графического приложения с урока.
*** (в консоли) Создать массив из слов String[] words = {"apple", "orange", "lemon",
 "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
 "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
 "pepper", "pineapple", "pumpkin", "potato"}; При запуске программы компьютер загадывает слово,
 запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
 Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно, можно пользоваться:
String str = "apple";
str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово
Используем только маленькие буквы
 */
public class HomeWorkApp8 {
    public static void main(String[] args) {
        new MyWindow();
        new Game().game();
    }
}
