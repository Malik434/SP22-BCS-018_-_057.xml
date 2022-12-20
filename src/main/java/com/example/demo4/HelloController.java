package com.example.demo4;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;


import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage ;
import javafx.stage.StageStyle;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class HelloController {


    private Stage stage;
    private Scene scene;

    @FXML
    private Button CancelButton;
    @FXML
    private Button Signupbutton;
    @FXML
    private Label LogInLabeltext;
    @FXML
    private Button LoginButton;

    @FXML
    private PasswordField passwordTextfield;


    @FXML
    private TextField usernametextfield;


    @FXML
    void CancelButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) CancelButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void LoginButtononAction(ActionEvent event) throws IOException {

        if (usernametextfield.getText().isBlank() == false && passwordTextfield.getText().isBlank() == false) {

           LogInLabeltext.setText("You Logged in Successfully");
            Parent root = FXMLLoader.load(getClass().getResource("OutletMain.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();


        } else if (usernametextfield.getText().isBlank() == true && passwordTextfield.getText().isBlank() == true){
            LogInLabeltext.setText("Please enter username and Password");

        }

    }

    @FXML
    void signupbuttonOnAction(ActionEvent event) throws IOException {

        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Signup.fxml"));
            Parent root1 = fxmlLoader.load();

            Scene scene = new Scene(root1);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setTitle("Signup window");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println("CANT LOAD NEW WINDOW");
        }
    }

    public void validatedlogin() {
        DatabaseConnection conectnow = new DatabaseConnection();
        Connection connectdb = conectnow.getconnection();

        String verifyLogin = "SELECT count(1) FROM user_account WHERE username='" + usernametextfield.getText() + " 'AND PASSWORD=" + passwordTextfield.getText() + "'";

        try {

            Statement statement = connectdb.createStatement();
            ResultSet queryResult= statement.executeQuery(verifyLogin);


            while(queryResult.next()){
                if(queryResult.getInt(1)==1){
                    LogInLabeltext.setText("CONGRATULATIONS");

                }else {
                    LogInLabeltext.setText("INVALID LOGIN");

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }
}

//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Signup.fxml"));
//        Parent root = fxmlLoader.load();
//        Stage stage = new Stage();
//        stage.initStyle(StageStyle.UNDECORATED);
//        stage.setOpacity(1);
//        stage.setTitle("My New Stage Title");
//        stage.setScene(new Scene(root, 600, 563));
//        stage.showAndWait();
//        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Signup.fxml")); // create and load() view
//        Stage stage = (Stage) Signupbutton.getScene().getWindow();
//        Scene registerscene = new Scene(loader.getRoot());
//        stage.setScene(registerscene);
//        stage.showAndWait();















