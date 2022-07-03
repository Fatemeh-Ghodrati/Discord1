package discord.discord1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SignUpController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}