package com.example.demo4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OutletmainController
{

    @FXML
    private AnchorPane ap;



    @FXML
    private Button closemain;


    @FXML
    private Button buyshirt1;


    @FXML
    private Button buyshirt2;




    @FXML
    private BorderPane bp;








    @FXML
    void Kidspage(MouseEvent event) {
        loadPage("Kids");
    }

    @FXML
    void Salepage(MouseEvent event) {
        loadPage("Sale");

    }

    @FXML
    void WomensPage(MouseEvent event) {

        loadPage("Womens");
    }

    @FXML
    void checkoutpage(MouseEvent event) {
        loadPage("checkout");
    }



    @FXML
    void Mens(MouseEvent event) {
        bp.setCenter(ap);

    }
    private void loadPage(String page) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(page + ".fxml"));
        } catch (IOException ex){
            Logger.getLogger(OutletmainController.class.getName()).log(Level.SEVERE,null,ex);
        }
            bp.setCenter(root);
        }

    @FXML
    void closemainscreen(ActionEvent event) {
        Stage stage = (Stage) closemain.getScene().getWindow();
        stage.close();

    }


    @FXML
    void buyshirt1onAction(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dressshirt.fxml"));
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(fxmlLoader.load(), 600, 442.0);
        stage.setTitle("Shirt1!");
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void buyshirt2onAction(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dressshirt2.fxml"));
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(fxmlLoader.load(), 600, 442.0);
        stage.setTitle("Shirt1!");
        stage.setScene(scene);
        stage.show();}







}




