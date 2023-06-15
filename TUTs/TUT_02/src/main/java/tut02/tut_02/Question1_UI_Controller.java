package tut02.tut_02;

//import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Question1_UI_Controller {

    @FXML
    private Label displayText;

    @FXML
    private TextField userInput;

    @FXML
    void clickMeButtonClick() {
        String text = userInput.getText();
        displayText.setText(text);
        displayText.setStyle("-fx-font-size: 30px; -fx-text-fill: blue; -fx-font-weight: bold; -fx-background-color: white; -fx-alignment: center;");
    }

    @FXML
    void clearButtonClick() {
        displayText.setText("");
        userInput.setText("");
    }

}
