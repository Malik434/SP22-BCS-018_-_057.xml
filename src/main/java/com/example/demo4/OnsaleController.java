package com.example.demo4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class OnsaleController
{

    @FXML
    private Button buyonsale1;

    @FXML
    private Button buyonsale2;

    @FXML
    void buyonsale1onAction(ActionEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("OnSale1.fxml"));
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(fxmlLoader.load(), 600, 442.0);
        stage.setTitle("ONSALE!!");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void buyonsale2onAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("OnSale2.fxml"));
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(fxmlLoader.load(), 600, 442.0);
        stage.setTitle("OnSale2!");
        stage.setScene(scene);
        stage.show();

    }

}
