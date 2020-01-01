package Buildings;

public class KnightTrainingGround extends Farmhouse {

    int usedArea =  super.numberOfHouses * 3;

    public KnightTrainingGround(int number) {
        super.numberOfHouses = number;
    }

    @Override
    public int getNumberOfHouses(){
        return super.numberOfHouses;
    }


    @Override
    public boolean trainNewUnit(int gold){
        if (gold == 10){
            return true;
        }else
            return false;
    }

    @Override
    public boolean buildBuilding(int gold){

        if (gold == 25){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String buildingSQLString(){
        return "null";                          // skriv rätt sträng för SQL inmatning vid sparning.
    }
}
