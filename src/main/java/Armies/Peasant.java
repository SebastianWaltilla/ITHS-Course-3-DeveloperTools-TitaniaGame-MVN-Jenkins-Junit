package Armies;

public class Peasant extends ArmiesClass {


    public Peasant(int numberUnits) {
        super.setNumberOfUnits(numberUnits);
        super.setATK(1);
        super.setDEF(1);
        super.setHP(1);
        super.setPrice(3);
    }

    @Override
    public int getNumberOfUnits() {
        return super.getNumberOfUnits();
    }

    public Peasant() {
        super.setATK(1);
        super.setDEF(1);
        super.setHP(1);
        super.setPrice(3);
    }
}
