package Armies;

public class ArmiesClass implements Armies {

    private int HP,ATK,DEF,Price, NumberOfUnits;

    public String armiesSQLString(){
        return "null";
    }

    @Override
    public int getNumberOfUnits() {
        return NumberOfUnits;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        NumberOfUnits = numberOfUnits;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }
}
