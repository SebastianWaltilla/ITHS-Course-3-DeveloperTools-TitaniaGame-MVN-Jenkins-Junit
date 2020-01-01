package Buildings;

public class Homes extends BuildingsClass{

    int usedArea = super.numberOfHouses * 1;
    int maxArmies = super.numberOfHouses * 10;

    public Homes(int number) {
        super.numberOfHouses = number;
    }
    @Override
    public int getNumberOfHouses(){
        return super.numberOfHouses;
    }


    @Override
    public boolean buildBuilding(int gold){

        if (gold == 10){
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
