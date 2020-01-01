package Game;
import Player.CreatePlayer;
import Player.PlayerData;
import SQLconnectionTransaction.LoadPlayerFromSQL;
import SQLconnectionTransaction.SendNewPlayerToSQL;
import UserInterface.MenuText;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class TitaniaController {
    EventHandlerPlayer eventPlayer;
    EventHandlerTime eventTime;
    MenuText menuText;
    TitaniaModel titaniaModel;
    Stage stage;

    @FXML
    TextArea TextBox;
    @FXML
    TextField IP;
    @FXML
    TextArea playerStats;
    @FXML
    TextField ActionInput;
    @FXML
    Button Button1;
    @FXML
    Button Button2;
    @FXML
    ListView<String> listView;

    String IPAndPort;

    public void initialize() {
    TextBox.setText("First enter IP and Port number ,  " + "\n" +"then press the \"send IP \" button" + "\n" +
            "Then write \"1\" in textfield \"Enter playerinput here\" to start." );
    }

    public TitaniaController(TitaniaModel model) {
    this.titaniaModel =  model;
    }

    public void SendPlayerInputToGame(){
        System.out.println(menuText.playerStats(titaniaModel.getPlayer()));

        String input = ActionInput.getText();
        titaniaModel.getTextBoxStringList().add(input);
        ActionInput.clear();
        TextBox.appendText("\n" + input);
        // Visar playerstats i rutan.


        playerStats.setText("hej"); //  menuText.playerStats(titaniaModel.getPlayer())
        playerChoise(input);
    }

    public void SendIPInputToGame() {
        String input = IP.getText();
        IPAndPort = input;
        IP.clear();
    }


    public void playerChoise(String input){


    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void run(){
        // PlayerData a = new PlayerData("e", "f", "orc"); // use for testing
        // new MenuText().playerStats(a); // use for testing
        menuText.StartMenu();

        boolean stop = true;
        while(stop){
            switch (GetInput.getInputInt()){
                // Create new player
                case 1: PlayerData newPlayer = CreatePlayer.createPlayer();
                        titaniaModel.setPlayer(newPlayer);
                        SendNewPlayerToSQL.save(newPlayer);
                        play();
                        break;
                // Load player from MS SQL
                case 2:
                        //PlayerData player = LoadPlayerFromSQL.load();
                      //  titaniaModel.setPlayer(player);
                        menuText.StartMenu();
                        play();
                       break;
                case 3: menuText.helpText();
                        break;
                case 4: stop = true;// exit
                        break;
            }
        }
    }

    public void play(){
    }


}
