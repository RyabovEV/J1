package HW7;

public class Cat {
    private String name;
    private int eating;
    private boolean full = false;

    Cat(String _name, int _eating){
        this.name = _name;
        this.eating = _eating;
    }

    void eat(Plate plate, Cat cat){
        plate.decreaseFood(eating,cat);
    }

    void setFull(boolean _full) {
        this.full = _full;
    }


    void infoFull () {
        System.out.print(name + " ");
        if(full) {
            System.out.println("сыт");
        } else System.out.println("голоден");
    }
}
