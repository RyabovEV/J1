package HW5;
/*1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4. Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);

5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
*/

public class HomeWorkApp5 {
    public static void main(String[] args) {
        Staff[] staffArr = new Staff[5];
        staffArr[0] = new Staff("Петров Василий Алексеевич", "директор", "petrov@mail.ru", "89125308585", 200000, 45);
        staffArr[1] = new Staff("Иванов Михаил Денисович", "водитель", "ivanov@mail.ru", "89125308586", 50000, 30);
        staffArr[2] = new Staff("Зайкина Василиса Васильевна", "секретарь", "zaika@mail.ru", "89125308587", 30000, 18);
        staffArr[3] = new Staff("Мишин Петр Алексеевич", "рабочий", "mishin@mail.ru", "89125308588", 13000, 50);
        staffArr[4] = new Staff("Васечкин Алексей Георгиевич", "менеджер", "vasechkin@mail.ru", "89125308589", 100000, 27);

        for (Staff key : staffArr) {
            if (key.getAge() > 40) {
                key.printStaff();
            }
        }
    }
}
