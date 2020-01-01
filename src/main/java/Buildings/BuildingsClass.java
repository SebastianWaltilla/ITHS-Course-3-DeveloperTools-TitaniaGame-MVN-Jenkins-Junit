package Buildings;

public class BuildingsClass implements Buildings {

    int numberOfHouses;

    @Override
    public int getNumberOfHouses(){
        return numberOfHouses;
    }

    public boolean buildBuilding(int gold){
    return true;
    }

    public boolean trainNewUnit(int gold){
        return true;
    }
    @Override
    public String buildingSQLString(){
        return "null";
    }


}
