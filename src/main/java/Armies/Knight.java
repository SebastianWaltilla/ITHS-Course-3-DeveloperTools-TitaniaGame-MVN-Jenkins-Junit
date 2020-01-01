package Armies;

public class Knight extends ArmiesClass {

    public Knight(int Units) {
        super.setNumberOfUnits(Units);
        super.setATK(3);
        super.setDEF(3);
        super.setHP(5);
        super.setPrice(5);


    }

    @Override
    public int getNumberOfUnits() {
        return super.getNumberOfUnits();
    }

    public Knight() {
        super.setATK(3);
        super.setDEF(3);
        super.setHP(5);
        super.setPrice(5);


    }
}
