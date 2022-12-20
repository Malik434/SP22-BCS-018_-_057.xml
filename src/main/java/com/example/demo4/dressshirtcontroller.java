package com.example.demo4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class dressshirtcontroller {

    @FXML
    private Button Okbutton;


    @FXML
    private Button exit;



    @FXML
    private TextField addressslabel;

    @FXML
    private Label orderacceptlabel;

    @FXML
    void okbuttononaction(ActionEvent event) {

        if (addressslabel.getText().isBlank() == false){

            orderacceptlabel.setText("Your order is on the way! You may exit to continue shopping");

        }else {
            orderacceptlabel.setText("please enter your address");
        }

    }
    @FXML
    void exitonaction(ActionEvent event) {
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();

    }

}
