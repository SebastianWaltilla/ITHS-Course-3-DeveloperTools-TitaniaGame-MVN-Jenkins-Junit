package Buildings;

public class Farmhouse extends BuildingsClass {

   int usedArea = super.numberOfHouses * 1;

    public Farmhouse(int number) {
        super.numberOfHouses = number;
    }

    @Override
    public int getNumberOfHouses(){
        return super.numberOfHouses;
    }


    public Farmhouse() {
    }

    @Override
    public boolean trainNewUnit(int gold){
        if (gold == 7){
            return true;
        }else
            return false;
    }

    @Override
    public boolean buildBuilding(int gold){

        if (gold == 20){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String buildingSQLString(){
        return "null";                          // skriv rätt sträng för SQL inmatning.
    }

}
