package discord.discord1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class profileSettings implements Initializable {
    @FXML
    private Button logOutButton;






    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
    @FXML
    void changePassword(MouseEvent event) {


    }
    @FXML
    void logout(MouseEvent event){
        UIRequest uiRequest=new UIRequest(UIRequestCode.LOG_OUT);
        try {
            Client.process(uiRequest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Stage stage= (Stage) logOutButton.getScene().getWindow();
        Parent root= null;
        try {
            root = FXMLLoader.load(getClass().getResource("idk.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(new Scene(root));
    }

}
