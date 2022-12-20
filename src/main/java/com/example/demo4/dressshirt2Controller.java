package com.example.demo4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class dressshirt2Controller {

    @FXML
    private TextField address;

    @FXML
    private Label CompletionLabel;

    @FXML
    private Button Exitbutton;

    @FXML
    private Button Okbutton;

    @FXML
    void ExitbuttonOnaction(ActionEvent event) {

        Stage stage = (Stage) Exitbutton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void OkbuttonOnAction(ActionEvent event) {
        if (address.getText().isBlank() == false){

           CompletionLabel.setText("Your order is on the way! You may exit to continue shopping");

        }else  if (address.getText().isBlank()==true) {
            CompletionLabel.setText("please enter your address");
        }

    }

}
