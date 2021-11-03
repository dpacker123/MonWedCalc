package bsu.comp152.monwedcalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcWindow {
    private long firstNumber;
    private OperatorType operation;

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

    @FXML
    public void equalPressed(){
        var secondNumberText = numberField.getText();
        var secondNumber = Long.parseLong(secondNumberText);
        var result = 0.0;
        switch(operation){
            case Add -> result = secondNumber+firstNumber;
            case Subtract -> result = firstNumber - secondNumber;
            case Multiply -> result = firstNumber*secondNumber;
            case Divide -> result = (double)firstNumber/secondNumber; // forces it to be a double
        }
        numberField.setText(""+result); // turns it back into a string
    }

    @FXML
    public void plusPressed(){
       var numberAsText =  numberField.getText(); // grabbed test from number field
       firstNumber = Long.parseLong(numberAsText); // stored it as an int instead of string
       numberField.setText("");
       operation = OperatorType.Add;


    }

    @FXML
    public void subtractPressed(){
        var numberAsText =  numberField.getText(); // grabbed test from number field
        firstNumber = Long.parseLong(numberAsText); // stored it as an int instead of string
        numberField.setText("");
        operation = OperatorType.Subtract;
    }

    @FXML
    public void multiplyPressed(){
        var numberAsText =  numberField.getText(); // grabbed test from number field
        firstNumber = Long.parseLong(numberAsText); // stored it as an int instead of string
        numberField.setText("");
        operation = OperatorType.Multiply;
    }

    @FXML
    public void dividePressed(){
        var numberAsText =  numberField.getText(); // grabbed test from number field
        firstNumber = Long.parseLong(numberAsText); // stored it as an int instead of string
        numberField.setText("");
        operation = OperatorType.Divide;
    }


}
