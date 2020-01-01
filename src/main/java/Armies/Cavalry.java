package Armies;

public class Cavalry extends ArmiesClass {

    public Cavalry(int number){
        super.setNumberOfUnits(number);
        super.setATK(5);
        super.setDEF(5);
        super.setHP(10);
        super.setPrice(10);
    }

    @Override
    public int getNumberOfUnits() {
        return super.getNumberOfUnits();
    }

    public Cavalry() {
        super.setATK(5);
        super.setDEF(5);
        super.setHP(10);
        super.setPrice(10);
    }
}
