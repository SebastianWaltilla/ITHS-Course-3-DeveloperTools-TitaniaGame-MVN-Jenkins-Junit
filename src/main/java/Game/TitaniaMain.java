package Game;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TitaniaMain extends Application {

    private TitaniaController titaniaController;
    private Stage primStage;

    public static void main(String[] args) {
    launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/file.fxml"));
        TitaniaModel titaniamodel = new TitaniaModel();
        loader.setControllerFactory(params -> new TitaniaController(titaniamodel));
        Parent root = loader.load();
        titaniaController = loader.getController();
        primStage = primaryStage;
        primaryStage.setTitle("TITANIA - Local Multiplater Textbased Fantasy Strategy Game");
        primaryStage.setScene(new Scene (root));
        primaryStage.setResizable(false);
        primaryStage.show();


    }
}
