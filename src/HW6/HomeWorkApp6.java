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
public class HomeWorkApp6 {
    public static void main(String[] args) {
        Animal animal = new Animal("Чудо", 5000, 500);
        Cat cat = new Cat("Рик");
        Dog dog = new Dog("Морти");
        animal.runAnimal(1000);
        cat.runAnimal(10);
        dog.runAnimal(100);
        animal.swimmingAnimal(1000);
        cat.swimmingAnimal(10);
        dog.swimmingAnimal(100);
        System.out.println("Животных всего " + animal.getNumber());
    }
}