package HW6;
/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
Результатом выполнения действия будет печать в консоль.
 (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
 плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.
*/

public class Animal {
    protected int run;
    protected int sweem;
    protected String name;
    protected static int number;

    Animal (String _name, int _run, int _sweem){
        this.run = _run;
        this.sweem = _sweem;
        this.name = _name;
        number++;
    }

    void runAnimal (int dist){
        if (dist <= run){
            System.out.println(name + " пробежал/а " + dist + " м.");
        } else System.out.println(name + " не пробежал/а " + dist + " м.");
    }

    void swimmingAnimal(int dist){
        if (dist <= sweem){
            System.out.println(name + " проплыл/а " + dist + " м.");
        } else System.out.println(name + " не проплыл/а " + dist + " м.");
    }

    static int getNumber() {
        return number;
    }
}
