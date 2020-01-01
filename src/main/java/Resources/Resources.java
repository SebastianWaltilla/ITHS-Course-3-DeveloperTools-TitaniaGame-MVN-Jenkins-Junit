package Resources;

public class Resources {
    int guld;
    int teritory;
    int food;

    public Resources(int guld, int teritory, int food) {
        this.guld = guld;
        this.teritory = teritory;
        this.food = food;
    }

    public int getGuld() {
        return guld;
    }

    public void setGuld(int guld) {
        this.guld = guld;
    }

    public int getTeritory() {
        return teritory;
    }

    public void setTeritory(int teritory) {
        this.teritory = teritory;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
