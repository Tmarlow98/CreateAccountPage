package sample;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;


public class Controller {


    @FXML private Text actiontarget;

    public void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
    }
}
