package bsu.comp152.monwedcalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcWindow {
    @FXML
    private TextField numberField;

    @FXML
    public void numberButtonPressed(ActionEvent event){
        var pressedButton = (Button)event.getSource(); // this gets the number of the button that is displayyed on the btton
        var buttonText = pressedButton.getText(); // this whole little bundle of code
        var currentNumberText = numberField.getText();
        numberField.setText(currentNumberText+buttonText);

    }

    @FXML
    public void clearButtonPressed(){
        numberField.clear();
    }
}
