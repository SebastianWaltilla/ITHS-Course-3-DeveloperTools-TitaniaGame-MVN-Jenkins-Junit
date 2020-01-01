module Game{
    requires javafx.controls;
    requires javafx.fxml;
    opens Game to javafx.graphics, javafx.fxml;
}