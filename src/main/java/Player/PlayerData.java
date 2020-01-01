package Player;
import Armies.*;
import Buildings.*;
import Resources.Resources;
import java.util.ArrayList;
import java.util.List;

public class PlayerData {
    private String name,password,race;
    private Resources resources;
    private List<Armies> armies = new ArrayList<Armies>();
    private List<Buildings> buildings = new ArrayList<Buildings>();

    // vid skapande av spelare
    public PlayerData(String name, String password, String race) {

        this.name = name;
        this.password = password;
        this.race = race;

        this.resources = new Resources(10, 50, 15);   // gold, territory    (land(notUsed)),food(notused?)

        this.armies.add(new Peasant(10));
        this.armies.add(new Knight(5));
        this.armies.add(new Cavalry(0));

        this.buildings.add(new Farmhouse(2));
        this.buildings.add(new KnightTrainingGround(1));
        this.buildings.add(new Homes(2));
        this.buildings.add(new CavalryTrainingGround(0));
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Resources getResources() {
        return this.resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public List<Armies> getArmies() {
        return this.armies;
    }

    public void setArmies(List<Armies> armies) {
        this.armies = armies;
    }

    public List<Buildings> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Buildings> buildings) {
        this.buildings = buildings;
    }
}
