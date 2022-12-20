package com.example.demo4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.ToggleButton;

public class SignupController {

    @FXML
    private PasswordField confirmpasswordtextfield;

    @FXML
    private Button exitbutton;

    @FXML
    private TextField firstnametextfield;

    @FXML
    private TextField lastnametextfield;


    @FXML
    private PasswordField passwordtextfield;

    @FXML
    private Button signupbutton;

    @FXML
    private Label signupbuttonlabel;

    @FXML
    private RadioButton termsandpolicies;

    @FXML
    private TextField usernametextfield;


    @FXML
    void exitbuttonOnAction(ActionEvent event) {
        Stage stage = (Stage) exitbutton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void signupbuttononAction(ActionEvent event) {


        if (firstnametextfield.getText().isBlank() == false && lastnametextfield.getText().isBlank() == false && usernametextfield.getText().isBlank() == false
                && passwordtextfield.getText().isBlank() == false && confirmpasswordtextfield.getText().isBlank() == false && termsandpolicies.isDisable() == false) {
            signupbuttonlabel.setText("You have successfully registered,Please exit and login to continue");

        } else if (firstnametextfield.getText().isBlank() == true && lastnametextfield.getText().isBlank() == false && usernametextfield.getText().isBlank() == false
                && passwordtextfield.getText().isBlank() == false && confirmpasswordtextfield.getText().isBlank() == false && termsandpolicies.isDisable() == false) {
            signupbuttonlabel.setText("please enter firstname");

        } else if (firstnametextfield.getText().isBlank() == false && lastnametextfield.getText().isBlank() == true && usernametextfield.getText().isBlank() == false
                && passwordtextfield.getText().isBlank() == false && confirmpasswordtextfield.getText().isBlank() == false && termsandpolicies.isDisable() == false) {
            signupbuttonlabel.setText("please enter lastname");

        } else if (firstnametextfield.getText().isBlank() == false && lastnametextfield.getText().isBlank() == false && usernametextfield.getText().isBlank() == true
                && passwordtextfield.getText().isBlank() == false && confirmpasswordtextfield.getText().isBlank() == false && termsandpolicies.isDisable() == false) {
            signupbuttonlabel.setText("please enter username");

        } else if (firstnametextfield.getText().isBlank() == false && lastnametextfield.getText().isBlank() == false && usernametextfield.getText().isBlank() == false
                && passwordtextfield.getText().isBlank() == true && confirmpasswordtextfield.getText().isBlank() == false && termsandpolicies.isDisable() == false) {
            signupbuttonlabel.setText("please enter password");
        } else if (firstnametextfield.getText().isBlank() == false && lastnametextfield.getText().isBlank() == false && usernametextfield.getText().isBlank() == false
                && passwordtextfield.getText().isBlank() == false && confirmpasswordtextfield.getText().isBlank() == true && termsandpolicies.isDisable() == false) {
            signupbuttonlabel.setText("please enter confirmpassword");
        } else if (firstnametextfield.getText().isBlank() == false && lastnametextfield.getText().isBlank() == false && usernametextfield.getText().isBlank() == false
                && passwordtextfield.getText().isBlank() == false && confirmpasswordtextfield.getText().isBlank() == false && termsandpolicies.isDisable() == true) {
            signupbuttonlabel.setText("Accept the privacy policies to continue ");
        } else if (firstnametextfield.getText().isBlank() == true && lastnametextfield.getText().isBlank() == true && usernametextfield.getText().isBlank() == true
                && passwordtextfield.getText().isBlank() == true && confirmpasswordtextfield.getText().isBlank() == true && termsandpolicies.isDisable() == true) {
            signupbuttonlabel.setText("PLease fill all the fields");

        }
    }
}