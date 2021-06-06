package HW5;
public class Staff {
    private String name;
    private String profession;
    private String email;
    private String phone;
    private int price;
    private int age;

    Staff (String _name, String _profession, String _email, String _phone, int _price, int _age) {
        this.name = _name;
        this.profession = _profession;
        this.email = _email;
        this.phone = _phone;
        this.price = _price;
        this.age = _age;
    }

    int getAge() {
        return age;
    }

    void printStaff() {
        System.out.println(
                "ФИО: " + this.name +
                        " Должность: " + this.profession +
                        " email: " + this.email +
                        " телефон: " + this.phone +
                        " зарплата: " + this.price +
                        " возраст: " + this.age
        );
    }
}
