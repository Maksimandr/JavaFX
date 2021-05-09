package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextArea mainTextArea;
    @FXML
    TextField sendMessageTextField;

    public void sendBtnClicked(ActionEvent actionEvent) {
        mainTextArea.setText(mainTextArea.getText() + sendMessageTextField.getText() + "\n");
        sendMessageTextField.setText(null);
    }
}
