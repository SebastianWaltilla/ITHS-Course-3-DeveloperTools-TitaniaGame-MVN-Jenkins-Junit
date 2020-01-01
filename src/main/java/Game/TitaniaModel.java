package Game;
import Player.CreatePlayer;
import Player.PlayerData;
import World.Map;
import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TitaniaModel {

    private SimpleStringProperty TextArea = new SimpleStringProperty();
    private PlayerData player;
    private Map map;
    private ArrayList<String> textBoxStringList = new ArrayList<String>();


    public TitaniaModel() {
        this.player = new PlayerData("DefaultPlayer", "DefaultPassword", "orc");
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public ArrayList<String> getTextBoxStringList() {
        return textBoxStringList;
    }

    public void setTextBoxStringList(ArrayList<String> textBoxStringList) {
        this.textBoxStringList = textBoxStringList;
    }

    public String getTextArea() {
        return TextArea.get();
    }

    public SimpleStringProperty textAreaProperty() {
        return TextArea;
    }

    public void setTextArea(String textArea) {
        this.TextArea.set(textArea);
    }

    public PlayerData getPlayer() {
        return player;
    }

    public void setPlayer(PlayerData player) {
        this.player = player;
    }


}
