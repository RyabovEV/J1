package HW7;

public class Plate {
    private static int eatOnPlate;

    Plate(int _eatOnPlate){
        this.eatOnPlate = _eatOnPlate;
    }

    void setEatOnPlate(int _eatOnPlate) {
        this.eatOnPlate = _eatOnPlate;
    }

    void decreaseFood(int amount, Cat cat) {
        if (amount > eatOnPlate){
            cat.setFull(false);
        } else {
            eatOnPlate -=amount;
            cat.setFull(true);
        }
        cat.infoFull();
    }

    void info () {
        System.out.println("Еды на тарелке " + eatOnPlate);
    }
}
