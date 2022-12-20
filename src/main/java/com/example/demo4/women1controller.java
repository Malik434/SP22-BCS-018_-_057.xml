package com.example.demo4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class women1controller
{

    @FXML
    private TextField addresslabel;

    @FXML
    private Label completionlabel;

    @FXML
    private Button exitbutton;

    @FXML
    private Button okbutton;

    @FXML
    void exitbuttononaction(ActionEvent event) {
        Stage stage = (Stage)exitbutton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void okbuttoonaction(ActionEvent event) {
        if (completionlabel.getText().isBlank() == false){

            completionlabel.setText("Your order is on the way! You may exit to continue shopping");

        }else  if (completionlabel.getText().isBlank()==true) {
            completionlabel.setText("please enter your address");
        }
    }

}
